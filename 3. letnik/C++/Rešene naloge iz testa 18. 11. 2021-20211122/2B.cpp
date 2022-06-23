#include <iostream>
#include <cmath>
using namespace std;

float V(float a)
{
	float V;
	V = sqrt(2)*pow(a,3)/3;
	return V;
};

int main()
{
	float Vol;
	float a = 13;

	Vol = V(a);
	cout<<"a = "<<a<<", V = "<<Vol<<endl;
	return 0;
};
