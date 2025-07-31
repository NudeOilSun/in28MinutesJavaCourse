package introToObjectOriantedProgramming.Section31JavaTips;

class Player{
    private String Name;
    private static int NumberOfPlayers = 0; //static is one instance of the class which means if static is updated for player1, it updates for player 2 too
    //static is like a shared variable

    public Player(String name) {
        Name = name;
        NumberOfPlayers++;
    }

    public static int getNumberOfPlayers() { //make the method static which means we can access it just from the class type
        return NumberOfPlayers;
    }

    public String getName() { //instance method as name is not static and therefore not shared, instances are unique per member
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    //static final variables/methods are consts. They cannot be changed and are the same throughout
}
public class StaticModifierRunner {
    public static void main(String[] args) {
        Player player1 = new Player("Louise");
        Player player2 = new Player("Kyle");

        System.out.println(Player.getNumberOfPlayers());
        System.out.println(Player.getNumberOfPlayers());
    }
}
