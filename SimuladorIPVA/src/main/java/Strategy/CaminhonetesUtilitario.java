package Strategy;

public class CaminhonetesUtilitario implements InterfaceCalculo{
    @Override
    
    public double CalculaIPVA(double valorVeiculo){
        return valorVeiculo * 0.02;
    }
    
}
