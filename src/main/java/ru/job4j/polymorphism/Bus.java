package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Транспорт движется");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Пасажиров " + count + " человек.");
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 60;
    }
}
