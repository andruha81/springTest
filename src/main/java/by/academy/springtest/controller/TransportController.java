package by.academy.springtest.controller;

import by.academy.springtest.dto.TransportLiteDto;
import by.academy.springtest.model.entity.Transport;
import by.academy.springtest.service.TransportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TransportController {
    private final TransportService transportService;

    public TransportController(TransportService transportService) {
        this.transportService = transportService;
    }

    @GetMapping("/hhh")
    public List<TransportLiteDto> hello() {
        List<TransportLiteDto> dsd = transportService.getAll();
        return transportService.getAll();
    }
}
