package task4;

import java.util.Scanner;

public class RunA {

    public static void main(String[] args) {
        Car[] cars = {
                new Car(11L, "Tesla", "Model S", 2016, "Red", 50000),
                new Car(22L, "Tesla", "Model X", 2018, "Red", 80000),
                new Car(33L, "BMW", "M3", 2003, "White", 100000),
                new Car(44L, "Ford", "Mustang GT", 2020, "Blue", 90000),
                new Car(55L, "Chevrolet", "Camaro", 2012, "Yellow", 20000)
        };
        System.out.println("Авто какой марки ищем?");
        String brand = new Scanner(System.in).nextLine();
        for (Car car : cars) {
            if (brand.equals(car.getBrand())) {
                System.out.println(car);
            }
        }
    }

}
