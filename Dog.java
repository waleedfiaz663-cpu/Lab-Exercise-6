class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog eats meat.");
    }

    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}