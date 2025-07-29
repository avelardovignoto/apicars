package com.apicars.controllers;

import com.apicars.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;
}
