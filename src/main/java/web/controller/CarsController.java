package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarsController {
    public final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCarsList(@RequestParam(value = "count", defaultValue = "5") byte number, Model model) {
//        carService = this.carService.getCarList(carService., number);
        model.addAttribute("car", carService);
        return "cars";
    }

}
