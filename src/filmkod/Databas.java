package filmkod;

import java.sql.*;

public class Databas {
    public static void main(String[] args) throws ClassNotFoundException {
        try (Connection connection = DriverManager.getConnection(// här gör vi en connection
                "jdbc:mysql://localhost:3306/studentportalen",
                "root",
                "Nadia");
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