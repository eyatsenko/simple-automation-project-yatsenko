package org.example.infrastructure.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbUserDataMapper extends AbstractUserDataMapper {

    public DbUserDataMapper(String dbUrl) {
        try {
            Connection connection = DriverManager.getConnection(dbUrl);

            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");
            ResultSet set = statement.executeQuery();

            while (set.next()) {

                users.add(new User(set.getString("id"), set.getString("email"), set.getString("password"), set.getString("name")));
            }

            connection.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
