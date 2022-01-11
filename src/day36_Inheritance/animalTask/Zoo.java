package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',2,"Small","White");
        dog.eat();
        dog.drink();
        dog.move();
        dog.sleep();
        dog.bark();
        System.out.println(dog);


        Cat cat = new Cat();
        cat.setInfo("Lily","domestic",'F',1,"Medium","White and Gray");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',4,"Large", "Orange");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.roar();
        System.out.println(tiger);

    }
}
