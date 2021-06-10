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

                for (int i = 0; i < users.length; i++) {
                    if (users[i] == null) {
                        users[i] = new User (set.getString("id"), set.getString("email"), set.getString("password"));
                        break;
                    }
                }
            }

            connection.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
