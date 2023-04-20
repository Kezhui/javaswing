package strategy;

public class Quadrado implements InterfaceCalculo{
    
    @Override
    public double CalculoArea(double area){
        return area*area;
    };
    
}
