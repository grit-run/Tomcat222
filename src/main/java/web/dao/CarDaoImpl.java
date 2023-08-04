package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class CarDaoImpl implements CarDao {
    private static final List <Car> carService = new ArrayList<>();

    {
        carService.add(new Car("A", "A1",1998));
        carService.add(new Car("B", "B2",1999));
        carService.add(new Car("C", "C4",1997));
        carService.add(new Car("F", "F3",1995));
        carService.add(new Car("J", "J8",1995));
    }


    @Override
    public List<Car> getCarList(int limit) {
        if (limit > 5) {
            return carService;
        }
        return carService.stream().limit(limit).collect(Collectors.toList());
    }
}
