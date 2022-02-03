package Ejercicio8_Punto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        Punto punto1 = new Punto();
        Punto punto2 = new Punto();
        Punto punto3 = new Punto();

        System.out.println("Introduce la coordenada X del primer punto");
        punto1.setA(sc.nextDouble());
        System.out.println("Introduce la coordenada Y del primer punto");
        punto1.setB(sc.nextDouble());

        System.out.println("Introduce la coordenada X del segundo punto");
        punto2.setA(sc.nextDouble());
        System.out.println("Introduce la coordenada Y del segundo punto");
        punto2.setB(sc.nextDouble());

        punto1.igual(punto2);
        System.out.println(punto1.distanciaConOtroPunto(punto2));


    }
}