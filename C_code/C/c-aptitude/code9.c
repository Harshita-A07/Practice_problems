
#include<stdio.h>
int main(){
     char arr[]= {1,2,3};
         char* p=arr;
         print(" %d",sizeof(p));// size of a character pointer is 8 byte
         print(" %d",sizeof(arr));// arr contains array of characters
         // size of 1 char is 1 byte since there are 3 char 1*3 =3  
        return 0;

    }
 //output
 //8  3 

 // variation 
 int main(){
     int arr[]= {1,2,3};
         int* p=arr;
         print(" %d",sizeof(p));// size of a character pointer is 8 byte
         print(" %d",sizeof(arr));// arr contains array of characters
         // size of 1 int is (few compiler 2 byte)4 byte since there are 3 char 4*3 =12  
        return 0;
 }
 //output 
 // 8  12