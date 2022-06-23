/*
Zapiši program, ki shrani vrednosti funkcije f(x)= 3x^3-2x za soda števila med 11 in 111 v tabelo Vrednosti. 
Izra?una in izpiše naj povpre?no vrednost izra?unanih vrednosti. Uporabi for zanko.
*/

#include <iostream>
#include <cmath>

using namespace std;

int main()
{
	const int N = 120;
	float Vrednosti[N] = {};
	float vnosi = 12, vsota = 0, x = 12, povprecje;
	
	for(int i = 12;i < 111 ; i++, x++)
	{
		
		if(i%2 == 0)
		{
			Vrednosti[i] = 3 * pow(x,3) - 2 * x;
            cout << "Vrednost[" << i << "] za f("<<x<<") = " << Vrednosti[i] << endl;
            vsota += Vrednosti[i];
            vnosi += 1;
		};
	};
	
	povprecje = vsota/vnosi;
	cout << "Povprecje stevil je: " << povprecje << endl;
	
	return 0;
};
