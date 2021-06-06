package by.academy.springtest.service;

import by.academy.springtest.dto.TransportLiteDto;
import by.academy.springtest.model.dao.TransportDao;
import by.academy.springtest.model.entity.Transport;

import java.util.List;

public interface TransportService {
    List<TransportLiteDto> getAll();
}
