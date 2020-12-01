package com.example.tp5.consumingREST.geo;

public class Feature {
    private Geometry geometry;
    private Properties properties;

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Feature{" +
                "geometry=" + geometry +
                ", properties=" + properties +
                '}';
    }
}
