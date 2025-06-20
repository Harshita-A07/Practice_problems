
int main(){
    signed char i=-130;
    //range: -128 to 127.
    for(;i>=0;i++);// -130 is <0 so condition is false so come sut of loop
    printf("%d\n",i);// but it doesnot print -130
    // it prints -128 (lowest limit of signed)
}
//output
//-128