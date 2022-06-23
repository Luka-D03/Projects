#include <iostream>
#include <cmath>
using namespace std;

float V(float a)
{
	float V;
	V = sqrt(2)*pow(a,3)/12;
	return V;
};

int main()
{
	float a,Vol;
	cout<<"a = ";
	cin>>a;
	Vol = V(a);
	cout<<"a = "<<a<<", V = "<<Vol<<endl;
	return 0;
};
