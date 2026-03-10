package src.unit5.exercise1;

public class exercise1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.Speed = 120;
        myCar.Make = "Toyota";

        Person person1 = new Person();
        person1.Name = "Alice";
        person1.Age = 30;

        Animal animal1 = new Animal();
        animal1.Species = "Dog";
        animal1.Legs = 4;

        System.out.println("Car Make: " + myCar.Make + ", Speed: " + myCar.Speed);
        System.out.println("Person Name: " + person1.Name + ", Age: " + person1.Age);
        System.out.println("Animal Species: " + animal1.Species + ", Legs: " + animal1.Legs);
    }
}

class Car {
  public int Speed;
  public String Make;
}

class Person {
  public String Name;
  public int Age;
}

class Animal {
  public String Species;
  public int Legs;
}