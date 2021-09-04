package com.bluesoft.designepatterns.creational.abstractfactory;

class S3Storage implements Storage {

    S3Storage(int capacityInMib){
        //Use aws s3 api
        System.out.println("Allocated " + capacityInMib + " on s3");
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}
