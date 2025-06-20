#include <stdio.h>

int main(){
    char arr[] = {'a', 'd'};   
    char* p = arr;             // pointer to array

    // Let's compare pointer variable address &p and array address &arr
    if (&p == &arr) {
        printf("same\n");
    } else {
        printf("not same\n");
    }

    return 0;
}

//output
// not same

// p is a pointer holding the address of arr.

// &p is the address where the pointer p itself is stored.

// &arr is the address of the whole array.

// So &p == &arr will usually be false, because they are different variables in memory.
