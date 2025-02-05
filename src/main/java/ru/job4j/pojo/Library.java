package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 0);
        Book abc = new Book("ABC", 45);
        Book pinocchio = new Book("Pinocchio", 56);
        Book lionKing = new Book("Lion King", 67);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = abc;
        books[2] = pinocchio;
        books[3] = lionKing;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println("Swapped 3 and 0 book");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println("Outputting books with the name Clean code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean Code".equals(book.getName())) {
                System.out.println("Clean Code");
            }
        }
    }
}