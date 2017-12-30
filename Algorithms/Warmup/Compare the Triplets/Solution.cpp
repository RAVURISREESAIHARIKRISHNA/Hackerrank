#include<iostream>
// #include<conio.h>

using namespace std;

int main(void){
    int a[3];
    for(int i=0;i<=2;i++){
        cin>>a[i];
    }
    int alice,bob;
    alice = bob = 0;
    int x;
    for(int i=0;i<=2;i++){
        cin>>x;
        if(x > a[i]){
            bob++;
            continue;
        }
        if(x < a[i]){
            alice++;
            continue;
        }
    }
    cout<<alice<<" "<<bob;
    
    // getch();
    return 0;
}
