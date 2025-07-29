package com.apicars.services;

import com.apicars.dto.CarDTO;
import com.apicars.entities.CarEntity;
import com.apicars.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public List<CarDTO> listCars(String brand) {
        List<CarEntity> cars = carRepository.findAllByBrand(brand);

        return null;
    }
}