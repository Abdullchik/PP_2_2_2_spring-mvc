package web.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public class Car {

    private int id;

    private String model;

    private String color;

    public static List<Car> carList() {
        return List.of(
                new Car(1, "lada", "white"),
                new Car(2, "ferrari", "red"),
                new Car(3, "audi", "black"),
                new Car(4, "kia", "yellow"),
                new Car(5, "BMW", "blue")
        );
    }
}
