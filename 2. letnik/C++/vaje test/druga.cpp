#include <iostream>
#include <cmath>
using namespace std;
/* Zapiši program, ki izraèuna vrednosti funkcije f(x)= 3x^3-2x 
za soda števila med 11 in 111.
Izraèuna in izpiše naj povpreèno vrednost izraèunanih vrednosti. 
Uporabi for zanko.*/

int main()
{
	float x, y, povpr=0;
	int n = 0;
	//soda med 11 in 111
	for(float x = 12; x<=110; x=x+2)
	{
		y = 3*pow(x,3)-2*x;
		povpr = povpr+y;//vsoto shranimo kar v povpr
		n++;//preštejemo, koliko števil
	};
	povpr = povpr/n;
	cout<<endl<<endl<<"povpr = "<<povpr<<endl;
	return 0;
};
