package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carsDao;

    @Override
    public List<Car> listAllCars() {
        return carsDao.listAllCars();
    }

    @Override
    public List<Car> showNCars(int count) {
        return carsDao.showNCars(count);
    }
}
