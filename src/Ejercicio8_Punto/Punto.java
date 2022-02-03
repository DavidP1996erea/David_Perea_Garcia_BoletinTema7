package Ejercicio8_Punto;

public class Punto {
    private double a=0;
    private double b=0;


    public Punto(){

    }


    public void igual(Punto punto2){
        Punto punto1 = new Punto();
        punto1.setA(a);
        punto1.setB(b);

        if(punto1.getA()==punto2.getA() && punto1.getB()==punto2.getB()){

            System.out.println("Ambos puntos son iguales");
        }else {
            System.out.println("No son iguales");
        }


    }



    public double distancia(){

        return Math.sqrt(a*a + b*b);

    }

    public double distanciaConOtroPunto(Punto punto1){

        return Math.sqrt(Math.pow((punto1.a-a),2) + Math.pow(punto1.b-b, 2));


    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
