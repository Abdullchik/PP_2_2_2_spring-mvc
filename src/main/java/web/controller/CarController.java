package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/car")
    public String printCar(ModelMap model) {
        List<Car> carList = Car.carList();
        model.addAttribute("carList", carList);
        return "cars";
    }
}
