package com.bluesoft.designepatterns.creational.objectpool;

import javafx.geometry.Point2D;

class Bitmap implements Image {

    private Point2D location;
    private String name;

    Bitmap(final String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + name + " @ " + location);
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(final Point2D location) {
         this.location = location;
    }

    @Override
    public void reset() {
        this.location = Point2D.ZERO;
        System.out.println("Bitmap is reset");
    }
}
