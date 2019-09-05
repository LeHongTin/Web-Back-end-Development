package practices.AbstractAndInterface.animal;

import practices.AbstractAndInterface.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
