package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarDao carsDao;

    private List<Car> listOfCars = new ArrayList<>();

    public CarServiceImpl(CarDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Car> listAllCars() {
        return carsDao.listAllCars();
    }

    @Override
    public List<Car> showNCars(Integer count) {
        return carsDao.showNCars(count);
    }

    @Override
    public List<Car> getCars(Integer count){

        if ((count == 0) || (count >= 5)){
            listOfCars = carsDao.listAllCars();
        } else {
            listOfCars = carsDao.showNCars(count);
        }
        return listOfCars;
    }
}
