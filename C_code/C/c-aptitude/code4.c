#include<stdio.h>
int main(){
    signed char i=0;
    //signed char size: 1byte (8bits) 
    //range : -128 to 127
   // printf("%c\n",i); ->output: 1 for each value there is a char assigned 
    for(;i>=0;i++); //when i= 127 and i++ then i becomes -128 ,so loop breaks
    // since condition becomes flase -128 will not be incremented
    printf("%d\n",i);
    return 0;   
}
//output
//-128