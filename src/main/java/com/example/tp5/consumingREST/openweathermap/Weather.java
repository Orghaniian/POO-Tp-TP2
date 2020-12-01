package com.example.tp5.consumingREST.openweathermap;

// classe generée avec https://codebeautify.org/json-to-java-converter
public class Weather {
    private float id;
    private String main;
    private String description;
    private String icon;


    // Getter Methods

    public float getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", main='" + main + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
