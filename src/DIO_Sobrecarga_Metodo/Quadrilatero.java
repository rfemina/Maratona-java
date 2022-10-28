package DIO_Sobrecarga_Metodo;

public class Quadrilatero {

    public static double area(double lado) {

        System.out.println("Area do Quadrado: " + lado * lado);
        return (lado * lado);
    }

    public static double area(double lado1, double lado2) {

        return (lado1 + lado2);
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        return (((baseMaior+baseMenor)*altura) / 2);
    }

    public static float area(float diagonal1, float diagonal2) {

        return ((diagonal1 * diagonal2) / 2);
    }

    public static void main(String[] args) {
        
    }

    public static double abc() {
        return 1.5;
    }

}
