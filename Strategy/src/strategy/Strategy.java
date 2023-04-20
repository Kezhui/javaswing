package strategy;

public class Strategy {
    public static void main(String[] args) {
        new FormaGeometrica(FormaGeometrica.QUADRADO, 25);
        new FormaGeometrica(FormaGeometrica.CUBO, 10);
        
        double teste = new FormaGeometrica(FormaGeometrica.CUBO, 20).areaRetornada();
        
        System.out.println(teste);
        
    }
    
}
