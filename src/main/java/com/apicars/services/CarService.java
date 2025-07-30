package com.apicars.services;

import com.apicars.dto.CarDTO;
import com.apicars.entities.CarEntity;
import com.apicars.mappers.CarMapper;
import com.apicars.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public CarService(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    public List<CarDTO> listCars(String brand) {
        List<CarEntity> cars = carRepository.findAllByBrand(brand);
        return carMapper.toDTOList(cars);
    }
}