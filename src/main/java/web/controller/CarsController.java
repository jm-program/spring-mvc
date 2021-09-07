package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;
    private List<Car> messagges = new ArrayList<>();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(required = false) Integer count, Model model){

        if ((count == null) || (count >= 5)){
            messagges = carService.listAllCars();
        } else {
            messagges = carService.showNCars(count);
        }

        model.addAttribute("messages", messagges);

        return "cars";

    }
}



