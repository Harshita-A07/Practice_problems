int main(){
    int a=1;
    int b=1;
    int c= a || --b;
    int d =a-- && --b;
    printf("a=%d,b=%d",a,b);
    printf("c=%d,d=%d",a,b);
    return 0;
    
}
// c = 1|| 1 which is true =1 (here only a will be evaluated not --b)
//d =1 && 0 which is 0 (a-- : next whenever we use a , it will be decremented value , --b: decremented value o b is printed)
//hence h=while printing a,b : a=0(decremented) b=0(decremented while evaluating d)

//output
// a=0 b=0
//c=1 d=0