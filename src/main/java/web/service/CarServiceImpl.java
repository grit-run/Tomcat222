package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarServiceImpl carDao;
    @Autowired
    public CarServiceImpl(CarServiceImpl carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarList(int count) {

        return carDao.getCarList(count);
    }
}
