#include <stdio.h>

int main()
{
    int idade;
    printf("Verificador de Maioridade");
    printf("\n\nDigite sua idade: ");
    scanf("%d",&idade);
    
    if (idade >= 18){
        printf("Você é maior de idade.");
    }
    else{
        printf("Você é menor de idade.");
    }
    return 0;
}
