package task5;

import java.time.LocalDate;
import java.util.Scanner;

public class RunC {

    public static void main(String[] args) {
        Bus[] buses = {
                new Bus(2134, 20, "МАЗ", 2016, 100000),
                new Bus(7645, 21, "МАЗ", 2016, 200000),
                new Bus(1456, 15, "МАЗ", 2016, 300000),
                new Bus(4396, 16, "МАЗ", 2016, 400000),
                new Bus(4587, 7, "Electron", 2016, 80000),
                new Bus(7777, 20, "МАЗ", 2016, 120000)
        };
        System.out.println("Введите пробег");
        int mileage = new Scanner(System.in).nextInt();
        for (Bus bus : buses) {
            if (mileage < bus.getMileage()) {
                System.out.println(bus);
            }
        }
    }

}
