class Mammal extends Animal {
    protected String furColor;

    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }
    @Override
    public void makeSound() {
        System.out.println("Mammal makes a sound");
    }
    @Override
    public String toString() {
        return super.toString() + ", Fur Color: " + furColor;
    }
}