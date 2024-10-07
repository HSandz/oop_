public class Pig extends Animal {
    public Pig() {
        super(true, false);
    }

    @Override
    public void display() {
        System.out.println("Pig:");
        super.display();
    }
}
