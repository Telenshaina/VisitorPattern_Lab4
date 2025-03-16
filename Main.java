public class Main {
    public static void main(String[] args) {
        Item chair = new FurnitureItem("Chair", 1);
        Item table = new FurnitureItem("Table", 3);
        Item sofa = new FurnitureItem("Sofa", 5);

        CostCalculator standardCost = new StandardCost();
        CostCalculator expressCost = new ExpressCost();

        Item[] items = {chair, table, sofa};

        System.out.println("Standard Shipping Costs:");
        for (Item item : items) {
            System.out.println(item.getType() + ": $" + item.accept(standardCost));
        }

        System.out.println("\nExpress Shipping Costs:");
        for (Item item : items) {
            System.out.println(item.getType() + ": $" + item.accept(expressCost));
        }
    }
}