package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.List;
public interface CarDao {
    void add(Car car);
    List<Car> getCarList(List<Car> list, int limit);

}
