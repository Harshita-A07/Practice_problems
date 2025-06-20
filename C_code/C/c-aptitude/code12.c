
int main(){
    char arr[] ="codeio";
    printf("%d",sizeof(arr));
    return 0;
}
//arr ='c''o''d''e''i''o''\0'
//hence size of->7
//where as strlen(arr) = 6

//output 
//7

// char arr[] ="\tcodeio";
//     printf("%d",sizeof(arr));
//output
//8