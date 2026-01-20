package com.mauryavishal.Unit.Converter.service.Impl;

import com.mauryavishal.Unit.Converter.service.ConverterService;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;

@Service
public class ConvertorServiceImpl implements ConverterService {
    private static final double MM_TO_M = 0.001;
    private static final double CM_TO_M = 0.01;
    private static final double KM_TO_M = 1000.0;
    private static final double FT_TO_M = 0.3048;
    private static final double YD_TO_M = 0.9144;
    private static final double MILE_TO_M = 1609.344;

    private static final double MG_TO_G  = 0.001;
    private static final double KG_TO_G  = 1000.0;
    private static final double OZ_TO_G  = 28.349523125;
    private static final double LBS_TO_G = 453.59237;

    @Override
    public double convertLength(@NonNull String fromUnit, String toUnit, double value){
        double fromUnitToMeter = switch (fromUnit.toLowerCase()) {
            case "mm" -> value * MM_TO_M;
            case "cm" -> value * CM_TO_M;
            case "m" -> value;
            case "km" -> value * KM_TO_M;
            case "ft" -> value * FT_TO_M;
            case "yd" -> value * YD_TO_M;
            case "mile" -> value * MILE_TO_M;
            default -> 0;
        };

        double meterToToUnit = switch (toUnit.toLowerCase()) {
            case "mm" -> fromUnitToMeter / MM_TO_M;
            case "cm" -> fromUnitToMeter / CM_TO_M;
            case "m" -> fromUnitToMeter;
            case "km" -> fromUnitToMeter / KM_TO_M;
            case "ft" -> fromUnitToMeter / FT_TO_M;
            case "yd" -> fromUnitToMeter / YD_TO_M;
            case "mile" -> fromUnitToMeter / MILE_TO_M;
            default -> 0;
        };

        return meterToToUnit;
    }

    @Override
    public double convertWeight(@NonNull String fromUnit, String toUnit, double value){
        double fromUnitToGram = switch (fromUnit.toLowerCase()) {
            case "mg" -> value * MG_TO_G;
            case "g" -> value;
            case "kg" -> value * KG_TO_G;
            case "oz" -> value * OZ_TO_G;
            case "lbs" -> value * LBS_TO_G;
            default -> 0;
        };

        double gramToToUnit = switch (toUnit.toLowerCase()) {
            case "mg" -> fromUnitToGram / MG_TO_G;
            case "g" -> fromUnitToGram;
            case "kg" -> fromUnitToGram / KG_TO_G;
            case "oz" -> fromUnitToGram / OZ_TO_G;
            case "lbs" -> fromUnitToGram / LBS_TO_G;
            default -> 0;
        };

        return gramToToUnit;
    }

    @Override
    public double convertTemperature(@NonNull String fromUnit, String toUnit, double value){
        double fromUnitToFahrenheit = switch (fromUnit.toLowerCase()) {
            case "c" -> ((value * 9.0/5.0) + 32.0);
            case "f" -> value;
            case "k" -> (value * 9.0/5.0) - 459.67;
            default -> 0;
        };

        double fahrenheitToToUnit = switch (toUnit.toLowerCase()) {
            case "c" -> (fromUnitToFahrenheit - 32.0) * 5.0 / 9.0;
            case "f" -> fromUnitToFahrenheit;
            case "k" -> (fromUnitToFahrenheit + 459.67) * 5.0 / 9.0;
            default -> 0;
        };

        return fahrenheitToToUnit;
    }
}
