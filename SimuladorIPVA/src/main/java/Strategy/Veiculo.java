package Strategy;

public class Veiculo {
    public static final int PARTICULAR_E_PASSEIO = 1;
    public static final int CAMINHONETES_E_UTILITARIOS = 2;
    public static final int TRANSPORTE_DE_PASSAGEIROS = 3;
    public static final int MOTOCICLETAS_E_QUADRICICULOS = 4;
    public static final int LOCADORA_DE_VEICULOS = 5;
    public static final int ONIBUS_E_CAMINHOES = 6;
    
    protected double valorIPVA;

    public Veiculo(int tipoVeiculo, double valorVeiculo) {
        switch(tipoVeiculo){
            case PARTICULAR_E_PASSEIO:
                this.valorIPVA = new ParticularPasseio().CalculaIPVA(valorVeiculo);
                break;
            case CAMINHONETES_E_UTILITARIOS:
                this.valorIPVA = new CaminhonetesUtilitario().CalculaIPVA(valorVeiculo);
                break;
            case TRANSPORTE_DE_PASSAGEIROS:
                this.valorIPVA = new TransportePassageiros().CalculaIPVA(valorVeiculo);
                break;
            case MOTOCICLETAS_E_QUADRICICULOS:
                this.valorIPVA = new MotocicletasQuadriciculos().CalculaIPVA(valorVeiculo);
                break;
            case LOCADORA_DE_VEICULOS:
                this.valorIPVA = new LocadoraVeiculos().CalculaIPVA(valorVeiculo);
                break;
            case ONIBUS_E_CAMINHOES:
                this.valorIPVA = new OnibusCaminhoes().CalculaIPVA(valorVeiculo);
                break;
            default:
                throw new RuntimeException("TIPO DE VEÍCULO NÃO ENCONTRADO.");
        }    
    }
    
    public double resultadoValorIPVA(){
        return this.valorIPVA;
    }         
}
