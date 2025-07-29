package com.apicars.mappers;

import com.apicars.dto.CarDTO;
import com.apicars.entities.CarEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarMapper {

    public CarDTO toDTO(CarEntity entity) {
        if (entity == null) return null;

        CarDTO dto = new CarDTO();
        dto.setId(entity.getId());
        dto.setModelo(entity.getModelo());
        dto.setMarca(entity.getMarca());
        dto.setAno(entity.getAno());
        return dto;
    }

    public CarEntity toEntity(CarDTO dto) {
        if (dto == null) return null;

        CarEntity entity = new CarEntity();
        entity.setId(dto.getId());
        entity.setModelo(dto.getModelo());
        entity.setMarca(dto.getMarca());
        entity.setAno(dto.getAno());
        return entity;
    }

    public List<CarDTO> toDTOList(List<CarEntity> entities) {
        if (entities == null) return null;

        return entities.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public List<CarEntity> toEntityList(List<CarDTO> dtos) {
        if (dtos == null) return null;

        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
