#include<iostream>
// #include<conio.h>

using namespace std;

int main(void){
    int n,x,count = 0;
    cin>>n;
    for(int i=0;i<=n-1;i++){
        cin>>x;
        count+=x;
    }
    cout<<count;
    // getch();
    return 0;
}
