package com.example.tp5.controller;

import com.example.tp5.consumingREST.ConsumingRest;
import com.example.tp5.consumingREST.geo.ResponseAddress;
import com.example.tp5.consumingREST.openweathermap.ResponseOpenWeatherMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MeteoController {

    @PostMapping("/meteo")
    public String MeteoSubmit(@RequestParam String address, Model model) throws Exception {
        ResponseAddress responseAddress = ConsumingRest.fetchAddress(address);
        model.addAttribute("address", responseAddress.getFeatures().get(0).getProperties().getLabel());
        double[] coordonnates = responseAddress.getFeatures().get(0).getGeometry().getCoordinates();
        ResponseOpenWeatherMap responseOpenWeatherMap = ConsumingRest.fetchWeather(coordonnates[1], coordonnates[0]);
        model.addAttribute("meteo", responseOpenWeatherMap.getMain().getTemp());
        return "meteo";
    }
}
