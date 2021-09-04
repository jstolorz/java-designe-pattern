package com.bluesoft.designepatterns.creational.abstractfactory;

class GoogleCloudStorage implements Storage {

    GoogleCloudStorage(int capacityInMib){
        //Use gcp api
        System.out.println("Allocated " + capacityInMib + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }


    @Override
    public String toString() {
        return "Google cloud storage";
    }
}
