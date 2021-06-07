package by.academy.springtest.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class TransportTypeDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private int transportTypeDtoId;
    private String description;
}
