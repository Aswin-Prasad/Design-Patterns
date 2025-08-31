package Day1.Builder;

class Pizza {
	String dough;
	String sause;
	String toppings;

	Pizza(PizzaBuilder builder) {
		this.dough = builder.dough;
		this.sause = builder.sause;
		this.toppings = builder.toppings;
	}
	
	void display() {
		System.out.println("Pizza: \n\tDough: " + this.dough + "\n\tSause: " + this.sause + "\n\tToppings: " + this.toppings);
	}
}

class PizzaBuilder {
	String dough = "Nothing";
	String sause = "Nothing";
	String toppings = "Nothing";

	PizzaBuilder setDough(String dough) {
		this.dough = dough;
		return this;
	}

	PizzaBuilder setSause(String sause) {
		this.sause = sause;
		return this;
	}

	PizzaBuilder addToppings(String toppings) {
		this.toppings = toppings;
		return this;
	}

	Pizza build() {
		return new Pizza(this);
	}
}

public class BuilderSolution {
	public static void main(String args[]) {
		PizzaBuilder pb = new PizzaBuilder();
		Pizza pizza = pb.setDough("Thin Crust").setSause("Soya").addToppings("Olive").build();
		pizza.display();
		pb = new PizzaBuilder();
		pizza = pb.setDough("Thick Crust").setSause("Tomato").build();
		pizza.display();
	}
	
}