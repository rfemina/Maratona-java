package DIO_Desafios_Testes;
import java.util.*;

public class Program {
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        int step = 0;

// TODO: Implemente uma condição onde seja possível reduzir o número até 0:

        while (num > 0)
        {
            if ((num%2) == 0)
            {
                num = num /2;
            }
            step++;
        }

        if(step >  num      ){
            System.out.println(   num-1     );
        }else{
            System.out.println(        );
        }
    }
}
