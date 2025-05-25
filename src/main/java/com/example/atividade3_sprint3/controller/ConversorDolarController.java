package com.example.atividade3_sprint3.controller;


import com.example.atividade3_sprint3.service.ConversorDolarService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorDolarController {

    private final ConversorDolarService conversorDolarService;

    public ConversorDolarController(ConversorDolarService conversorDolarService) {
        this.conversorDolarService = conversorDolarService;
    }

    @PostMapping("/converter/dolar/{valor}")
    public double converterDolar(@PathVariable Double valor) {
        return conversorDolarService.converter(valor);
    }
}
