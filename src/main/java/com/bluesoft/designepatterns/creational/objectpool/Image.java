package com.bluesoft.designepatterns.creational.objectpool;


import javafx.geometry.Point2D;

interface Image extends Poolable {
    void draw();
    Point2D getLocation();
    void setLocation(Point2D location);
}
