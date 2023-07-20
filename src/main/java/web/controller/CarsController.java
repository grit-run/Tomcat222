package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    public final CarService  carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCarsList(@RequestParam(value = "count", defaultValue = "5") byte number, Model model) {
        List<Car> carService = new ArrayList<>();
        carService.add(new Car("A", "A1",1998));
        carService.add(new Car("B", "B2",1999));
        carService.add(new Car("C", "C4",1997));
        carService.add(new Car("F", "F3",1995));
        carService.add(new Car("J", "J8",1995));
        carService = this.carService.getCarList(carService, number);
        model.addAttribute("car", carService);
        return "cars";
    }

}
