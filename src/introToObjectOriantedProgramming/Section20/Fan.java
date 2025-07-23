package introToObjectOriantedProgramming.Section20;

public class Fan {
    //state
    private String make;
    private double radius;
    private String colour;

    private boolean ison;
    private byte speed;

    //creation
    public Fan(String make, double radius, String colur){
        this.make = make;
        this.radius = radius;
        this.colour = colur;

    }

    public String toString(){
        return String.format("Make - %s, radius = %s, colour - %s, isOn - %s, spped - %s", make, radius, colour, ison, speed);
    }

    public void setIsOn(Boolean ison){
        this.ison = ison;
        if (!ison) setSpeed((byte)0);
    }

    public void setSpeed(byte speed){
        this.speed = speed;
    }
}
