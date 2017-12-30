#include<iostream>
#include<stdlib.h>
// #include<conio.h>

using namespace std;

int main(){
    int n;
    cin>>n;
    // *****************
    int **arr;
    arr = (int**) malloc(n*sizeof(int*));
    for(int i=0;i<=n-1;i++){
        arr[i] = (int*) malloc(n*sizeof(int));
    }
    // *****************
    int sum1 = 0;
    int sum2 = 0;
    for(int i=0;i<=n-1;i++){
        for(int j=0;j<=n-1;j++){
            cin>>arr[i][j];
            if(i==j){
                sum1+=arr[i][j];
            }if((i+j)==(n-1)){
                sum2+=arr[i][j];
            }
        }
    }
    cout<<abs(sum1-sum2);
    delete []arr;
    // getch();
    return 0;
}
