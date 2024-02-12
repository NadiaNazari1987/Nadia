package filmkod;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DatabasePeroperties {

        public static void main(String[] args) throws ClassNotFoundException, IOException {

            Properties properties = new Properties();// properties uppkoppling från rad 11 till 20
            properties.load(new FileInputStream("src/filmkod/settingsProperties"));
            System.out.println("connectionString = " + properties.getProperty("connectionString"));// felsöka
            System.out.println("name = " + properties.getProperty("name"));// felsöka
            System.out.println("password = " + properties.getProperty("password"));// felsöka

            try (Connection connection = DriverManager.getConnection(// här gör vi en connection
                    properties.getProperty("connectionString"),
                    properties.getProperty("name"),
                    properties.getProperty("password"));
                 // Nu gör vi en statment
                 Statement statment = connection.createStatement();
                 ResultSet resultSet = statment.executeQuery("select id, personnummer, namn from student")
            ) {
                // nu ska vi samla ihop datat som skapas ihop här som resultSette har tillgång till
                while (resultSet.next()){// läsa varje rad
                    int id = resultSet.getInt("id");// här måste jag parsa ut datat i databasen och göra om det i java-data
                    String personnummer = resultSet.getString("personnummer");// här måste jag hålla koll på vad är det för typ, tex string eller int
                    String namn = resultSet.getString("namn");

                    // skriver ut datat
                    System.out.println("namn " + namn + ""+ " med " + "personnummer " + personnummer + " och " + " id  nummer "+ id);

                }
            } catch (SQLException sqlException) {
                throw new RuntimeException(sqlException);
            }
        }
}

