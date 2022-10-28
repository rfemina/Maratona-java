package LogicaViradoNoJiraya.EstruturasCondicionais.SwitchCase;

import java.util.Scanner;

public class Aula02TipoDeConta {
    public static void main(String[] args) {
        Scanner TipodeConta = new Scanner(System.in);
        System.out.println("Digite o tipo da conta desejada entre 1 para contapoupanca, 2 para contacorrente e 3 para Investimento");
        int tipoconta = TipodeConta.nextInt();

        switch (tipoconta){
            default:
                System.out.println("Entrada inválida");
            case 1:
                System.out.println("0.05%");
                break;
            case 2:
                System.out.println("0.02%");
                break;
            case 3:
                System.out.println("0.01%");
                break;

        }

    }
}
