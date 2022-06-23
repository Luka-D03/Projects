/*
Osnovni primer klica po referenci
*/
#include <iostream>
using namespace std;

void primer(int a, int &b) 
{//v spremenljivko z & lahko shranimo rezultat
	a = a + 5;
	b = b + 5;
	//!!!RETURNa NI!!!
};
int main()
{
	int a, b;
	a = b = 1;
	cout<<"Pred klicem: a = "<<a<<", b = "<<b<<endl;
	primer(a,b);
	cout<<"Po klicu: a = "<<a<<", b = "<<b<<endl;
	return 0;
};
