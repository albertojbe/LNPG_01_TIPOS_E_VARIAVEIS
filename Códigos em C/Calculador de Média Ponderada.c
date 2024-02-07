#include <stdio.h>

int main()
{
    float nota1, nota2, nota3;
    float peso1, peso2, peso3;
    float media;
    
    printf("Média Ponderada");
    printf("\nDigite três notas e seus respectivos pesos.");
    
    printf("\n\nPrimeira nota: ");
    scanf("%f",&nota1);
    printf("Peso: ");
    scanf("%f",&peso1);
    
    printf("\nSegunda nota: ");
    scanf("%f",&nota2);
    printf("Peso: ");
    scanf("%f",&peso2);
    
    printf("\nTerceira nota: ");
    scanf("%f",&nota3);
    printf("Peso: ");
    scanf("%f",&peso3);
    
    media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
    
    printf("\n A média ponderada é: %f", media);
    return 0;
}
