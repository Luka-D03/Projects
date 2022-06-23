/*
kvader : a, b, c
Izraèunaj: P, V, D
a) funkcije za P, V, D
b) ena funkcija, tipa void, klic po referenci
*/

#include <iostream>
#include <cmath>
using namespace std;

float P(float a, float b, float c)
{
	float P;
	P = 2*(a*b + a*c + b*c);
	return P;
};

float V(float a, float b, float c)
{
	float V;
	V = a*b*c;
	return V;
};

float D(float a, float b, float c)
{
	float D;
	D = sqrt(pow(a,2)+pow(b,2)+pow(c,2));
	return D;
};

void kvader(float a, float b, float c, float &Po, float &Vo, float &Di)
{
	Po = P(a,b,c);
	Vo = V(a,b,c);
	Di = D(a,b,c);
};

void izpis(float a, float b, float c, float P, float V, float D)
{
	cout<<"a = "<<a<<endl<<"b = "<<b<<endl<<"c = "<<c<<endl<<endl;
	cout<<"P = "<<P<<endl<<"V = "<<V<<endl<<"D = "<<D<<endl;
};

int main()
{
	float a, b, c, P, V, D;
	cout<<"Vnesi stranico a: ";
	cin>>a;
	cout<<"Vnesi stranico b: ";
	cin>>b;
	cout<<"Vnesi stranico c: ";
	cin>>c;
	kvader(a, b, c, P, V, D);
	izpis(a, b, c, P, V, D);
	
	return 0;
};
