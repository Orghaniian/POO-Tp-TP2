package com.example.tp5.consumingREST.geo;

public class Properties {
    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "label='" + label + '\'' +
                '}';
    }
}
