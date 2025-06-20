int main(){
    int x,y=5,z=5;
    x=y==z;
    //x+=y==z //output = 1 (bcx x=0/garbage value)
    printf("%d",x);
        return 0;
    }
    //bye operator precendece
    // 1st == comparisoe operator then = assignment operator
    // x =5==5
    //x=(5==5)
    //x==true 
    //since x i s a int true is 1 
    //x=1

    //OUTPUT
    //1
