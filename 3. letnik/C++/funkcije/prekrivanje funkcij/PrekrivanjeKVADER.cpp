/*
Funkcije imajo isto ime, razlikujejo se le v argumentih:
- Število argumentov
- Tip argumenta

Volumen kvadra: V = a*a*a
*/
#include <iostream>
using namespace std;

float V()
{
	cout<<"Enotska kocka\n";
	return 1;
};

float V(float a)
{
	float V;
	cout<<"Kocka\n";
	V = a*a*a;
	return V;
};

float V(float a, float c)
{
	float V;
	cout<<"Osnovna ploskev je kvadrat\n";
	V = a*a*c;
	return V;
};

float V(float a, float b, float c)
{
	float V;
	cout<<"Kvader\n";
	V = a*b*c;
	return V;
};

int main()
{
	float pr;
	pr = V();
	cout<<"1, pr = "<<pr<<endl<<endl;
	
	pr = V(2);
	cout<<"8, pr = "<<pr<<endl<<endl;
	
	pr = V(2, 3);
	cout<<"12, pr = "<<pr<<endl<<endl;
	
	pr = V(2, 4, 5);
	cout<<"40, pr = "<<pr<<endl<<endl;
	
	return 0;
	
}
