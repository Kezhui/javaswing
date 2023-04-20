package Strategy;

public class TransportePassageiros implements InterfaceCalculo{
    @Override
    
    public double CalculaIPVA(double valorVeiculo){
        return valorVeiculo * 0.02;
    }
    
}
