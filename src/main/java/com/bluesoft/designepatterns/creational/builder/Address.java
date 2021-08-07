package com.bluesoft.designepatterns.creational.builder;

class Address {
    private String houseNumber;
    private String  street;
    private String city;
    private String zipcode;
    private String state;

    String getHouseNumber() {
        return houseNumber;
    }

    void setHouseNumber(final String houseNumber) {
        this.houseNumber = houseNumber;
    }

    String getStreet() {
        return street;
    }

    void setStreet(final String street) {
        this.street = street;
    }

    String getCity() {
        return city;
    }

    void setCity(final String city) {
        this.city = city;
    }

    String getZipcode() {
        return zipcode;
    }

    void setZipcode(final String zipcode) {
        this.zipcode = zipcode;
    }

    String getState() {
        return state;
    }

    void setState(final String state) {
        this.state = state;
    }
}
