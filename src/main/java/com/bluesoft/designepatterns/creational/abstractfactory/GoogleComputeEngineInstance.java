package com.bluesoft.designepatterns.creational.abstractfactory;

// Represents a concrete product in a family "Google Cloud Platform"
class GoogleComputeEngineInstance implements Instance {

    GoogleComputeEngineInstance(Capacity capacity){
        // Map capacity to GCP compute instance type. Use GCP API to provision
        System.out.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Compute engine instance started");
    }

    @Override
    public void attachStorage(final Storage storage) {
        System.out.println("Attached " + storage + " to Compute engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Compute engine instance stopped");
    }

    @Override
    public String toString() {
        return "GoogleComputeEngineInstance";
    }
}
