class Animal { void makeSound() { System.out.println("Animal makes a sound"); } }
class Dog extends Animal {
    @Override void makeSound() { System.out.println("Dog barks"); }
}
class Cat extends Animal {
    @Override void makeSound() { System.out.println("Cat meows"); }
}
public class SoundOverriding {
    public static void main(String[] args) {
        new Dog().makeSound();
        new Cat().makeSound();
    }
}
