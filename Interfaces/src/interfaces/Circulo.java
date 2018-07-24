package interfaces;

public class Circulo implements Figura{
    
    double radio;

    @Override
    public double calcularPerimetro() {
        return 0.0;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularArea(double radio,double m) {
        double resultado=PI*(radio*radio);
        return resultado;//To change body of generated methods, choose Tools | Templates.
    }
    
}
