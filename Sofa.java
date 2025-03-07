class Sofa implements Furniture {
    private int size;

    public Sofa(int size) {
        this.size = size;
    }

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visitSofa(this);
    }

    @Override
    public int getSize() {
        return size;
    }
}