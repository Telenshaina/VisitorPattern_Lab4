public class StandardCost implements CostCalculator {
    @Override
    public double computeCost(FurnitureItem item) {
        switch (item.getType()) {
            case "Chair":
                return 10;
            case "Table":
                return 20 + item.getSize() * 5;
            case "Sofa":
                return 50 + item.getSize() * 10;
            default:
                return 0;
        }
    }
}