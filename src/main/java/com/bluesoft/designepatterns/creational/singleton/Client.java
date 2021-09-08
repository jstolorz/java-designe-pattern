package com.bluesoft.designepatterns.creational.singleton;

class Client {
    public static void main(String[] args) {

        EagerRegistry registry = EagerRegistry.getInstance();

        System.out.println(registry);

        EagerRegistry registry2 = EagerRegistry.getInstance();

        System.out.println(registry2);

        LazyRegistryWithDCL lazyRegistryWithDCL = LazyRegistryWithDCL.getInstance();

        System.out.println(lazyRegistryWithDCL);

        LazyRegistryWithDCL lazyRegistryWithDCL2 = LazyRegistryWithDCL.getInstance();

        System.out.println(lazyRegistryWithDCL2);

    }
}
