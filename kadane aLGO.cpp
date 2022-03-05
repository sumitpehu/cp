#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    // your code goes here
    int arr[100]={0};
    int n;
    cin>>n;
    for(int i=0; i<n; i++)
    {
    	cin>>arr[i];
    }
    int cur=0;
    int ms=0;
    for(int i =0; i<n; i++)
    {
    	cur=cur+arr[i];
    	if(cur<0)
    	{
    		cur=0;
    	
    	}
    	else{
    	    ms = max(ms,cur);
    	}
    }
    cout<<ms<<endl;
}

