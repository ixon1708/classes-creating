package task5;

import java.util.Scanner;

public class RunA {

    public static void main(String[] args) {
        Bus[] buses = {
                new Bus(1234, 20, "МАЗ", 2016, 100000),
                new Bus(2345, 21, "МАЗ", 2016, 200000),
                new Bus(1456, 15, "МАЗ", 2016, 300000),
                new Bus(7896, 16, "МАЗ", 2016, 400000),
                new Bus(4587, 7, "Electron", 2016, 80000),
                new Bus(7777, 20, "МАЗ", 2016, 120000)
        };
        System.out.println("Введите номер маршрута");
        int trackNumber = new Scanner(System.in).nextInt();
        for (Bus bus : buses) {
            if (trackNumber == bus.getTrackNumber()) {
                System.out.println(bus);
            }
        }
    }

}
