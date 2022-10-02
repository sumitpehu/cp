// program to calculate largest subarray sum
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    // your code goes here
    int arr[100]={0};
    int n;
    cin>>n;
    int largests=0;
    int cur;
    for(int i =0; i<n; i++)
    {
    	cin>>arr[i];
    }
    int sum[n]={0};
    sum[0]=arr[0];
    for(int i =1; i<n; i++)
    {
    	sum[i]=arr[i]+sum[i-1];
    }

    for(int i=0; i<n; i++)
    {
    	for(int j=i; j<n; j++)
    	{
    		if(i>0)
    		{
              cur=sum[j]- sum[i-1];
    		}
    		else{
    			cur=sum[j];
    		}
    		largests=max(largests,cur);
    	}
    }
    cout<<largests<<endl;
    
     
}

