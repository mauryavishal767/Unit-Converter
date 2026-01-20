package com.mauryavishal.Unit.Converter.service;

import org.jspecify.annotations.NonNull;


public interface ConverterService {

    double convertLength(@NonNull String fromUnit, String toUnit, double value);

    double convertWeight(@NonNull String fromUnit, String toUnit, double value);

    double convertTemperature(@NonNull String fromUnit, String toUnit, double value);
}
