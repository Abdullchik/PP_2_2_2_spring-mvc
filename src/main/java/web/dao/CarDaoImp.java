package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private final List<Car> carsList;

    {
        carsList = List.of(
                new Car(1, "lada", "white"),
                new Car(2, "ferrari", "red"),
                new Car(3, "audi", "black"),
                new Car(4, "kia", "yellow"),
                new Car(5, "BMW", "blue")
        );
    }

    @Override
    public List<Car> getCarsList(int count) {
        return carsList.stream().limit(count >= 5 ? Integer.MAX_VALUE : count).toList();
    }
}
