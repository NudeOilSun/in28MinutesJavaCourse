package introToObjectOriantedProgramming.Section20OOP;

public class Student extends Person{
    private String uniNmae;
    private int startingYear;

    public Student(String name, int age, String uniNmae, int startingYear) {
        super(name, age);
        this.uniNmae = uniNmae;
        this.startingYear = startingYear;
    }
    public int getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(int startingYear) {
        this.startingYear = startingYear;
    }

    public String getUniNmae() {
        return uniNmae;
    }

    public void setUniNmae(String uniNmae) {
        this.uniNmae = uniNmae;
    }

}
