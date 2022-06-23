/* V tabelo z imenom VredF shrani vrednosti funkcije za števila med -5 in 10 s korakom 1/4. 
Funkcija: y = 2*x^3 - 2x^2 + 3x+4
Program naj, v posebni zanki, poišèe tudi najveèjo in najmanjšo shranjeno vrednost.
*/
#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	const int N = 70;//med -5 in 10 velikosti tabele
	float VredF[N] = {};
	//potrebujemo dva števca:x, i - mesta v taeli
	//Ker sta razliènih tipov, jih deklariramo pred for zanko
	int i;
	float x;
	for(i = 0, x = -5;  x <= 10; i++, x = x+0.25)//preverjamo le x
	{
		VredF[i] = 2*pow(x,3) - 2*pow(x,2) + 3*x + 4;
		cout<<"VredF["<<i<<"] za x = "<<x<<" je "<<VredF[i]<<endl;
	};
	//z WHILE zanko
	cout<<"\nZ while zanko:\n";
	i = 0;
	x = -5;
	while(x <= 10)
	{
		VredF[i] = 2*pow(x,3) - 2*pow(x,2) + 3*x + 4;
		cout<<"VredF["<<i<<"] za x = "<<x<<" je "<<VredF[i]<<endl;
		i++;
		x = x + 0.25;
	}
	
	return 0;
};




