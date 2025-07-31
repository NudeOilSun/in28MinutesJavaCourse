package introToObjectOriantedProgramming.Section31JavaTips;

import java.util.Objects;

class Client{
    private int Id;

    public Client(int id) {
        Id = id;
    }

    @Override
    public boolean equals(Object that) {
        if (that == null || getClass() != that.getClass()) return false;
        Client client = (Client) that;
        return Id == client.Id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }
}
public class EqualsRunner {
    public static void main(String[] args) {
        Client c1 = new Client(1);
        Client c2 = new Client(1);

        System.out.println("c1.equals(c2): " + c1.equals(c2));
    }
}
