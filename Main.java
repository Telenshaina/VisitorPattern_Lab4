public class Main {
    public static void main(String[] args) {
        Furniture chair = new Chair(1);
        Furniture table = new Table(3);
        Furniture sofa = new Sofa(5);

        ShippingCostVisitor standardShipping = new StandardShippingVisitor();
        ShippingCostVisitor expressShipping = new ExpressShippingVisitor();

        Furniture[] furnitureItems = {chair, table, sofa};

        System.out.println("Standard Shipping Costs:");
        for (Furniture item : furnitureItems) {
            item.accept(standardShipping);
        }

        System.out.println("\nExpress Shipping Costs:");
        for (Furniture item : furnitureItems) {
            item.accept(expressShipping);
        }
    }
}