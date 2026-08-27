class Teacher implements Human {

    @Override
    public void work() {
        System.out.println("Teacher teaches students.");
    }

    @Override
    public void speak() {
        System.out.println("Teacher gives lectures.");
    }
}