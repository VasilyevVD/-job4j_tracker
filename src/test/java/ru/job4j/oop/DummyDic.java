package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String say = dic.engToRus(" + eng");
        System.out.println(say);
    }
}
