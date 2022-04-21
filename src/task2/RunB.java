package task2;

import java.util.Scanner;

public class RunB {

    public static void main(String[] args) {
        Patient[] patients = {
                new Patient(1, "Яковлев", "Иван", "Николаевич", "Варшава", "+4855555555", 123L, "ОРВИ"),
                new Patient(2, "Яковлева", "Юлия", "Николаевна", "Варшава", "+4844444444", 124L, "ОРВИ"),
                new Patient(3, "Луценко", "Станислав", "Викторович", "Варшава", "+481111111", 456L, "Covid-19"),
                new Patient(4, "Коваль", "Анастасия", "Львовна", "Варшава", "+483333333", 654L, "Covid-19"),
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите диапазон:");
        long min = scanner.nextLong();
        long max = scanner.nextLong();
        for (Patient patient : patients) {
            if (min <= patient.getMedicalPolesNumber() && patient.getMedicalPolesNumber() <= max) {
                System.out.println(patient);
            }
        }
    }

}
