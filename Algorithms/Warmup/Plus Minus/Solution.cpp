#include<iostream>
#include<stdio.h>
// #include<conio.h>

using namespace std;

int main(){
    int n;
    cin>>n;
    int x;
    float pos,neg,zero;
    pos = neg = zero = 0.0;
    for(int i=0;i<=n-1;i++){
        cin>>x;
        if(x>0){
            pos++;
            continue;
        }
        if(x<0){
            neg++;
            continue;
        }
        zero++;
    }
    printf("%.6f\n%.6f\n%.6f",(pos/n),(neg/n),(zero/n));
    // getch();
    return 0;
}
