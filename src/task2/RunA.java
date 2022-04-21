package task2;

import java.util.Scanner;

public class RunA {

    public static void main(String[] args) {
        Patient[] patients = {
                new Patient(1, "Яковлев", "Иван", "Николаевич", "Варшава", "+4855555555", 123L, "ОРВИ"),
                new Patient(2, "Яковлева", "Юлия", "Николаевна", "Варшава", "+4844444444", 124L, "ОРВИ"),
                new Patient(3, "Луценко", "Станислав", "Викторович", "Варшава", "+481111111", 456L, "Covid-19"),
                new Patient(4, "Коваль", "Анастасия", "Львовна", "Варшава", "+483333333", 654L, "Covid-19"),
        };
        String diagnose = new Scanner(System.in).nextLine();
        for (Patient patient : patients) {
            if (diagnose.equals(patient.getDiagnose())) {
                System.out.println(patient);
            }
        }
    }

}
