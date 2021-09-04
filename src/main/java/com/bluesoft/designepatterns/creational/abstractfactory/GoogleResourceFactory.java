package com.bluesoft.designepatterns.creational.abstractfactory;

class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(final Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(final int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
