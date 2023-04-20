package Strategy;

public class LocadoraVeiculos implements InterfaceCalculo{
    @Override
    
    public double CalculaIPVA(double valorVeiculo){
        return valorVeiculo * 0.02;
    }
}
