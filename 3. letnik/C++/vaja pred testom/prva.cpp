#include <iostream>
#include <cmath>

using namespace std;

float povrsina(float v, float r)
{
	float V;
	
	V = M_PI*pow(r,2)*v;
		
	return V;	
};

float prostornina(float v, float r)
{
	float P;
	
	P = 2*M_PI*r*(r + v);
		
	return P;
};

void izpis(float r, float v, float P, float V)
{
	cout<<"r = "<<r<<"\nv = "<<v<<"\nP = "<<P<<"\nV = "<<V<<"\n";
};

int main()
{
	float v = 1, r = 1, P, V;
	while(v > 0 && r > 0)
	{
		cout<<"Polmer je: ";
		cin>>r;
		cout<<"Visina je: ";
		cin>>v;
		P = povrsina(v, r);
		V = prostornina(v, r);
		izpis(r, v, P, V);
	}
	return 0;	
};
