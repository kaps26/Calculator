package com.upgrad.calculator.services;

import com.upgrad.calculator.services.MathService;
import org.springframework.stereotype.Component;

@Component
public class SubtractionService implements MathService {
    public int operate(int x, int y) {
        return x-y;
    }
}
