package com.bluesoft.designepatterns.creational.abstractfactory;

// Represents an abstract product
interface Instance {
    enum Capacity{micro, small, large}
    void start();
    void attachStorage(Storage storage);
    void stop();
}
