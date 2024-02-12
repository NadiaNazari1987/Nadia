package butik;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SkoButik {
    private Connection connection;
    private Scanner scanner = new Scanner(System.in);
    private Kund kund;
    public static void main(String[] args) {
        SkoButik skoButik = new SkoButik();
        skoButik.run();
    }
    private void run() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasteknik", "root", "Nadia");


            System.out.println("Välkommen till inloggningssidan för Nadias skobutik!");
            hamtaInloggadAnvandare();
            visaAllaProdukter();
            valjProdukt();

            this.connection.close();
        } catch (Exception e) {
            System.out.println("Får inte kontakt med databasen. Programmet avslutas, vänligen försök på nytt vid ett senare tillfälle.");
            System.exit(0);
        }
    }

    private void hamtaInloggadAnvandare() throws Exception {
        System.out.println("ange ditt username:");
        String usernameInput = scanner.nextLine();
        System.out.println("ange ditt password:");
        String passwordInput = scanner.nextLine();

        Statement statement = connection.createStatement();
        ResultSet resultSetKund = statement.executeQuery("select * from kund");

        List<Kund> kundList = new ArrayList<>();

        while(resultSetKund.next()) {
            int id = resultSetKund.getInt("id");
            String namn = resultSetKund.getString("namn");
            String efternamn = resultSetKund.getString("efternamn");
            String username = resultSetKund.getString("username");
            String password = resultSetKund.getString("password");
            Kund databasKund = new Kund(id, namn, efternamn, username, password);
            kundList.add(databasKund);
        }
        // LAMBDAS nr 1
        List<Kund> inloggadKundList = kundList.stream().filter(kund -> kund.getUsername().equals(usernameInput))
                .filter(kund -> kund.getPassword().equals(passwordInput)).collect(Collectors.toList());

        if (inloggadKundList.size() == 1) {
            System.out.println("Välkommen, du har lyckats inloggning in!");
            this.kund = inloggadKundList.get(0);
        } else {
            System.out.println("Har ej lyckats logga in, vänligen försök igen senare!");
            System.exit(0);
        }
    }
    private void visaAllaProdukter() throws Exception {
        Statement statement = connection.createStatement();
        ResultSet resultSetProdukt = statement.executeQuery("select * from produkt");

        List<Produkt> produktList = new ArrayList<>();
        while(resultSetProdukt.next()) {
            String marke = resultSetProdukt.getString("marke");
            String farg = resultSetProdukt.getString("farg");
            String storlek = resultSetProdukt.getString("storlek");
            float pris = resultSetProdukt.getFloat("pris");
            int antal = resultSetProdukt.getInt("antal");
            Produkt produkt = new Produkt(marke, farg, storlek, pris, antal);
            produktList.add(produkt);
        }


        //LAMBDAS nr 2
        List<Produkt> produktListFinnsILager = produktList.stream().filter(produkt -> produkt.getAntal() > 0).collect(Collectors.toList());

        System.out.println();
        System.out.println("Följande produkter finns att köpa!");
        System.out.println(produktListFinnsILager);
    }

    private void valjProdukt() throws Exception {
        boolean villKopaProdukt = true;
        String bestallningId = null;

        while (villKopaProdukt== true) {
            System.out.println("Ange märke som du vill köpa");
            String marke = scanner.nextLine();
            System.out.println("ange färg som du vill köpa");
            String farg = scanner.nextLine();
            System.out.println("ange storlek som du vill köpa");
            String storlek = scanner.nextLine();

            PreparedStatement statement = connection.prepareStatement("select * from produkt where marke = ? and farg = ? and storlek = ?");
            statement.setString(1, marke);
            statement.setString(2, farg);
            statement.setString(3, storlek);

            ResultSet resultSetProdukt = statement.executeQuery();

            int produktId = 0;
            while (resultSetProdukt.next()) {
                produktId = resultSetProdukt.getInt("id");
            }
            if (produktId == 0) {
                System.out.println("Du har inte angivit en produkt som vi har i webshoppen!");
            } else {
                laggEnBestallning(this.kund.getId(), bestallningId, produktId);
                System.out.println("Vald produkt har placerats i din beställning!");
            }

            System.out.println("Önskar du välja produkt från shoppen, tryck på valfri tangent. Annars skriv 'Nej' för att avsluta");
            String svar = scanner.nextLine();
            if (svar.equals("Nej")) {
                villKopaProdukt = false;
            } else {
                try {

                PreparedStatement statementBestallning = connection.prepareStatement("select * from bestallning where kund_id = ?");
                statementBestallning.setInt(1, this.kund.getId());
                ResultSet resultSetBestallning = statementBestallning.executeQuery();

                List<Integer> kundensBestallningarId = new ArrayList<>();
                while (resultSetBestallning.next()) {
                    int bestallningIdInt = resultSetBestallning.getInt("id");
                    kundensBestallningarId.add(bestallningIdInt);
                }
                //LAMBDAS nr 3

                bestallningId = kundensBestallningarId.stream().max((first, second )-> first.compareTo(second)).get() + "";
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
    private void laggEnBestallning(int kundId, String bestallningId, int produktId) throws Exception {
        CallableStatement callableStatement = connection.prepareCall("{call AddToCart(?,?,?,?)}");
        callableStatement.setInt(1, kundId);
        callableStatement.setString(2, bestallningId);
        callableStatement.setString(3, "Stockholm");
        callableStatement.setInt(4, produktId);
        callableStatement.executeUpdate();
    }
}
