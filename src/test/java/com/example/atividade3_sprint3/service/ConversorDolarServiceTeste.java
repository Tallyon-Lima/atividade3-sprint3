package com.example.atividade3_sprint3.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorDolarServiceTeste {

    @Test
    @DisplayName("Quando passado o valor 10 deve retornar 1,76")
    public void testeConversorDolar(){
        ConversorDolarService conversorDolarService = new ConversorDolarService();
        Double valor = 10.0;

        double resultado = conversorDolarService.converter(valor);

        assertEquals(1.77, resultado);
    }
}
