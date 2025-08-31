package Day1.Decorator;

interface Coffee {
    public String getDescription();
    public double getCost();
}

class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple Coffee";
    }

    public double getCost() {
        return 15.0f;
    }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee decorator;
    CoffeeDecorator(Coffee decorator) {
        this.decorator = decorator;
    }
}

class MilkDecorator extends CoffeeDecorator {
    MilkDecorator(Coffee decorator) {
        super(decorator);
    }

    public String getDescription() {
        return decorator.getDescription() + ", Milk";
    }

    public double getCost() {
        return decorator.getCost() + 2.0f;
    }
}

class SugarDecorator extends CoffeeDecorator {
    SugarDecorator(Coffee decorator) {
        super(decorator);
    }

    public String getDescription() {
        return decorator.getDescription() + ", Sugar";
    }

    public double getCost() {
        return decorator.getCost() + 1.0f;
    }
}

class WhippedCreamDecorator extends CoffeeDecorator {
    WhippedCreamDecorator(Coffee decorator) {
        super(decorator);
    }

    public String getDescription() {
        return decorator.getDescription() + ", Whipped Cream";
    }

    public double getCost() {
        return decorator.getCost() + 2.0f;
    }
}

public class DecoratorSolution {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("\nDescription: " + simpleCoffee.getDescription());
        System.out.println("Cost: ₹" + simpleCoffee.getCost());

        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("\nDescription: " + milkCoffee.getDescription());
        System.out.println("Cost: ₹" + milkCoffee.getCost());

        Coffee sugarCoffee = new SugarDecorator(simpleCoffee);
        System.out.println("\nDescription: " + sugarCoffee.getDescription());
        System.out.println("Cost: ₹" + sugarCoffee.getCost());

        Coffee whippedCreamCoffee = new WhippedCreamDecorator(simpleCoffee);
        System.out.println("\nDescription: " + whippedCreamCoffee.getDescription());
        System.out.println("Cost: ₹" + whippedCreamCoffee.getCost());
        
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println("\nDescription: " + milkSugarCoffee.getDescription());
        System.out.println("Cost: ₹" + milkSugarCoffee.getCost());

        Coffee sugarCreamCoffee = new WhippedCreamDecorator(sugarCoffee);
        System.out.println("\nDescription: " + sugarCreamCoffee.getDescription());
        System.out.println("Cost: ₹" + sugarCreamCoffee.getCost());

        Coffee milkCreamCoffee = new WhippedCreamDecorator(milkCoffee);
        System.out.println("\nDescription: " + milkCreamCoffee.getDescription());
        System.out.println("Cost: ₹" + milkCreamCoffee.getCost());

        Coffee milkSugarCreamCoffee = new WhippedCreamDecorator(milkSugarCoffee);
        System.out.println("\nDescription: " + milkSugarCreamCoffee.getDescription());
        System.out.println("Cost: ₹" + milkSugarCreamCoffee.getCost());
    }
}