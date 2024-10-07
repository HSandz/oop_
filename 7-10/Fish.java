public class Fish extends Animal {
    public Fish() {
        super(false, true);
    }

    @Override
    public void display() {
        System.out.println("Fish:");
        super.display();
    }
}
