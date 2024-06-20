package Figuras;

public class Circulo {

    public class Circulo implements FigurasGeometricas {
        
        private double raio;
    
        public double getRaio() {
            return raio;
        }
    
        public void setRaio(double raio) {
            this.raio = raio;
        }
    
        
        public String getNomeFigura() {
            return "Circulo";
        }
        
        public double getArea() {
            return Math.PI * Math.pow(raio, 2);
        }
    
    
    
        public double getPerimentro() {
            return 2 * Math.PI * raio;
        }
    
    
    
    }

}
