package com.bluesoft.designepatterns.creational.abstractfactory;

class Client {

    private final ResourceFactory factory;

    Client(final ResourceFactory factory) {
        this.factory = factory;
    }

    Instance createServer(Instance.Capacity capacity, int storageMib){
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
         Client aws = new Client(new AwsResourceFactory());
         Instance i1 = aws.createServer(Instance.Capacity.micro, 20);
         i1.start();
         i1.stop();
         System.out.println(i1);
    }
}
