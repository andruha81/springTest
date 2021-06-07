package by.academy.springtest.service.impl;

import by.academy.springtest.dto.TransportLiteDto;
import by.academy.springtest.mapper.TransportMapper;
import by.academy.springtest.model.dao.TransportDao;
import by.academy.springtest.service.TransportService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransportServiceImpl implements TransportService {

    private final TransportDao transportDao;
    private final TransportMapper mapper = Mappers.getMapper(TransportMapper.class);

    public TransportServiceImpl(TransportDao transportDao) {
        this.transportDao = transportDao;
    }

    @Override
    public List<TransportLiteDto> getAll() {
        return transportDao.findAll().stream().map(mapper::transportToDtoLite).collect(Collectors.toList());
    }
}
