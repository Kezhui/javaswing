package Strategy;

public class OnibusCaminhoes implements InterfaceCalculo{
    @Override
    
    public double CalculaIPVA(double valorVeiculo){
        return valorVeiculo * 0.01;
    }
    
}
