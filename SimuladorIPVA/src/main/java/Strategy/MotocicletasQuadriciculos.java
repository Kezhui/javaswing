package Strategy;

public class MotocicletasQuadriciculos implements InterfaceCalculo{
    @Override
    
    public double CalculaIPVA(double valorVeiculo){
        return valorVeiculo * 0.01;
    }
}
