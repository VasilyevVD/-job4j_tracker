package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StarUI {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime created = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String formattedDate = created.format(formatter);
        System.out.println(formattedDate);
    }
}