package com.example.tp5.consumingREST;

import com.example.tp5.consumingREST.geo.ResponseAddress;
import com.example.tp5.consumingREST.openweathermap.ResponseOpenWeatherMap;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class ConsumingRest {
    private final static String apiKey = "75fc5ee8b7b1b66ca7a543164c52d70d"; // clé de rechange: "434a28dd340e75797d7733e857068ad6"

    @Bean
    public static ResponseAddress fetchAddress(String address) {
        return new RestTemplate().getForObject(
                "https://api-adresse.data.gouv.fr/search/?limit=1&q=" + address, ResponseAddress.class);
    }

    @Bean
    public static ResponseOpenWeatherMap fetchWeather(double lat, double lon){
            return new RestTemplate().getForObject(
                    "http://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon + "&appid=" + apiKey + "&units=metric", ResponseOpenWeatherMap.class);
    }
}
