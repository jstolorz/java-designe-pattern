package com.bluesoft.designepatterns.creational.singleton;

class LazyRegistryWithDCL {

    private static volatile LazyRegistryWithDCL LAZY_REGISTRY_WITH_DCL;

    private LazyRegistryWithDCL(){}

    public static LazyRegistryWithDCL getInstance(){

        if(LAZY_REGISTRY_WITH_DCL == null){
            synchronized (LazyRegistryWithDCL.class){
                if(LAZY_REGISTRY_WITH_DCL == null){
                    LAZY_REGISTRY_WITH_DCL = new LazyRegistryWithDCL();
                }
            }
        }

        return LAZY_REGISTRY_WITH_DCL;
    }
}
