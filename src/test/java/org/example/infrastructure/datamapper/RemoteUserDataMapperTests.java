package org.example.infrastructure.datamapper;

import org.example.infrastructure.data.RemoteUserDataMapper;
import org.example.infrastructure.data.User;
import org.example.infrastructure.data.UserDataMapper;
import org.example.infrastructure.data.UserNotFoundException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoteUserDataMapperTests {

    private UserDataMapper dataMapper;

    @Before
    public void setUp() {
        dataMapper = new RemoteUserDataMapper("https://test.com:80");
    }

    @Test
    public void testFindUserByEmail() {

        User expectedUser = new User("1", "test1@test.com", "sdfsar", "John");

        User u = dataMapper.findByEmail("test1@test.com");

        assertEquals(expectedUser, u);
    }

    @Test
    public void testFindUserByName() {

        User expectedUser = new User("1", "test1@test.com", "sdfsar", "John");

        User u = dataMapper.findByName("John");

        assertEquals(expectedUser, u);
    }

    @Test(expected = UserNotFoundException.class)
    public void testExceptionForNonExistingEmail() {
        dataMapper.findByEmail("test10@test.com");
    }
}
