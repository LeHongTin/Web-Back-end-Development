package practices.AbstractAndInterface;
import practices.AbstractAndInterface.animal.Animal;
import practices.AbstractAndInterface.animal.Tiger;
import practices.AbstractAndInterface.animal.Chicken;
import practices.AbstractAndInterface.fruit.Apple;
import practices.AbstractAndInterface.fruit.Fruit;
import practices.AbstractAndInterface.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for(Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
