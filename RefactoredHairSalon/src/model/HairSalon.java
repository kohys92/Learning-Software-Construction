package model;

import java.util.ArrayList;

public class HairSalon {

//    private ArrayList<Customer> bookings;
    private BookingManager bookingManager;
    private SpecialistSuggester specialistSuggester = new SpecialistSuggester();

    // EFFECTS: creates a hair salon with available booking times from 0-17hrs.
    public HairSalon(){
        bookingManager = new BookingManager();
    }

    // MODIFIES: this and Customer
    // EFFECTS: books the customer into the requested timeslot if it is a valid timeslot,
    //          and lets the Customer know the booking time.
    public boolean makeNewBooking(Customer c, int bookingTime, Treatment treatment){
        return bookingManager.makeNewBooking(c, bookingTime, treatment);
    }

    public boolean cancelBooking(Customer c, int bookingTime, Treatment treatment){
        return bookingManager.cancelBooking(c, bookingTime, treatment);
    }

    // EFFECTS: prints out all the bookings.  If the time has not been booked, prints "available"
    public void printBookingsList(){
        bookingManager.printBookingsList();
    }

    // EFFECTS: returns true if the customer is found at the booking time.
    public boolean verifyBooking(Customer c, int bookingTime){
        return bookingManager.verifyBooking(c, bookingTime);
    }

    // EFFECTS: returns true if the customer is booked at the booking time
    public boolean confirmBookedName(String cName, int bookingTime){
        return bookingManager.confirmBookedName(cName, bookingTime);
    }


    // MODIFIES: this and Customer
    // EFFECTS:  changes the customer booked in the bookings, and let's the Customer know the new booking time.
    public void changeBooking(Customer customer, int newTime){
        bookingManager.changeBooking(customer, newTime);
    }

    private boolean checkBookingTimeValidity(int bookingTime, Treatment treatment) {
        return bookingManager.checkBookingTimeValidity(bookingTime, treatment);
    }

    public ArrayList<String> suggestConsultant(Treatment treatment) {
        return specialistSuggester.suggestConsultant(treatment);
    }
}