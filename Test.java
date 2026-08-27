public class Test {

    public static void showAnimal(Animal a) {
        a.eat();
        a.sound();
        System.out.println();
    }

    public static void showHuman(Human h) {
        h.work();
        h.speak();
        System.out.println();
    }

    public static void main(String[] args) {

       
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        Human h1 = new Student();
        Human h2 = new Teacher();

        showAnimal(a1);
        showAnimal(a2);

        showHuman(h1);
        showHuman(h2);
    }
}