package by.academy.springtest.mapper;

import by.academy.springtest.dto.TransportLiteDto;
import by.academy.springtest.dto.TransportTypeDto;
import by.academy.springtest.model.entity.Transport;
import by.academy.springtest.model.entity.TransportType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface TransportMapper {
    @Mapping(target = "transportLiteDtoId", source = "transport.id")
    @Mapping(target = "transportTypeDto", source = "transport.transportType")
    TransportLiteDto transportToDtoLite(Transport transport);

    @Mapping(target = "id", source = "transportLiteDto.transportLiteDtoId")
    Transport dtoLiteToTransport(TransportLiteDto transportLiteDto);

    @Mapping(target = "transportTypeDtoId", source = "transportType.id")
    TransportTypeDto transportTypeToDto(TransportType transportType);

    @Mapping(target = "id", source = "transportTypeDto.transportTypeDtoId")
    TransportType dtoToTransportType(TransportTypeDto transportTypeDto);
}
