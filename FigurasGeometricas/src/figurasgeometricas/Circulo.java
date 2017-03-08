/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author Thata
 */
public class Circulo {
    
   private   Punto punto1;
   private double radio;
   private double perimetro;
   private final double pi=3.1416;
    public Circulo(Punto punto, double radio) {
       this.punto1 = punto;
        this.radio = radio;
    }
    
    public void daResultados(){
    
    if(isCirculo()) {
    System.out.println("Perimetro: " + darPerimetro());
    System.out.println("Area: " + darArea());
      } else {
            System.out.println("No es un circulo");
        }    
    }
    
    private double darPerimetro() {  
        
        this.perimetro =2*radio+pi;
        return this.perimetro;
    }
    
    private double darArea() {
        double  area=pi*Math.pow(radio, 2);
        return area;
    }
    private boolean isCirculo() {
        return true;
    }  
    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
