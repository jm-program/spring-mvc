package web.model;

import lombok.*;

@Data
public class Car {

    private String model;

    private int series;

    private String colour;

    public Car(String model, int series, String colour) {
        this.model = model;
        this.series = series;
        this.colour = colour;
    }
}
