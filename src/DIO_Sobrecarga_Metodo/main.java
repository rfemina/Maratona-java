package DIO_Sobrecarga_Metodo;

public class main {

    public static void main(String[] args) {

    //Quadrilatero
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);


   // Exercícios retornados
        System.out.println("Exercicios: ");

        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Área do Quadrado: " + areaQuadrado );

        double areaRetângulo = Quadrilatero.area(5,6);
        System.out.println("Área do Retângulo: " + areaRetângulo );

        double areatrapézio = Quadrilatero.area(3,5,6);
        System.out.println("Área do trapézio: " + areatrapézio );

        double areaLosângo= Quadrilatero.area(5,6);
        System.out.println("Área do Losângo: " + areaLosângo );

    }


}
