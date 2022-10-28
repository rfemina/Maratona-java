package LogicaViradoNoJiraya.EstruturasCondicionais.IF_Else;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Desafio2_DIO {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int N = input.nextInt();

        if (A %A == 0){
            int B = A;
            for (int i = 0; A < N; i++){
                System.out.println(B);
                A = B;
            }
        }
    }
}
