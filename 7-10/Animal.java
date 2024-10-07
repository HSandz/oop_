public class Animal {
    private boolean canSwim;
    private boolean canWalk;

    public Animal(boolean canWalk, boolean canSwim) {
        this.canWalk = canWalk;
        this.canSwim = canSwim;
    }

    public void display() {
        System.out.println("Swim Ability: " + canSwim);
        System.out.println("Walk Ability: " + canWalk);
    }

    public static void main(String[] args) {
        Animal duck = new Duck();
        Animal fish = new Fish();
        Animal pig = new Pig();
        duck.display();
        fish.display();
        pig.display();
    }
}
