#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	unsigned int vsota = 0, st;
	while(vsota<4000)
	{
		cout<<"vnesi stevilo: ";
		cin>>st;
		if(st<50)
			vsota = vsota + st;//vsota += st;
		else
			cout<<"Stevilo je preveliko.\n";
			
		cout<<"vsota sestetih stevil je "<<vsota<<".\n";
	};
	return 0;
};
