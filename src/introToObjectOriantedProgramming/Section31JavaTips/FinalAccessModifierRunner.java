package introToObjectOriantedProgramming.Section31JavaTips;

final class FinalClass{ //final means it can not be extended/inherited

}

class SomeClass{
    final public void DoSomething(){

    }
}

class ExtendingClass extends SomeClass{
    //public void DoSomething(){} cannot override final methods
}
public class FinalAccessModifierRunner {
    public static void main(String[] args) {
        final int i = 5;
        //i = 6; cannot change as  variable is final
    }
}
