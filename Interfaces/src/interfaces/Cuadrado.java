package interfaces;

public class Cuadrado implements Figura{
    
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularPerimetro(){
        return 0.0;
    }
    
    @Override
    public double calcularArea(double lado, double m){
        double resultado=lado*lado;
        return resultado;
    }
    
}
