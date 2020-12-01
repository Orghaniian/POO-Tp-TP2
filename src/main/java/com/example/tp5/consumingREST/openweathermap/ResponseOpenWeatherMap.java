package com.example.tp5.consumingREST.openweathermap;

import java.util.ArrayList;

// classe generée avec https://codebeautify.org/json-to-java-converter puis adaptée à mes besoins
public class ResponseOpenWeatherMap {
    private ArrayList < Weather > weather = new ArrayList < Weather > ();
    private Main MainObject;
    private float visibility;
    private Wind WindObject;
    private Clouds CloudsObject;


    // Getter Methods

    public Main getMain() {
        return MainObject;
    }

    public float getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return WindObject;
    }

    public Clouds getClouds() {
        return CloudsObject;
    }

    // Setter Methods

    public void setMain(Main mainObject) {
        this.MainObject = mainObject;
    }

    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }

    public void setWind(Wind windObject) {
        this.WindObject = windObject;
    }

    public void setClouds(Clouds cloudsObject) {
        this.CloudsObject = cloudsObject;
    }

    @Override
    public String toString() {
        return "ResponseOpenWeatherMap{" +
                "weather=" + weather +
                ", MainObject=" + MainObject +
                ", visibility=" + visibility +
                ", WindObject=" + WindObject +
                ", CloudsObject=" + CloudsObject +
                '}';
    }
}

