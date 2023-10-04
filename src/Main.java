public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 5);
        Mammal mammal = new Mammal("Mammal", 3, "Brown");
        Bird bird = new Bird("Bird", 2, 12.5);
        Dog dog = new Dog("Dog", 4, "White", "Golden Retriever");

        animal.makeSound();
        mammal.makeSound();
        bird.makeSound();
        dog.makeSound();

        System.out.println("Animal: " + animal);
        System.out.println("Mammal: " + mammal);
        System.out.println("Bird: " + bird);
        System.out.println("Dog: " + dog);
    }
}