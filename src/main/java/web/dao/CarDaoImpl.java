package web.dao;

import jakarta.persistence.EntityManager;
import web.model.Car;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private EntityManager entityManager;

    @Override
    public void add(Car car) {
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
