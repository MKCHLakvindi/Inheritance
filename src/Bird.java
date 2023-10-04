class Bird extends Animal {
    protected double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }
    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }

    @Override
    public String toString() {
        return super.toString() + ", Wing Span: " + wingSpan;
    }
}

