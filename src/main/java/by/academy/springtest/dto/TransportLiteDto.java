package by.academy.springtest.dto;

import by.academy.springtest.model.entity.Route;
import by.academy.springtest.model.entity.TransportType;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class TransportLiteDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private int bookDtoId;
    private String model;
}
