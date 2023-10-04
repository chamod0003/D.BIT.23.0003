public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", 5);
        Mammal mammal = new Mammal("Mammal Animal", 3, "Brown");
        Bird bird = new Bird("Bird Animal", 2, 20.5);
        Dog dog = new Dog("Dog Animal", 4, "Black", "Labrador");

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