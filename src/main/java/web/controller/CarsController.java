package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.server.CarsFounder;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam (required = false, defaultValue = "5") Integer count, ModelMap model) {
        CarsFounder carsFounder = new CarsFounder();
        if (count >= 5) {
            model.addAttribute("cars", carsFounder.fullList());
        } else {
            model.addAttribute("cars", carsFounder.subList(count));
        }
        return "cars";
    }

}