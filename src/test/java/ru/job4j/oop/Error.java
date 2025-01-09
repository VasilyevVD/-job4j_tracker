package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {

    }

    public void printInfo() {
        System.out.println("Ошибка ? " + active);
        System.out.println("Номер ошибки: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 57, "ошибка ввода");
        error.printInfo();
        Error notError = new Error();
        notError.printInfo();
    }
}

