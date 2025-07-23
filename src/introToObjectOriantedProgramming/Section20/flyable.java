package introToObjectOriantedProgramming.Section20;

public interface flyable {
    void fly();
}

class Bird implements flyable{
    @Override
    public void fly(){
        System.out.println("Bird flies");
    }
}

class aeroplane implements flyable{
    @Override
    public void fly() {
        System.out.println("Aeroplane fly");
    }
}

class flyableRunner {
    public static void main(String[] args) {
        flyable[] flyinfObjects = {new Bird(), new aeroplane()};

        for(flyable f:flyinfObjects){
            f.fly();
        }
    }
}
