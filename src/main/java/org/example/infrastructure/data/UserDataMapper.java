package org.example.infrastructure.data;

import java.util.List;

public interface UserDataMapper {

    User findByEmail(String email);

    User findByName(String name);

    List<User> getAllUsers();

}
