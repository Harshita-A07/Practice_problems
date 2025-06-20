#include <stdio.h>

int main(){
    char arr[] = {'a', 'd'};   
    char* p = arr;             // pointer to array
//*p 1st elem of arr
// p- mem address of *p
//&arr → gives the address of the whole array, but that address is the same as the address of the 1st element.
    // Let's compare pointer variable address &p and array address &arr
    if (p == &arr) {
        printf("same\n");
    } else {
        printf("not same\n");
    }

    return 0;
}