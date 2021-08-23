package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getCarSubListByCount(String count) {
        int intCount = ((Integer.parseInt(count) < 1) || (Integer.parseInt(count) > 5)) ?
                5 : Integer.parseInt(count);
        List<Car> carList = getCarList();
        return carList.subList(0, intCount);
    }

    @Override
    public List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            carList.add(new Car("car" + i, i, "col" + i));
        }
        return carList;
    }
}
