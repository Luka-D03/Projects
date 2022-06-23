/*
N! = 1*2*3*......(N-1)*N
5! = 5*4*3*2*1 = 120
*/

#include <iostream>

using namespace std;

long long fak(int N)
{
		if(N>1)
			return N*fak(N-1);
		else
			return 1;
};

int main()
{
	long long N, f;
	
	cout<<"N = ";
	cin>>N;
	for(int N = 1; N < 70; N++)
	{
		f = fak(N);
		cout<<N<<"! = "<<f<<endl;
	}
	
	return 0;
};
