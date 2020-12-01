package com.example.tp5.consumingREST.geo;

import java.util.Arrays;

public class Geometry {
    //private Coordinates coordinates;

    private double[] coordinates;

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Geometry{" +
                "coordinates=" + Arrays.toString(coordinates) +
                '}';
    }
}
