package task1;

import java.time.LocalDate;
import java.util.Scanner;

public class RunC {

    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Иванов", "Петр", "Вячеславович", LocalDate.of(2014, 5, 17), "Минск", "+375 29 444 5566", "№1", "3А"),
                new Student(2, "Петров", "Василий", "Николаевич", LocalDate.of(2012, 9, 17), "Минск", "+375 33 444 5566", "№2", "5Б"),
                new Student(3, "Гвоздь", "Виталий", "Антонович", LocalDate.of(2010, 12, 21), "Гомель", "+375 33 333 5656", "№55", "7Г"),
                new Student(4, "Шалов", "Никита", "Мубиенович", LocalDate.of(2011, 2, 13), "Мозырь", "+375 44 555 9698", "№3", "6А"),
                new Student(5, "Антохин", "Михаил", "Егорович", LocalDate.of(2011, 2, 13), "Мозырь", "+375 44 666 4545", "№3", "6А"),
        };
        System.out.println("После какого года рождения печатать информацию?");
        int year = new Scanner(System.in).nextInt();
        for (Student student : students) {
            if (student.getBirthday().getYear() > year) {
                System.out.println(student);
            }
        }
    }

}
