class Table implements Furniture {
    private int size;

    public Table(int size) {
        this.size = size;
    }

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visitTable(this);
    }

    @Override
    public int getSize() {
        return size;
    }
}