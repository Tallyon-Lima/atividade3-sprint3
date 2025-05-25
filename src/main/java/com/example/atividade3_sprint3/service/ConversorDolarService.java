package com.example.atividade3_sprint3.service;

import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class ConversorDolarService {

    public double converter(double valor) {
        BigDecimal resultado = BigDecimal.valueOf(valor)
                .divide(BigDecimal.valueOf(5.65), 2, RoundingMode.HALF_UP);
        return resultado.doubleValue();
    }

}
