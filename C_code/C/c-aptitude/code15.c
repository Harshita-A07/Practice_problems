#include<stdio.h>


int func(int i){
    if(i%2)//odd
       return i++;
    else
       return func(func(i-1));
}
int main(){



}
//output 
// for i=12 and 11
// ans is 11
