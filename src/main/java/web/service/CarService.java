package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> listAllCars();
    List<Car> showNCars(Integer count);
    public List<Car> getCars(Integer count);
}
