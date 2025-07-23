package introToObjectOriantedProgramming.Section20OOP;

public abstract class Animal {
    abstract void bark();
}

class dog extends Animal{
    void bark(){
        System.out.println("bow bow");
    }
}

class cat extends Animal{
    void bark(){
        System.out.println("meow meow");
    }
}

class animalRunner{
    public static void main(String[] args) {
        Animal[] animals = {new dog(), new cat()};

        for(Animal a:animals){
            a.bark();
        }
    }
}
