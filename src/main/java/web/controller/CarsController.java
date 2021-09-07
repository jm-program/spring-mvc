package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    List<Car> cars;
    List<Car> messagges = new ArrayList<Car>();

    public void setCars(){
        cars.add(new Car("Audi", "V6", 1995));
        cars.add(new Car("BMV", "V8", 1996));
        cars.add(new Car("Opel", "V6", 1997));
        cars.add(new Car("Hundai", "V6", 1998));
        cars.add(new Car("Renault", "V8", 1999));
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(required = false) Integer count, Model model){

        cars.clear();
        messagges.clear();
        setCars();

        if ((count == null) || (count >= 5)){
            for (int i = 0; i < 5; i++) {
                messagges.add(cars.get(i));
            }
        } else {
            for (int i = 0; i < count; i++) {
                messagges.add(cars.get(i));
            }
        }

        model.addAttribute("messages", messagges);

        return "cars";

    }
}



