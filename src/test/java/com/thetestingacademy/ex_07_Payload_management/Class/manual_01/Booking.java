package com.thetestingacademy.ex_07_Payload_management.Class.manual_01;

public class Booking {

    private String firstname;
    private String lastname;
    private Integer totalprice;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public String getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(String bookingdates) {
        this.bookingdates = bookingdates;
    }

    private Boolean depositpaid;
    private String additionalneeds;
    private String bookingdates;

}
