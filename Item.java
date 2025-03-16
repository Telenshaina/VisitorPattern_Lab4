public interface Item {
    double accept(CostCalculator calculator);
    int getSize();
    String getType(); 
}