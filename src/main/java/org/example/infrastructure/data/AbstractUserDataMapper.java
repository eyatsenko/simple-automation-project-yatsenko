package org.example.infrastructure.data;

public abstract class AbstractUserDataMapper implements UserDataMapper {

    protected User [] users = new User[10];

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
    public User[] getAllUsers() {
        return users;
    }

}
