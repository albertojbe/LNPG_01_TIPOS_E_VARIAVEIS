package Java;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){
        System.out.print("Verificador Par ou Impar");
        
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        System.out.print("\n\nDigite um número: ");
        numero = scan.nextInt();
        String res = ((numero % 2) == 0?"O número é par":"O número é impar");
        System.out.printf("%s", res);
    }
}
