package web.dao;

import jakarta.persistence.EntityManager;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private EntityManager entityManager;

    {
        List<Car> carService = new ArrayList<>();
        carService.add(new Car("A", "A1",1998));
        carService.add(new Car("B", "B2",1999));
        carService.add(new Car("C", "C4",1997));
        carService.add(new Car("F", "F3",1995));
        carService.add(new Car("J", "J8",1995));
    }

    @Override
    public void addCar(Car car) {
        entityManager.persist(car);
    }

    @Override
    public List<Car> getCarList(List<Car> list, int limit) {
        if (limit > 5) {
            return entityManager.createQuery("select cr from Car cr").getResultList();
        }
        return entityManager.createQuery("select cr from Car cr order by cr.id").setFirstResult(limit).getResultList();
    }
}
