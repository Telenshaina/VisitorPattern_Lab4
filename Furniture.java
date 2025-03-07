interface Furniture {
    void accept(ShippingCostVisitor visitor);
    int getSize();
}