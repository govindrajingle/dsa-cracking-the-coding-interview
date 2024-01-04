import java.util.*;

enum AnimalType {
    DOG, CAT
}

class Animal {
    String name;
    AnimalType type;
    int order;

    Animal(String name, AnimalType type) {
        this.name = name;
        this.type = type;
    }
}

public class Three_Six_AnimalShelter {
    LinkedList<Animal> dogs;
    LinkedList<Animal> cats;
    int order;

    public Three_Six_AnimalShelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        order = 1;
    }

    void enq(String name, AnimalType type) {
        Animal animal = new Animal(name, type);
        animalOrder(animal);
        if (type == AnimalType.DOG) {
            dogs.addLast(animal);
        } else if (type == AnimalType.CAT) {
            cats.addLast(animal);
        }
    }

    Animal deqAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            return null;
        } else if (dogs.isEmpty()) {
            return cats.poll();
        } else if (cats.isEmpty()) {
            return dogs.poll();
        } else {
            if (dogs.peek().order < cats.peek().order) {
                return dogs.poll();
            } else {
                return cats.poll();
            }
        }
    }

    Animal deqDog() {
        if (dogs.isEmpty()) {
            return null;
        }
        return dogs.poll();
    }

    Animal deqCat() {
        if (cats.isEmpty()) {
            return null;
        }
        return cats.poll();
    }

    void animalOrder(Animal animal) {
        animal.order = order;
        order++;
    }

    public static void main(String[] args) {
        Three_Six_AnimalShelter shelter = new Three_Six_AnimalShelter();
        shelter.enq("Buddy", AnimalType.DOG);
        shelter.enq("Bolt", AnimalType.CAT);
        System.out.println(shelter.deqCat().name);
    }
}