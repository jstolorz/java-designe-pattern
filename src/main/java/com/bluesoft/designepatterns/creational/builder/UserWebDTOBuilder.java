package com.bluesoft.designepatterns.creational.builder;

import java.time.LocalDate;
import java.time.Period;

class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(final String fname) {
        firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(final String lname) {
        lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(final LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(final Address address) {
        this.address =  String.format("%s %s %s %s %s \n",
                address.getHouseNumber(),
                address.getStreet(),
                address.getCity(),
                address.getState(),
                address.getZipcode());
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName + " " + lastName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
