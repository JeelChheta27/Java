// Encapsulation

/*public class Employee {
    // Private variables - hidden from outside classes
    private String name;
    private int age;

    // Public getter method to access the private variable name
    public String getName() {
        return name;
    }

    // Public setter method to modify the private variable name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method to access the private variable age
    public int getAge() {
        return age;
    }

    // Public setter method to modify the private variable age
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
}*/


//Inheritance

// Superclass
/*public class Animal {
    private String name;

    public void eat() {
        System.out.println("This animal eats food.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Subclass
public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}*/



//Compile-time Polymorphism

/*public class MathOperations {
    // Method overloading for addition
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
*/



//Run-time Polymorphism

/*public class Animal {
    public void sound() {
        System.out.println("This animal makes a sound");
    }
}

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}

Animal myDog = new Dog();
Animal myCat = new Cat();

myDog.sound(); // The dog barks
myCat.sound(); // The cat meows
*/


//Abstraction

/*abstract class Vehicle {
    abstract void start(); // abstract method

    public void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started");
    }
}*/



//Interface

/*interface Drivable {
    void drive(); // abstract method
}

class Car implements Drivable {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}

class Bike implements Drivable {
    @Override
    public void drive() {
        System.out.println("Bike is driving");
    }
}*/
