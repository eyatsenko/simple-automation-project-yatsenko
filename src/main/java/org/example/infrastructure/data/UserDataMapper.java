package org.example.infrastructure.data;

public interface UserDataMapper {

    User findByEmail(String email);

    User [] getAllUsers();

}
