package com.bluesoft.designepatterns.creational.singleton;

class EagerRegistry {

    private static final EagerRegistry EAGER_REGISTRY = new EagerRegistry();

    private EagerRegistry(){}

    public static EagerRegistry getInstance(){
        return EAGER_REGISTRY;
    }
}
