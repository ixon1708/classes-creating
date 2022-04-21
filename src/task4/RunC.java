package task4;

import java.util.Scanner;

public class RunC {

    public static void main(String[] args) {
        Car[] cars = {
                new Car(111L, "Tesla", "Model S", 2016, "Red", 50000),
                new Car(122L, "Tesla", "Model S", 2015, "Red", 49000),
                new Car(222L, "Tesla", "Model X", 2018, "Red", 80000),
                new Car(333L, "BMW", "M3", 2003, "White", 100000),
                new Car(444L, "Ford", "Mustang GT", 2020, "Blue", 90000),
                new Car(555L, "Chevrolet", "Camaro", 2012, "Yellow", 20000)
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой год выпуска?");
        int manufactureYear = scanner.nextInt();
        System.out.println("Начиная с какой цены?");
        int startPrice = scanner.nextInt();
        for (Car car : cars) {
            if (manufactureYear == car.getManufactureYear() && startPrice <= car.getPrice()) {
                System.out.println(car);
            }
        }
    }

}
