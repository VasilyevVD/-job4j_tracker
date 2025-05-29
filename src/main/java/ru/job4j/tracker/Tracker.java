package ru.job4j.tracker;

import java.util.ArrayList;

public class Tracker {
    private ArrayList<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item add(Item item) {
        items.add(item);
        return item;
    }

    public ArrayList<Item> findAll() {
        return new ArrayList<>(items);
    }

    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }

    public Item findById(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public boolean replace(int id, Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.set(i, item);
                return true;
            }
        }
        return false;
    }

    public void delete(int id) {
        items.removeIf(item -> item.getId() == id);
        }
    }