// Online C compiler to run C program online
#include <stdio.h>
// in c strings are array of characters
int main() {
    char str[ ] = "codeio";
    char *s1 = str; // str(name of the array) always points to the 1st element of the array
    //*s1 = 'c'; its a independent pointer which can move freely

    for(int i = 0; i <= 4; i++) {
       printf("%c ", *s1);
       s1++; 
    }
    return 0;
    //output
    //c o d e
}