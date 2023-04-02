package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/car")
    public String printCars( @RequestParam(value = "count", required = false) int count, ModelMap model) {
        List<Car> carList = Car.carList(count);
        model.addAttribute("carList", carList);
        return "cars";
    }
}
