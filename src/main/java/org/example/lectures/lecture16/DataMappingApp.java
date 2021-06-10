package org.example.lectures.lecture16;

import org.example.infrastructure.data.FileUserDataMapper;
import org.example.infrastructure.data.UserDataMapper;

public class DataMappingApp {

    public static void main(String[] args) {

        UserDataMapper users = new FileUserDataMapper("users.txt");
        //System.out.println(Arrays.toString(users.getAllUsers()));
        System.out.println(users.findByEmail("test5@test.com"));
        System.out.println(users.findByEmail("test445@test.com"));
    }
}
