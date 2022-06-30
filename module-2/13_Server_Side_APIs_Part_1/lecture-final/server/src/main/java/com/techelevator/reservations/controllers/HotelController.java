package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDao.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {

        return hotelDao.get(id);
    }

    @RequestMapping(path = "/reservations", method= RequestMethod.GET)
    public List<Reservation> listReservations() {
        return reservationDao.findAll();
    }

    @RequestMapping(path="/reservations/{id}", method=RequestMethod.GET)
    public Reservation findReservation(@PathVariable int id) {
        return reservationDao.get(id);
    }

    @RequestMapping(path ="/hotels/{id}/reservations", method=RequestMethod.GET)
    public List<Reservation> findReservationsByHotel(@PathVariable("id") int hotelId){
        return reservationDao.findByHotel(hotelId);
    }

    @RequestMapping(path="/reservations", method=RequestMethod.POST)
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationDao.create(reservation, reservation.getHotelId());
    }

    //  /hotels/filter?state=OH&city=Columbus
    @RequestMapping(path="/hotels/filter", method=RequestMethod.GET)
    public List<Hotel> filterByStateAndCity(@RequestParam String state, @RequestParam(value="city", defaultValue = "Morbtown", required=false) String cityToSearch) {

        List<Hotel> allHotels = hotelDao.list();
        List<Hotel> filteredHotels = new ArrayList<>();

        for(Hotel hotel : allHotels) {

            if(cityToSearch != null) {
                if(hotel.getAddress().getCity().equalsIgnoreCase(cityToSearch)) {
                    filteredHotels.add(hotel);
                }
            } else {
                if(hotel.getAddress().getState().equalsIgnoreCase(state)){
                    filteredHotels.add(hotel);
                }
            }

        }

        return filteredHotels;
    }
}
