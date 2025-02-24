package ru.job4j.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle bus1 = new Bus();
        Vehicle airplane = new Airplane();
        Vehicle airplane1 = new Airplane();
        Vehicle train = new Train();
        Vehicle train1 = new Train();

        Vehicle[] vehicles = new Vehicle[]{bus, bus1, airplane, airplane1, train, train1};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
