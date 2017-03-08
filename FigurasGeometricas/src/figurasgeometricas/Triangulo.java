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
public class Triangulo {
     private Punto punto1;
      private Punto punto2;
      private Punto punto3;
      
      private double perimetro;

    /**
     * Constuctor de la clse que inicializa las variables
     * @param punto1
     * @param punto2
     * @param punto3 
     */
    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }
    
    /**
     * Metodo que da los resultados del triangulo
     */
    public void darResultados() {
        if(isTriangulo()) {
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
            System.out.println("Perimetro: " + darPermietro());
            System.out.println("Area: " + darArea());
        } 
        else {
            System.out.println("No es un triangulo");
        }    
    }
    
    /**
     * Retorna verdadero si es un triangulo Falso contrario
     * @return 
     */
    private boolean isTriangulo() {
        return true;
    }
    
    /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado CA
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
     private double darPermietro() {        
        this.perimetro =  darLado1() + darLado2() + darLado3();
        return this.perimetro;
    }
      private double darArea() {
        double semiperimetro = this.perimetro / 2;
        double lado1 = semiperimetro - darLado1();
        double lado2 = semiperimetro - darLado2();
        double lado3 = semiperimetro - darLado3();
        
        double area =  Math.sqrt((semiperimetro * lado1 * lado2 * lado3));
        return area;
    }
       public String darTipoTriangulo() {
          if( (darLado1() == darLado2()) && (darLado2() == darLado3())) {
              return "Equilatero";
          } else if ( (darLado1() != darLado2()) && (darLado2() != darLado3()) && (darLado3() != darLado1())) {
              return "Escaleno";
          } else {          
             return "Isoceles";
          }
       }
      
        public Punto getPunto1() {
        return punto1;
    }
        public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }
         public Punto getPunto2() {
        return punto2;
    }
          public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
          public Punto getPunto3() {
        return punto3;
    }
          public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
}
