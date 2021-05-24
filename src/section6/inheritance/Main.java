package section6.inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("animal", 1,1,5,6);
        Dog dog = new Dog("York",8,20,2,4,1,20, "long silk");
        dog.eat();
       // dog.walk();
        dog.run();
    }
}
