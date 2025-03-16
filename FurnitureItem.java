public class FurnitureItem implements Item {
    private String type;
    private int size;

    public FurnitureItem(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    @Override
    public double accept(CostCalculator calculator) {
        return calculator.computeCost(this);
    }

    @Override
    public int getSize() {
        return size;
    }
}