package practice_7.cost_counter;

public class Main {
    public static void main(String[] args) {
        CostCounter costCounter = new CostCounter();
        costCounter.addCosts(1, 123.20);
        costCounter.addCosts(2, 132.20);
        costCounter.addCosts(3, 143.03);
        costCounter.addCosts(4, 323.0);

        System.out.println(costCounter.getCosts(3));
        System.out.println(costCounter.minCostsPerMonth());
    }
}
