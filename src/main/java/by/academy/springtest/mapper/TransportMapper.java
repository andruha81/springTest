package by.academy.springtest.mapper;

import by.academy.springtest.dto.TransportLiteDto;
import by.academy.springtest.model.entity.Transport;
import org.mapstruct.Mapper;

@Mapper
public interface TransportMapper {
    TransportLiteDto transportToDtoLite(Transport transport);
    Transport dtoLiteToTransport(TransportLiteDto transportLiteDto);
}
