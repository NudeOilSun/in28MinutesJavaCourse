 package introToObjectOriantedProgramming.Section30Concurrency;

public class BiCounter {
    private int i = 0;
    private int j = 0;

    //both method are synced whihch would mean one thread would call getI but a second thread would have to ewait before it calls getJ
    synchronized public void incrementI(){
        i++;
    }

    public int getI() {
        return i;
    }

    synchronized public void incrementJ(){
        j++;
    }

    public int getJ() {
        return j;
    }
}
