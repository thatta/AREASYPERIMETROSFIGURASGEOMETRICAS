/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author Tatiana Almanasa
 * @author Juan David Ojeda
 */
public class AreaYPerimentro  {

     private Scanner teclado;
    
       public AreaYPerimentro() {
        teclado = new Scanner(System.in);        
        mensajeBienvenida();
        iniciar();
    }
    private void mensajeBienvenida(){
        System.out.println("-----Bienvenido----");
        System.out.println("Elige Una Opcion");
    }
     private void iniciar() {        
         OUTER:
         while (true) {
             System.out.println("1. Triangulo 2.Circulo 3.Cuadrado 4.Salir");
             byte opcion =  teclado.nextByte();
             switch (opcion) {
                 case 1:
                     inicicarTriangulo();
                     break;
                 case 2:
                     inicializarCirculo();
                     break;
                 case 3:
                     inicicarCuadrado();
                     break;
                 case 4:
                     break OUTER;
                 default:
                     System.out.println("Numero no valido");
                     break;
             }
         }
    }
     private void inicicarTriangulo(){
        double x, y;
        System.out.println("Digite lado x1");
        x = teclado.nextDouble();
        System.out.println("Digite lado y1");
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("Digite lado x2");
        x = teclado.nextDouble();
        System.out.println("Digite lado y2");
        y = teclado.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.println("Digite lado x3");
        x = teclado.nextDouble();
        System.out.println("Digite lado y3");
        y = teclado.nextDouble();
        Punto punto3 = new Punto(x, y);
        Triangulo triangulo = new Triangulo(punto1, punto2, punto3);
        triangulo.darResultados();        
    }
     private void inicicarCuadrado(){
        double x, y;
        System.out.println("Digite lado x1");
        x = teclado.nextDouble();
        System.out.println("Digite lado y1");
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("Digite lado x2");
        x = teclado.nextDouble();
        System.out.println("Digite lado y2");
        y = teclado.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.println("Digite lado x3");
        x = teclado.nextDouble();
        System.out.println("Digite lado y3");
        y = teclado.nextDouble();
        Punto punto3 = new Punto(x, y);
        System.out.println("Digite lado x4");
        x = teclado.nextDouble();
        System.out.println("Digite lado y4");
        y = teclado.nextDouble();
        Punto punto4 = new Punto(x, y);
        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3, punto4);
        cuadrado.darResultados();  
    }
     private void inicializarCirculo(){
        double radio;
        double x,y;
        
        System.out.println("Digite coodenada x1");
        x = teclado.nextDouble();
        System.out.println("Digite coordenada y1");
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y);
        
        System.out.println("digite el radio del circulo");
        radio=teclado.nextDouble();
        Circulo circulo = new Circulo(punto1, radio);
        circulo.daResultados();
       
        
    }
}


