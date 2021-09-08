package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Audi", "V6", 1995));
        cars.add(new Car("BMV", "V8", 1996));
        cars.add(new Car("Opel", "V6", 1997));
        cars.add(new Car("Hundai", "V6", 1998));
        cars.add(new Car("Renault", "V8", 1999));
    }

    @Override
    public List<Car> listAllCars() {
        return cars;
    }

    @Override
    public List<Car> showNCars(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
