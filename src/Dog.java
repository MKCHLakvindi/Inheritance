class Dog extends Mammal {
    protected String breed;

    public Dog(String name, int age, String furColor, String breed) {
        super(name, age, furColor);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}