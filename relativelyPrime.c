#include <stdio.h>
void swap(int* a, int* b){
    int temp = *a;
    *a = *b;
    *b = temp;
}
int GCD(int divisor, int dividend){
    int rem = dividend%divisor;
    if(rem == 0){
        return divisor;
    }
    return GCD(rem, divisor);
}

unsigned short int isRelativelyPrime(int a,int b){
    if(a>b){
        swap(&a, &b);
    }
    return GCD(a,b) == 1;
}
int main(){
    int a,b;
    printf("Enter 2 numbers:");
    scanf("%d%d", &a, &b);
    if(isRelativelyPrime(a,b)){
        printf("The numbers %d, %d are relatively Prime", a, b);
    }else{
        printf("The numbers %d, %d are not relatively Prime", a, b);
    }
    return 0;
}
