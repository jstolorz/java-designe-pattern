package com.bluesoft.designepatterns.creational.builder;

class UserWebDTO implements UserDTO {

    private String name;
    private String address;
    private String age;


    UserWebDTO(final String name, final String address, final String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "UserWebDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
