package LogicaViradoNoJiraya.EstruturasCondicionais.IF_Else;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        if (A == B) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }
    }
}

/*
    Scanner Numero1 = new Scanner(System.in);
            System.out.println("Digite o Primeiro Número: ");
                    int A = Numero1.nextInt();
                    Scanner Numero2 = new Scanner(System.in);
                    System.out.println("Digite o Segundo Número: ");
                    int B = Numero2.nextInt();

                    if (A == B) {
                    System.out.println("Sao iguais!");
                    } else {
                    System.out.println("Nao sao iguais!");
                    }

*/
