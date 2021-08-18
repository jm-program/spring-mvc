package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") String count,
                            ModelMap modelMap) {
        int intCount = ((Integer.parseInt(count) < 1) || (Integer.parseInt(count) > 5)) ?
                5 : Integer.parseInt(count);
        List<Car> carList = getCarList();
        modelMap.addAttribute("carlist", carList.subList(0, intCount));
        return "cars";
    }

    private List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            carList.add(new Car("car" + i, i, "col" + i));
        }
        return carList;
    }

}
