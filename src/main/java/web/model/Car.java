package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;
    private String engine;
    private Integer year;

    public Car(){

    }

    public Car(String model, String engine, Integer year) {
        this.model = model;
        this.engine = engine;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "model '" + model + '\'' +
                ", engine '" + engine + '\'' +
                ", ear " + year;
    }
}
