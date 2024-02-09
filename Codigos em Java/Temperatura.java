package Java;
import java.util.Scanner;

public class Temperatura{
    public static void main(String[] args){
        float temperatura, conversor;

        System.out.println("Conversor de Celsius para Farenheit");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("\nDigite uma temperatura em Celsius: ");
        temperatura = scan.nextFloat();
        conversor = (temperatura * 9/5) + 32;
        System.out.printf("\n\nA temperatura em Farenheit é: %.1f Cº", conversor);
    
    }
}
