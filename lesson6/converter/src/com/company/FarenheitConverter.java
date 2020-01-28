package com.company;

public class FarenheitConverter implements Converter {
    @Override
    public double convertToCelicia(double temperature) {
        return (temperature-32)*5/9;
    }
}
