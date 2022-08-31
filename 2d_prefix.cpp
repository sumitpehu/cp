
#include<bits/stdc++.h>
using namespace std;
#define int long long


signed main()
{
	int n,m;
	cin>>n>>m;
	int arr[n][m];
	for(int i =0; i<n; i++)
	{
		for(int j =0; j<m; j++){
		
			cin>>arr[i][j];
		}
	}
	int arr1[n][m];
	arr1[0][0]=arr[0][0];
	
	for(int i =1; i<m; i++)
	{
		arr1[0][i]=arr1[0][i-1]+arr[0][i];
	}
	for(int i =1; i<n;  i++)
	{
		for(int j=0; j<m; j++)
		{
			if(j==0)arr1[i][j]=arr[i][j]+arr1[i-1][j];
			else
			arr1[i][j]=arr1[i][j-1]+arr1[i-1][j]+arr[i][j]-arr1[i-1][j-1];
		}
	}
	int p;
	cin>>p;
	for(int i =0; i<p; i++)
	{
		
		int i1,j1,i2,j2;
		cin>>i1>>j1>>i2>>j2;
		int ans=arr1[i2][j2]-(arr1[i1-1][j2]+arr1[i2][j1-1])+arr1[i1-1][j1-1];
		cout<<ans<<endl;
	}
	
}
	
	
