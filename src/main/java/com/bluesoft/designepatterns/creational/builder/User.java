package com.bluesoft.designepatterns.creational.builder;

import java.time.LocalDate;

class User {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;

    String getFirstName() {
        return firstName;
    }

    void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    LocalDate getBirthday() {
        return birthday;
    }

    void setBirthday(final LocalDate birthday) {
        this.birthday = birthday;
    }

    Address getAddress() {
        return address;
    }

    void setAddress(final Address address) {
        this.address = address;
    }
}
