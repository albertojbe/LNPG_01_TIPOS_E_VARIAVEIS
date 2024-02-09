package Java;
import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        float n1, n2, adicao, multiplicacao, divisao, subtracao;

        System.out.println("Calculadora Simples");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("\nDigite um numero: ");
        n1 = scan.nextFloat();
        System.out.print("Digite outro número: ");
        n2 = scan.nextFloat();

        adicao = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;

        System.out.printf("\nA adição é: %.2f\n", adicao);
        System.out.printf("A subtracao é: %.2f\n", subtracao);
        System.out.printf("A multiplicação é: %.2f\n", multiplicacao);
        System.out.printf("A divisão é: %.2f\n", divisao);
    }
}
