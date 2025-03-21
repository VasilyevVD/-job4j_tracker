package ru.job4j.polymorphism;

public class Service {
    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void add() {
        store.save("Petr Arsentev");
    }

    public static void main(String[] args) {
        MemoryStore store = new MemoryStore();
        Service service = new Service(store);
        service.add();
    }
}
