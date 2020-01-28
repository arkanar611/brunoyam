package com.company;

public class KelvinConverter implements Converter {
    @Override
    public double convertToCelicia(double temperature) {
        return temperature-273;
    }
}
