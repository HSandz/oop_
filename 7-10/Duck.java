public class Duck extends Animal {
    public Duck() {
        super(true, true);
    }

    @Override
    public void display() {
        System.out.println("Duck:");
        super.display();
    }
}
