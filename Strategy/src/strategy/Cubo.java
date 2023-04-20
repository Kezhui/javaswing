package strategy;

public class Cubo implements InterfaceCalculo{
    @Override
    public double CalculoArea(double area){
        return (area*area)*6;
    };
}
