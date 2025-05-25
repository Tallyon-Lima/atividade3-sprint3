package com.example.atividade3_sprint3.service;

import org.springframework.stereotype.Service;

@Service
public class ConversorDolarService {

    public double converter(double valor){
        return valor/5.65;
    }
}
