package web.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Car {

    private int id;

    private String model;

    private String color;

}
