#include <iostream>
#include <cmath>
using namespace std;
/*. a)Zapiši program, ki izraèuna vrednosti funkcije y= 3x^3-2x+3 za vsa cela števila med 12 in 112.
b) Izraèunane vrednosti naj sproti shranjuje v tabelo z imenom vrednosti.
c) Program naj izraèuna in izpiše najveèjo vrednost izraèunanih vrednosti v tabeli vrednosti.

*/
int main()
{
	int x, y;//y je spremenljivka za izraèun y 
	int vrednosti[101]={};//112-12 = 100, prištejemo še prvo (12): 101
	int max;//spremenljivka, kjer bomo shranili njaveèjo vrednost
	int i;//števec v tabeli vrednosti, na katerem mestu je izraèunana vreednost y
	//for(zaèetne vrednosti "števcev"; pogoj; spremembe "števcev"
	//x je med 12 in 112, vrednosti v tabeli je 101
	for(i=0, x = 12;x<=112;x++, i++)
	{
		y = 3*pow(x,3)-2*x+3;//izraèunamo y
		vrednosti[i]=y; //y shranimo na i-to mesto v tabeli
	};
	//prvi kandidat za max naj bo kar prvi element v tabeli
	max = vrednosti[0];
	//vse ostale vrednosti primerjamo z max, èe je
	//vrednost v tabeli višja, dobi max to vrednost
	for(int k = 0;k<101;k++)
	{
		if(vrednosti[k]>max)
			max = vrednosti[k];
	};
	cout<<"max = "<<max<<endl;
	return 0;	
};







