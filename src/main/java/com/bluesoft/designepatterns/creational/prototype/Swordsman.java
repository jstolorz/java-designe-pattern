package com.bluesoft.designepatterns.creational.prototype;

class Swordsman extends GameUnit{
    private String state = "idle";

    public void attack(){
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return "Swordsman{" +
                "state='" + state + '\'' +
                '}';
    }

    @Override
    protected void reset() {
       this.state = "idle";
    }
}
