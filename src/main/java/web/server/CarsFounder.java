package web.server;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsFounder {

    List<Car> cars = carsFiller();

    private List<Car> carsFiller() {
        List<Car> cars = new ArrayList<>(5);
        cars.add(new Car("Ford", "Mustang", 30000));
        cars.add(new Car("Ford", "Mondeo", 23000));
        cars.add(new Car("Ford", "Escorte", 11000));
        cars.add(new Car("Ford", "Transit", 33000));
        cars.add(new Car("Opel", "Meriva", 20000));

        return cars;
    }

    public List<Car> subList(int count) {
        return cars.subList(0, count);
    }

    public List<Car> fullList() {
        return cars;
    }

}
