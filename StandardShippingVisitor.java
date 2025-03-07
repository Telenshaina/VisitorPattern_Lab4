class StandardShippingVisitor implements ShippingCostVisitor {
    @Override
    public void visitChair(Chair chair) {
        System.out.println("Standard Shipping for Chair (Size: " + chair.getSize() + "): $10");
    }

    @Override
    public void visitTable(Table table) {
        int cost = 20 + table.getSize() * 5;
        System.out.println("Standard Shipping for Table (Size: " + table.getSize() + "): $" + cost);
    }

    @Override
    public void visitSofa(Sofa sofa) {
        int cost = 50 + sofa.getSize() * 10;
        System.out.println("Standard Shipping for Sofa (Size: " + sofa.getSize() + "): $" + cost);
    }
}