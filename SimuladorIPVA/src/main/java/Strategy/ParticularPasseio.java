package Strategy;

public class ParticularPasseio implements InterfaceCalculo{
    @Override
    
    public double CalculaIPVA(double valorVeiculo){
        return valorVeiculo * 0.02;
    }
    
}
