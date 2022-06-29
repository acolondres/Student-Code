package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    
    private JdbcTimesheetDao sut;
    private Timesheet testSheet;

    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet time = sut.getTimesheet(9000);
        Assert.assertNull(time);
    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet time = sut.getTimesheet(9000);
        Assert.assertNull(time);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {

        List<Timesheet> time = sut.getTimesheetsByEmployeeId(1);
        Assert.assertEquals(1, time.size());



    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> time = sut.getTimesheetsByProjectId(2);
        Assert.assertEquals(2, time.size());

    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {

        Timesheet createdTS = sut.createTimesheet(new Timesheet());

        Integer newId = createdTS.getTimesheetId();
        Assert.assertTrue(newId > 0);

    }
    

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet createTime = sut.createTimesheet(testSheet);
        createTime.setBillable(true);
        createTime.setDescription("apples");
        createTime.setHoursWorked(23.50);

        sut.createTimesheet(createTime);
        Timesheet retrievedTimeSheet = sut.getTimesheet(3);
        assertTimesheetsMatch(createTime, retrievedTimeSheet);
    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet timeSheetUpdate = sut.getTimesheet(3);
        timeSheetUpdate.setBillable(true);
        timeSheetUpdate.setDescription("apples");
        timeSheetUpdate.setHoursWorked(23.50);

        sut.updateTimesheet(timeSheetUpdate);
        Timesheet retrievedTimeSheet = sut.getTimesheet(3);
        assertTimesheetsMatch(timeSheetUpdate, retrievedTimeSheet);
    }


    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        sut.deleteTimesheet(4);

        Timesheet retrievedSheet = sut.getTimesheet(4);
        Assert.assertNull(retrievedSheet);

    }



    @Test
    public void getBillableHours_returns_correct_total() {
        Assert.fail();
    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
