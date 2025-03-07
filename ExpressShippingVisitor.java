class ExpressShippingVisitor implements ShippingCostVisitor {
    @Override
    public void visitChair(Chair chair) {
        System.out.println("Express Shipping for Chair (Size: " + chair.getSize() + "): $20");
    }

    @Override
    public void visitTable(Table table) {
        int cost = 30 + table.getSize() * 8;
        System.out.println("Express Shipping for Table (Size: " + table.getSize() + "): $" + cost);
    }

    @Override
    public void visitSofa(Sofa sofa) {
        int cost = 80 + sofa.getSize() * 15;
        System.out.println("Express Shipping for Sofa (Size: " + sofa.getSize() + "): $" + cost);
    }
}