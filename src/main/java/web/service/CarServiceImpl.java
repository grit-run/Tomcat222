package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService {
    private CarDao carDao;

    public CarDao getCarDao() {
        return carDao;
    }

    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }
    @Override
    public List<Car> getCarList(List<Car> list, byte number) {
        if (number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
