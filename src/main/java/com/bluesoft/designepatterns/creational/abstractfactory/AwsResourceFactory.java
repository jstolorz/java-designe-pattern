package com.bluesoft.designepatterns.creational.abstractfactory;

class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(final Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(final int capMib) {
        return new S3Storage(capMib);
    }
}
