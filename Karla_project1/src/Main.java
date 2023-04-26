// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("El resultado de la suma es: " + suma(2,7,5));
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println("El número de puertas que tiene el coche es: " + miCoche.puertas);
    }
    public static int suma(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }
}

//Segunda Parte
class Coche {
    int puertas = 0;

    public void agregarPuerta() {
        this.puertas++;
    }
}