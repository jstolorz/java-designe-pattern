package com.bluesoft.designepatterns.creational.builder;

import java.time.LocalDate;

class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO userDTO = directBuild(builder,user);
        System.out.println(userDTO);

        User userRest = createUser();
        UserDTO dto = directBuild(UserRestDTO.getBuilder(),user);

        System.out.println(dto);

    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user){
        final UserDTO userDTO = builder
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
        return userDTO;
    }

    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipcode("47998");
        user.setAddress(address);
        return user;
    }

}
