package Figuras;

public class Quadrado implements FigurasGeometricas{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
       Public double getArea(){

          return lado*lado;
       }

      public double getNomeFigura() {
        return "Quadrado";
      }

  
  public double getPerimentro(){
    return lado * 4;
  }
}
