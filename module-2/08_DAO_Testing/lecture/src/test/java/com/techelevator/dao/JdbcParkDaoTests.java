package com.techelevator.dao;

import com.techelevator.model.Park;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDaoTests extends BaseDaoTests {

    private static final Park PARK_1 =
            new Park(1, "Park 1", LocalDate.parse("1800-01-02"), 100, true);
    private static final Park PARK_2 =
            new Park(2, "Park 2", LocalDate.parse("1900-12-31"), 200, false);
    private static final Park PARK_3 =
            new Park(3, "Park 3", LocalDate.parse("2000-06-15"), 300, false);

    private JdbcParkDao sut;

    Park testPark = new Park(-1, "TestPark", LocalDate.parse("1984-01-01"), 999, true);


    @Before
    public void setup() {
        sut = new JdbcParkDao(dataSource);
    }

    @Test
    public void getPark_returns_correct_park_for_id() {
        //Arrange

        //Act
        Park result = sut.getPark(1);

        //Assert
        assertParksMatch(PARK_1, result);

        //Act
        Park result2 = sut.getPark(2);
        //Assert
        assertParksMatch(PARK_2, result2);


    }

    public void assertParksMatch(Park expected, Park actual) {
        Assert.assertEquals(expected.getParkId(), actual.getParkId());
        Assert.assertEquals(expected.getParkName(), actual.getParkName());
        Assert.assertEquals(expected.getArea(), actual.getArea(), .001);
        Assert.assertEquals(expected.getDateEstablished(), actual.getDateEstablished());
        Assert.assertEquals(expected.getHasCamping(), actual.getHasCamping());
    }

    @Test
    public void getPark_returns_null_when_id_not_found() {

        //Arrange
        //Act
        Park result = sut.getPark(100);
        //Assert
        Assert.assertNull(result);



    }

    @Test
    public void getParksByState_returns_all_parks_for_state_AA() {

        //Arrange
        List<Park> parks = new ArrayList<>();
        //Act
        parks = sut.getParksByState("AA");
        //Assert
        Assert.assertEquals(2, parks.size());
        assertParksMatch(PARK_1, parks.get(0));
        assertParksMatch(PARK_3, parks.get(1));

    }

    @Test
    public void getParksByState_returns_all_parks_for_state_BB() {

        //Arrange
        List<Park> parks = new ArrayList<>();
        //Act
        parks = sut.getParksByState("BB");
        //Assert
        Assert.assertEquals(1, parks.size());
        assertParksMatch(PARK_2, parks.get(0));

    }

    @Test
    public void getParksByState_returns_empty_list_for_abbreviation_not_in_db() {

        //Arrange
        List<Park> parks = new ArrayList<>();
        //Act
        parks = sut.getParksByState("ZZ");
        //Assert
        Assert.assertEquals(0, parks.size());




    }

    @Test
    public void createPark_returns_park_with_id_and_expected_values() {


        Park createdPark = sut.createPark(testPark);
        testPark.setParkId(createdPark.getParkId());

        assertParksMatch(testPark, createdPark);

    }

    @Test
    public void created_park_has_expected_values_when_retrieved() {

        //Arrange
        Park createdPark = sut.createPark(testPark);
        //Act
        Integer newId = createdPark.getParkId();
        Park retrievedPark = sut.getPark(newId);
        //Assert
        assertParksMatch(createdPark, retrievedPark);

    }

    @Test
    public void updated_park_has_expected_values_when_retrieved() {

        Park parkToUpdate = sut.getPark(1);

        parkToUpdate.setParkName("Updated");
        parkToUpdate.setArea(99);
        parkToUpdate.setHasCamping(true);
        parkToUpdate.setDateEstablished(LocalDate.of(1995,01,21));

        sut.updatePark(parkToUpdate);

        Park retrievedPark = sut.getPark(1);
        assertParksMatch(parkToUpdate, retrievedPark);

    }

    @Test
    public void deleted_park_cant_be_retrieved() {

        sut.deletePark(1);

        Park retrievedPark = sut.getPark(1);
        Assert.assertNull(retrievedPark);

        List<Park> parks = sut.getParksByState("AA");
        Assert.assertEquals(1, parks.size());
        assertParksMatch(PARK_3, parks.get(0));

    }

    @Test
    public void park_added_to_state_is_in_list_of_parks_by_state() {



    }

    @Test
    public void park_removed_from_state_is_not_in_list_of_parks_by_state() {




    }


}
