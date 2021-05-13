package org.example.lectures.lecture07;

import java.util.UUID;

public class Student {
    private String id;
    private String name;
    private String email;
    private String phone;

    public Student(String name, String email, String phone) {
        this();
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Student() {
        this.id = UUID.randomUUID().toString();
    }

    public Student(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public String getId() {
        return id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
