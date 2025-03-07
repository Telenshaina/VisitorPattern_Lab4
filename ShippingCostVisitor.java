interface ShippingCostVisitor {
    void visitChair(Chair chair);
    void visitTable(Table table);
    void visitSofa(Sofa sofa);
}

//visitor interface