package com.bluesoft.designepatterns.creational.abstractfactory;

interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int capMib);
}
