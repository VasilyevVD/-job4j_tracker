package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleTracker {
    private Tracker tracker = new Tracker();

    private static SingleTracker instace = null;

    private SingleTracker() {
    }

    public static SingleTracker getInstace() {
        if (instace == null) {
            instace = new SingleTracker();
        }
        return instace;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public ArrayList<Item> findAll() {
        return tracker.findAll();
    }

    public ArrayList<Item> findByName(String key) {
        return tracker.findByName(key);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public void delete(int id) {
        tracker.delete(id);
    }
}
