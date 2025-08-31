package Day2.Strategy;

interface DiscountStrategy {
    public double apply(double amount);
}

class NoDiscount implements DiscountStrategy {
    public double apply(double amount) {
        return amount;
    }
}

class PercentageDiscount implements DiscountStrategy {
    private double percentage;

    PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    public double apply(double amount) {
        return (int) (amount * ((100 - percentage) / 100));
    }
}

class FlatDiscount implements DiscountStrategy {
    private double flat;

    FlatDiscount(double flat) {
        this.flat = flat;
    }

    public double apply(double amount) {
        return Math.max(amount - flat, 0);
    }
}

class CheckOut {
    private DiscountStrategy strategy;

    CheckOut(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    double pay(double amount) {
        return strategy.apply(amount);
    }
}

public class DiscountStrategySolution {
    public static void main(String[] args) {
        CheckOut co = new CheckOut(new NoDiscount());
        System.out.println(co.pay(100));
        co = new CheckOut(new PercentageDiscount(10));
        System.out.println(co.pay(100));
        co = new CheckOut(new FlatDiscount(23));
        System.out.println(co.pay(100));
    }
}