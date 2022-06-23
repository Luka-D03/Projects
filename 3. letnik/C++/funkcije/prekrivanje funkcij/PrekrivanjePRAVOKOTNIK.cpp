/*
Funkcije imajo isto ime, razlikujejo se le v argumentih:
- Število argumentov
- Tip argumenta

Enotski: a = b = 1, P = 1
Kvadrat: a = b, P = a * a
Pravokotnik: a<>b, P = a * b
*/

#include <iostream>

using namespace std;

float P()
{
	cout<<"Kvadrat s stranico 1\n";
	return 1;
};

float P(float a)
{
	float P;
	cout<<"Kvadrat s stranico a.\n";
	P = a * a;
	return P;
};

float P(float a, float b)
{
	float P;
	cout<<"Pravokotnik, a<>b.\n";
	P = a * b;
	return P;
};

int main()
{
	cout<<P()<<endl;//a = b = 1
	cout<<P(3.4)<<endl;//a = b = 3,6 EN PODATEK
	cout<<P(2.1, 3.6)<<endl;//pravokotnik PIKA JE DECIMALNA VEJICA!!
	return 1;
};
