package com.bluesoft.designepatterns.creational.builder;

import java.time.LocalDate;
import java.time.Period;

class UserRestDTO implements UserDTO {

    private String name;
    private String address;
    private String age;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getAge() {
        return age;
    }

    private void setName(final String name) {
        this.name = name;
    }

    private void setAddress(final String address) {
        this.address = address;
    }

    private void setAge(final String age) {
        this.age = age;
    }

    public static UserRestDTOBuilder getBuilder(){
        return new UserRestDTOBuilder();
    }

    public static class UserRestDTOBuilder implements UserDTOBuilder{

        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserRestDTO dto;

        public UserRestDTOBuilder withFirstName(final String fname) {
            firstName = fname;
            return this;
        }


        public UserRestDTOBuilder withLastName(final String lname) {
            lastName = lname;
            return this;
        }


        public UserRestDTOBuilder withBirthday(final LocalDate date) {
            Period ageInYears = Period.between(date, LocalDate.now());
            age = Integer.toString(ageInYears.getYears());
            return this;
        }


        public UserRestDTOBuilder withAddress(final Address address) {
            this.address =  String.format("%s %s %s %s %s \n",
                    address.getHouseNumber(),
                    address.getStreet(),
                    address.getCity(),
                    address.getState(),
                    address.getZipcode());
            return this;
        }


        public UserDTO build() {

            this.dto = new UserRestDTO();
            dto.setName(firstName + " " + lastName);
            dto.setAddress(address);
            dto.setAge(age);
            return dto;
        }


        public UserDTO getUserDTO() {
            return dto;
        }
    }

    @Override
    public String toString() {
        return "UserRestDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
