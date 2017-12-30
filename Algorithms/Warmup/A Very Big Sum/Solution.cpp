#include<iostream>
// #include<conio.h>

using namespace std;

int main(void){
    long long int count = 0;
    long long int x;
    int n;
    cin>>n;
    for(int i=0;i<=n-1;i++){
        cin>>x;
        count+=x;
    }
    cout<<count;

    // getch();
    return 0;
}
