package ru.job4j.pojo;

import javax.xml.crypto.Data;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setGroup("Automation Service");
        student.setDataAdmission("01.09.2007");

        System.out.println(System.lineSeparator() + student.getFullName() + " studies in a group - " + student.getGroup()
                           + System.lineSeparator() + "went to college - " + student.getDataAdmission() + " year ");
    }
}
