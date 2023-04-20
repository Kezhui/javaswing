package strategy;


public class FormaGeometrica {
    public static final int QUADRADO = 1;
    public static final int CUBO = 2;
    double areaForma = 0;
    
    public FormaGeometrica(int formaGeometrica, double areaForma){
        this.areaForma = areaForma;
        
        switch(formaGeometrica){
            case QUADRADO:
                this.areaForma = (new Quadrado().CalculoArea(areaForma));
                break;
            case CUBO:
                this.areaForma = (new Cubo().CalculoArea(areaForma));
                break;
            default:
                System.out.println("Deu algum erro");
        }  
    
    }
    
    public double areaRetornada(){
        return this.areaForma;
    }
}
