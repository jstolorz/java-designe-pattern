package com.bluesoft.designepatterns.creational.singleton;

class LazyRegistryIODH {

    private LazyRegistryIODH(){}

    private static class RegistryHolder {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance(){
        return RegistryHolder.INSTANCE;
    }

}
