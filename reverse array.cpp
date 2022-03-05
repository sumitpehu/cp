#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    // your code goes here
    int arr[100]={0};
    int n;
    cin>>n;
    int sum=0;
    for(int i =0; i<n; i++)
    {
        cin>>arr[i];
    }
     
     for(int i =0; i<n; i++)
     {
     	for(int j=i+1; j<n; j++)
     	{
     		sum=0;
     		for(int a=i; a<j+1; a++)
     		{
     			sum+=arr[a];
     		}
     		cout<<sum<<endl;
     	}
     	cout<<" "<<endl;
        

     }
     
}

