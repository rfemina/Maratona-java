package CalculadoraSelic;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double taxa = 22.5;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de semestres: ");
        int semestres = teclado.nextInt();
        System.out.println("Digite o valor inicial: ");
        double ValorInicial = teclado.nextDouble();
        System.out.println("Digite o valor de acrescimo, caso haja");
        double Acrescimo = teclado.nextDouble();
        System.out.println("Os valores digitatos foram: \n" + semestres + ", para a quantidade de semestres. \n " + ValorInicial
                +", Para o valor inicial;\n" + Acrescimo + ", para valores de acrescimos. \n" + "E com a taxa de: "+ taxa);
        double valortaxafinal;
        for (int x = 0; x < semestres; x ++){
            if (Acrescimo > 0){
                valortaxafinal = ((ValorInicial * taxa) / 100) + ValorInicial;
                ValorInicial = (valortaxafinal + (Acrescimo * 6));
                System.out.println("\n Valor Total: " + Math.round(ValorInicial));
            }
            else {
                valortaxafinal = ((ValorInicial * taxa) / 100) + ValorInicial;
                ValorInicial = valortaxafinal;
                System.out.println("\n Valor Total: " + Math.round(ValorInicial));
            }
        }
    }
}
