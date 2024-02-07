#include <stdio.h>

int main()
{
    float temperatura;
    printf("Conversor de Celsius para Farenheit");
    printf("\n\nDigite a temperatura em Celsius: ");
    scanf("%f",&temperatura);
    
    float conversor = (temperatura * 1.8) + 32;
    
    printf("\nResultado da conversão: %f", conversor);
    
    return 0;
}
