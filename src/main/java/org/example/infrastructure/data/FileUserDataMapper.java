package org.example.infrastructure.data;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileUserDataMapper extends AbstractUserDataMapper {

    public FileUserDataMapper(String fileName) {

        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                User user = new User(parts[0], parts[1], parts[2], parts[3]);

                users.add(user);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
