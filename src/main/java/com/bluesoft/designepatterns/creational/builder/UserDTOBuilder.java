package com.bluesoft.designepatterns.creational.builder;

import java.time.LocalDate;

interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String fname);
    UserDTOBuilder withLastName(String lname);
    UserDTOBuilder withBirthday(LocalDate date);
    UserDTOBuilder withAddress(Address address);
    UserDTO build();
    UserDTO getUserDTO();

}
