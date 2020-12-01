package com.example.tp5.consumingREST.geo;

import java.util.List;

public class ResponseAddress {
    private List<Feature> features;

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "Response{" +
                "features=" + features +
                '}';
    }
}
