package datatype;

public class Dog extends Animal implements Movement {
    public Dog(String species, int height2, int age2, String gender2) {
        super(species, height2, age2, gender2);
    }

    @Override
    public void move() {
        System.out.println("The dog moved");
    }
}
