public class ExpressCost implements CostCalculator {
    @Override
    public double computeCost(FurnitureItem item) {
        switch (item.getType()) {
            case "Chair":
                return 20;
            case "Table":
                return 30 + item.getSize() * 8;
            case "Sofa":
                return 80 + item.getSize() * 15;
            default:
                return 0;
        }
    }
}