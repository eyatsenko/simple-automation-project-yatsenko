package org.example.infrastructure.data;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractUserDataMapper implements UserDataMapper {

    protected List <User> users = new ArrayList<>();

    @Override
    public User findByEmail(String email) {

        for (User u : users) {
            if (u.getEmail().equals(email)) {
                return u;
            }
        }

        throw new UserNotFoundException("User with email [" + email + "] was not found");
    }

    @Override
    public User findByName(String name) {

        for (User u : users) {
            if (u.getName().equals(name)) {
                return u;
            }
        }

        throw new UserNotFoundException("User with email [" + name + "] was not found");
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

}
