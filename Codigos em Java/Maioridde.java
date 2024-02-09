package Java;
import java.util.Scanner;

public class Maioridade{
    public static void main(String[] args){
        System.out.print("Verificador de Maioridade");
        
        Scanner scan = new Scanner(System.in);
        int idade = 0;
        System.out.print("\n\nDigite sua idade: ");
        idade = scan.nextInt();
        String res = (idade >= 18?"Você é maior de idade":"Você é menor de idade");
        System.out.printf("%s", res);
    
    }
}
