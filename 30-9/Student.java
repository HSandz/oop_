public class Student extends Person {
    private String ID;

    public Student() {}

    public Student(String name, int birthYear, String ID) {
        super(name, birthYear);
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
