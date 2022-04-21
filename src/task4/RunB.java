package task4;

import java.time.LocalDate;
import java.util.Scanner;

public class RunB {

    public static void main(String[] args) {
        Car[] cars = {
                new Car(11L, "Tesla", "Model S", 2016, "Red", 50000),
                new Car(12L, "Tesla", "Model S", 2015, "Red", 49000),
                new Car(22L, "Tesla", "Model X", 2018, "Red", 80000),
                new Car(33L, "BMW", "M3", 2003, "White", 100000),
                new Car(44L, "Ford", "Mustang GT", 2020, "Blue", 90000),
                new Car(55L, "Chevrolet", "Camaro", 2012, "Yellow", 20000)
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("По какой модели ищем?");
        String model = scanner.nextLine();
        System.out.println("Какой срок эксплуатации?");
        int n = scanner.nextInt();
        int todayYear = LocalDate.now().getYear();
        for (Car car : cars) {
            if (model.equals(car.getModel()) && (todayYear - car.getManufactureYear()) >= n) {
                System.out.println(car);
            }
        }
    }

}
