package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    public CarService carService;

    @GetMapping(value = "cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") String count,
                            ModelMap modelMap) {
        List<Car> carList = carService.getCarSubListByCount(count);
        modelMap.addAttribute("carlist", carList);
        return "cars";
    }

}
