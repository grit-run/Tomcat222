package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void addCar(Car car);
    List<Car> getCarList(List<Car> list, byte number);
}