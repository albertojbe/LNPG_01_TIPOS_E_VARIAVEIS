#include <stdio.h>

int main()
{
    int numero1; int numero2;
    printf("Calculadora Simples");
    printf("\n\nDigite o primeiro número: ");
    scanf("%d",&numero1);
    printf("Digite o segundo número: ");
    scanf("%d",&numero2);
    int soma = numero1 + numero2;
    int subtracao = numero1 - numero2;
    int multiplicacao = numero1 * numero2;
    float divisao = numero1 / numero2;
    
    printf("\nA soma é: %d", soma);
    printf("\nA subtração é: %d", subtracao);
    printf("\nA multiplicação é: %d", multiplicacao);
    printf("\nA divisão é: %f", divisao);

    return 0;
}
