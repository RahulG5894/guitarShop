package org.example;

public class GuitarSpec {
    private String builder, model, type, backWood, topWood;
    private int numString;

    public GuitarSpec(String builder, String model, String type, String backWood, String topWood, int numString) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numString = numString;
    }

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public int getNumString() {
        return numString;
    }

    @Override
    public String toString() {
        return "GuitarSpec{" +
                "builder='" + builder + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", backWood='" + backWood + '\'' +
                ", topWood='" + topWood + '\'' +
                ", numString=" + numString +
                '}';
    }

    public boolean matches(GuitarSpec spec) {
        if(!builder.equals(spec.getBuilder()))
            return false;
        if(model!=null && !model.equals("") && !model.equalsIgnoreCase(spec.getModel()))
            return false;
        if(!type.equals(spec.getType()))
            return false;
        if(!backWood.equals(spec.getBackWood()))
            return false;
        if(!topWood.equals(spec.getTopWood()))
            return false;
        if(numString != spec.getNumString())
            return false;
        return true;
    }
}
