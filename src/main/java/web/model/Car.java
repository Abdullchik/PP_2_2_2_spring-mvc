package web.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
@ToString
public class Car {

    private int id;

    private String model;

    private String color;

    public static List<Car> carList(int count) {
        return Stream.of(
                new Car(1, "lada", "white"),
                new Car(2, "ferrari", "red"),
                new Car(3, "audi", "black"),
                new Car(4, "kia", "yellow"),
                new Car(5, "BMW", "blue")
        ).limit(count >= 5 ? Integer.MAX_VALUE : count).toList();
    }
}
