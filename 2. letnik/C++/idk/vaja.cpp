#include <iostream>
#include <cmath>

using namespace std;

int main()
{
	int x, y, z = 0;
	
	cout<<"Enter a number: ";
	cin>>x;
	
	cout<<"\nEnter how much lines of numbers you want: ";
	cin>>y;
	
	for(int i = 1; i <= y; i++)
	{
		z = pow(x, i);
		cout<<x<<" * "<<i<<" = "<<z<<endl;
	};
};
