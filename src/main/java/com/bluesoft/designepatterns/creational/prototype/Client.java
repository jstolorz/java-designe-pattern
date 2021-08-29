package com.bluesoft.designepatterns.creational.prototype;

import javafx.geometry.Point3D;

class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10,0,0),20);
        s1.attack();

        System.out.println(s1);

        Swordsman s2 = (Swordsman)s1.clone();

        System.out.println(s2);

        General general = new General();
        general.move(new Point3D(-20,0,0),30);
        general.boostMorale();

        System.out.println(general);

        General general1 = (General)general.clone();



    }
}
