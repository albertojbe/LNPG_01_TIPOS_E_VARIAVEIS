#include <stdio.h>

int main()
{
    int numero;
    printf("Verificador Par ou Impar");
    printf("\n\nDigite um número: ");
    scanf("%d",&numero);
    
    int verificador = numero % 2;
    
    if (verificador == 0){
        printf("O número é par.");
    }
    else{
        printf("O número é impar");;
    }

    return 0;
}
