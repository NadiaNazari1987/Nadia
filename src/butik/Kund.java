package butik;

// Kund är emutable, vi kan inte ändra en kund efter vi skapat den då det inte finns några setter metoder
public class Kund {
    int id;
    String namn;
    String efternamn;
    String username;
    String password;

    public Kund(int id, String namn, String efternamn, String username, String password) {
        this.id = id;
        this.namn = namn;
        this.efternamn = efternamn;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getNamn() {
        return namn;
    }

    public String getEfternamn() {
        return efternamn;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Kund{" +
                "id=" + id +
                ", namn='" + namn + '\'' +
                ", efternamn='" + efternamn + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
