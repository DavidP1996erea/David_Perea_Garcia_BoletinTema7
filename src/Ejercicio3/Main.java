package Ejercicio3;

public class Main {

    enum Transportes{
        CAMION, BARCO, COCHE, TREN, AVION;
    }


    public static void main(String[] args) {
        // write your code here

        Transportes t1 , t2, t3, t4, t5, t6;

        t1=Transportes.AVION;
        t2=Transportes.CAMION;
        t3=Transportes.TREN;
        t4=Transportes.COCHE;
        t5=Transportes.BARCO;
        t6=Transportes.AVION;


        System.out.println("El primer transporte esta en el puesto "+t1.ordinal());
        System.out.println("El segundo transporte esta en el puesto "+t2.ordinal());
        System.out.println("El tercer transporte esta en el puesto "+t3.ordinal());
        System.out.println("El cuarto transporte esta en el puesto "+t4.ordinal());
        System.out.println("El quinto transporte esta en el puesto "+t5.ordinal());
        System.out.println("El sexto transporte esta en el puesto "+t6.ordinal());


        if(t1.compareTo(t5)>0){

            System.out.println(t1 + " corre mas que " + t5);
        }else if(t1.compareTo(t5)<0){

            System.out.println(t5 + " corre mas que " + t1);

        }else if(t1.compareTo(t5)==0){
            System.out.println(t1 + " y " + t5 + " corren iguales");
        }



    }
}