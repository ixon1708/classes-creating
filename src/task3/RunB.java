package task3;

import java.util.Scanner;

public class RunB {

    public static void main(String[] args) {
        Book[] books = {
                new Book(1L, "The strange life", new String[]{"Unknown Person", "Anonymous"}, "people radio", 2021, 302, 500),
                new Book(2L, "The strange life 2", new String[]{"Unknown Person", "Anonymous"}, "people radio", 2022, 302, 700),
                new Book(3L, "War and piece volume 1", new String[]{"Lev Tolstoy"}, "Minsk alliance printing", 2010, 280, 150),
                new Book(4L, "War and piece volume 2", new String[]{"Lev Tolstoy"}, "Minsk alliance printing", 2010, 310, 150),
                new Book(5L, "War and piece volume 3", new String[]{"Lev Tolstoy"}, "Minsk alliance printing", 2010, 270, 150),
                new Book(6L, "War and piece volume 4", new String[]{"Lev Tolstoy"}, "Minsk alliance printing", 2010, 290, 150),
        };
        String publisher = new Scanner(System.in).nextLine();
        for (Book book : books) {
            if (publisher.equals(book.getPublisher())) {
                System.out.println(book);
            }
        }
    }

}
