// Online C compiler to run C program online
#include <stdio.h>

int main() {
    char str[ ] = "codeio";
    char *s1 = str; // str(name of the array) always points to the 1st element of the array

    for(int i = 0; i <= 4; i++) {
       printf("%c ", *str);//str is always 1st elem of array
       s1++;  //s1 is only incremeneted but str is printed not s1
    }
    return 0;
}
//output
// c c c c 