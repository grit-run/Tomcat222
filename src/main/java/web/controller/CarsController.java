package web.controller;

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
    @GetMapping(value = "/cars")
    public String printCarsList(@RequestParam(value = "count", defaultValue = "5") byte number, Model model) {
        List<Car> car = new ArrayList<>();
        car.add(new Car("A", "A1",1998));
        car.add(new Car("B", "B2",1999));
        car.add(new Car("C", "C4",1997));
        car.add(new Car("F", "F3",1995));
        car.add(new Car("J", "J8",1995));
        car = CarService.getCarList(car, number);
        model.addAttribute("car", car);
        return "cars";
    }

}
