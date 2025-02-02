package ru.job4j.pojo;

import javax.xml.crypto.Data;

public class Student {
    private String fullName;
    private String group;
    private String dataAdmission;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDataAdmission() {
        return dataAdmission;
    }

    public void setDataAdmission(String dataAdmission) {
        this.dataAdmission = dataAdmission;
    }
}
