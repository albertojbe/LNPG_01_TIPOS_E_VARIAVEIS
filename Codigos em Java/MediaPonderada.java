package Java;
import java.util.Scanner;

public class MediaPonderada{
    public static void main(String[] args){
        float n1, n2, n3, p1, p2, p3, media;

        System.out.println("Média Ponderada");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite três notas e seus respectivos pesos");
        System.out.print("\nNota 1: ");
        n1 = scan.nextFloat();
        System.out.print("Seu peso: ");
        p1 = scan.nextFloat();
        System.out.print("\nNota 2: ");
        n2 = scan.nextFloat();
        System.out.print("Seu peso: ");
        p2 = scan.nextFloat();
        System.out.print("\nNota 3: ");
        n3 = scan.nextFloat();
        System.out.print("Seu peso: ");
        p3 = scan.nextFloat();
        
         media = ((n1*p1) + (n2*p2) + (n3*p3)) / (p1+p2+p3);
         System.out.printf("\n\nA média ponderada é: %.2f", media);
    
    }
}
