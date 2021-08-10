package com.bluesoft.designepatterns.creational.prototype;

class General extends GameUnit{

    private String state = "idle";

    public void boostMorale(){
        this.state = "MoraleBoost";
    }

    @Override
    public String toString() {
        return "General{" +
                "state='" + state + '\'' +
                '}';
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException();
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }
}
