package com.easemytrip.testcases;

import base.Base;
import com.easemytrip.page.FlightBookingPage;
import com.easemytrip.page.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class FlightBooking_Test extends Base {



    FlightBookingPage flights;
    
    @BeforeMethod
    public void browserSetup() throws IOException {
        flights = new FlightBookingPage();
        flights.setup();
    }

    @Test
    public void flightPageIsPresent() {
        boolean flightPage = flights.flightPageIsPresent();
        Assert.assertTrue(flightPage);
    }

    @Test
    public void oneWayTripIsPresent(){
        boolean oneWayTrip = flights.oneWayTripIsPresentAndEnabled();
        Assert.assertTrue(oneWayTrip);
    }

    @Test
    public void roundTripIsPresent() {
        boolean roundTrip = flights.roundTripIsPresentAndEnabled();
        Assert.assertTrue(roundTrip);
    }

    @Test
    public void multiCityIsPresent() {
        boolean multiCity = flights.multiCityIsPresentAndEnabled();
        Assert.assertTrue(multiCity);
    }

    @Test
    public void searchAvailableFlights() {
        boolean flightsAvailable = flights.searchFlightsAvailable();
        Assert.assertTrue(flightsAvailable);
    }

    @Test
    public void bookingFlight() {
        flights.searchFlightsAvailable();
        boolean book = flights.bookFlight();
        Assert.assertTrue(book);
    }

    @Test
    public void booking() {
        flights.searchFlightsAvailable();
        boolean bookingFlight = flights.booking();
        Assert.assertTrue(bookingFlight);
    }

    @Test
    public void travelerInsuranceIsPresent() {
        flights.searchFlightsAvailable();
        flights.booking();
        boolean travelerInsurance = flights.travelerInsuranceIsPresent();
        Assert.assertTrue(travelerInsurance);
    }

    @Test
    public void travelerEmailIsPresent() {
        flights.searchFlightsAvailable();
        flights.booking();
        boolean travelerEmail = flights.travelerEmailIsPresent();
        Assert.assertTrue(travelerEmail);
    }

    @Test
    public void bookingButtonIsPresent() {
        flights.searchFlightsAvailable();
        flights.booking();
        boolean bookingButton = flights.bookingButtonIsPresent();
        Assert.assertTrue(bookingButton);
    }
    @Test
    public void reviewFlight() {
        flights.searchFlightsAvailable();
        flights.booking();
        boolean flightReview = flights.reviewFlight();
        Assert.assertTrue(flightReview);
    }

    @Test
    public void passengerDetailsIsPresent() {
        flights.searchFlightsAvailable();
        flights.booking();
        flights.reviewFlight();
        boolean passengerDetails = flights.passengerDetailsIsPresent();
        Assert.assertTrue(passengerDetails);
    }

    @Test
    public void continueBookingIsPresent() {
        flights.searchFlightsAvailable();
        flights.booking();
        flights.reviewFlight();
        boolean continueBooking = flights.continueBookingIsPresent();
        Assert.assertTrue(continueBooking);
    }
    @Test
    public void continueBooking() throws InterruptedException {
        flights.searchFlightsAvailable();
        flights.booking();
        flights.reviewFlight();
        flights.continueBooking();

    }
    @Test
    public void paymentMethods() throws InterruptedException {
        flights.searchFlightsAvailable();
        flights.booking();
        flights.reviewFlight();
        flights.continueBooking();
        Thread.sleep(3000);
        boolean methodsToPay =  flights.paymentMethodIsPresent();
        Assert.assertTrue(methodsToPay);
        System.out.println("Payment Successful");
        Thread.sleep(3000);
    }


    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

