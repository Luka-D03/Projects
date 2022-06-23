/*
Prekrivanje:
Funkcije imajo enako ime.
Katera od njih se izvr�i, je odvisno od:
	- �tevila argumentov in (ali)
	- Tipa argumentov.
Ra�unanje potenc:
- �e je n celo �tevilo: a*a*a*a*a*a
- �e je n decimalno: pow(a,n)	
*/

#include <iostream>
#include <cmath>
using namespace std;

float P(float a, int n)
{//ra�unamo kot produkt
	float P = 1;
	for(int i = 1; i <= n; i++)
	{
		P = P * a;	
	};
	return P;
};

float P(float a, float n)
{//ra�unamo s funkcijo
	float P;
	P = pow(a,n);
	return P;
};

int main()
{
	float a = 3, x = 2.3;
	int n = 4;
	cout<<"P(3,4) = "<<P(a,n)<<endl;//n celo
	cout<<"P(3,2.3) = "<<P(a,x)<<endl;//x decimalno
	return 0;	
};
