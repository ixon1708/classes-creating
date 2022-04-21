package task1;

import java.time.LocalDate;

public class RunB {

    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Иванов", "Петр", "Вячеславович", LocalDate.of(2014, 5, 17), "Минск", "+375 29 444 5566", "№1", "3А"),
                new Student(2, "Петров", "Василий", "Николаевич", LocalDate.of(2012, 9, 17), "Минск", "+375 33 444 5566", "№2", "5Б"),
                new Student(3, "Гвоздь", "Виталий", "Антонович", LocalDate.of(2010, 12, 21), "Гомель", "+375 33 333 5656", "№55", "7Г"),
                new Student(4, "Шалов", "Никита", "Мубиенович", LocalDate.of(2011, 2, 13), "Мозырь", "+375 44 555 9698", "№3", "6А"),
                new Student(5, "Антохин", "Михаил", "Егорович", LocalDate.of(2011, 2, 13), "Мозырь", "+375 44 666 4545", "№3", "6А"),
        };
        for (Student student : students) {
            if (isFirstFindByGrade(students, student)) {
                printClassmatesByStudent(students, student);
            }
        }
    }

    private static boolean isFirstFindByGrade(Student[] students, Student student) {
        for (Student elem : students) {
            if (elem.getGrade().equals(student.getGrade())) {
                return elem.getId() == student.getId();
            }
        }
        //вообще тут нужно выбросить исключение т.к. в метод явно передали
        // какого-то неправильного студента, но исключения не проходили ещё до этой темы
        return false;
    }

    private static void printClassmatesByStudent(Student[] students, Student student) {
        System.out.println("Ученики класса " + student.getGrade());
        for (Student stud : students) {
            if (stud.getGrade().equals(student.getGrade())) {
                System.out.println(stud);
            }
        }
    }

}
