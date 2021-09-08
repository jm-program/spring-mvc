package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> listAllCars();
    List<Car> showNCars(Integer count);
}
