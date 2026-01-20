package com.mauryavishal.Unit.Converter.controller;

import com.mauryavishal.Unit.Converter.dto.ConvertorDto;
import com.mauryavishal.Unit.Converter.service.ConverterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
public class ConverterController {
    private final ConverterService converterService;

//    @GetMapping("/len/{from}/{to}/{data}")
//    public double convertLength(@PathVariable String from, @PathVariable String to, @PathVariable double data){
//        return converterService.convertLength(from, to, data);
//    }

    @PostMapping("/len")
    public double convertLength(@RequestBody ConvertorDto requestBody){
        return converterService.convertLength(requestBody.getFrom() , requestBody.getTo(), requestBody.getValue());
    }

//    @GetMapping("/weight/{from}/{to}/{data}")
//    public double convertWeight(@PathVariable String from, @PathVariable String to, @PathVariable double data){
//        return converterService.convertWeight(from, to, data);
//    }

    @PostMapping("/weight")
    public double convertWeight(@RequestBody ConvertorDto requestBody){
        return converterService.convertWeight(requestBody.getFrom() , requestBody.getTo(), requestBody.getValue());
    }

//    @GetMapping("/temp/{from}/{to}/{data}")
//    public double convertTemp(@PathVariable String from, @PathVariable String to, @PathVariable double data){
//        return converterService.convertTemperature(from, to, data);
//    }

    @PostMapping("/temp")
    public double convertTemp(@RequestBody ConvertorDto requestBody){
        return converterService.convertTemperature(requestBody.getFrom() , requestBody.getTo(), requestBody.getValue());
    }
}
