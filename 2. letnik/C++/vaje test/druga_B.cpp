#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	float r, ob;
	const float Pi = 3.14159;
	//do - while: prvo branje pred zanko, v zanki na koncu
	cout<<"Vnesi polmer: ";
	cin>>r;	
	do
	{
		ob = 2*Pi*r;
		cout<<"r = "<<r<<"; o = "<<ob <<endl;

		cout<<"Vnesi polmer: ";
		cin>>r;//pri r = 0, konèa takoj
	}while(r>0);
	return 0;
};
