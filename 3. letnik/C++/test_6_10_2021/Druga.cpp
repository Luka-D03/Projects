#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	float R, P, V;
	const float pi = 3.142;
	cout<<"Vnesi st.: ";
	cin>>R;
	P = 4*pi*pow(R,2);
	V = 4*pi*pow(R,3)/3;
	return 0;
};
