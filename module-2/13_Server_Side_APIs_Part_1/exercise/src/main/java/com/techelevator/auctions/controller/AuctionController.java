package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDao();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Auction> list() {
        return dao.list();
    }

    @RequestMapping(path="/{id}", method=RequestMethod.GET)
    public Auction findAuction(@PathVariable int id) {
        return dao.get(id);
    }

   /*  @RequestMapping(method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction) {
        return auction;
    } */

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public List<Auction> searchByTitle(@RequestParam(name="title_like", required=false, value = "") String title_like) {
        return dao.searchByTitle("");
    }

    @RequestMapping( value = "", method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction) {
        return dao.create(auction);
    }





}


