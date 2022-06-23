/*
Spremljamo trening teka na 100 m.
Vnos podatkov konèamo z 0.
izpiši:
	-število poskusov (mora biti vsaj eden)
	-povpreèni èas
	-najbolši èas
	
Spremenljivke:
	tabela èasov: casi, tip: float
	velikost tabele: no znana, torej rezerviramo "malo" veè: N = 100
	poskusi: poskusi, int, zaèetna vrednost = 0
	povpreèni èas (povcas, float)
	najboljši èas (najcas, float)
*/

#include <iostream>

using namespace std;

int main ()
{
	const int N = 100;//velikost tabele, naj bo konstanta
	float casi[N] = {};
	int poskusi = 0;
	float povcas = 0, najmanjsicas = 99999, cas;

//vnos èasov: èe uporabimo while. 1. èas preberemo pred zanko
	cout<<"Vnesi 1. cas: ";
	cin>>cas;
	
	while(cas != 0)//èe je razlièen od niè, nadaljujemo
	{//poveèamo število poskusov za 1 in shranimo èas v tabelo
	
		poskusi++;
		casi[poskusi] = cas;
		cout<<"Vnesi "<<poskusi<<". cas: ";
		cin>>cas;
	};
	//test: izpis vnešenih èasov
/*	for(int i = 0; i <= poskusi; i++)
	{
		cout<<i<<" "<<casi[i]<<endl;	
	};*/
	
//povprecje in najgrajši èas
	for(int i = 0; i <= poskusi; i++)
		povcas = povcas + casi[i];	
		
	povcas = povcas/poskusi;
	cout<<"Povprecni cas: "<<povcas<<endl;
	
//minimum: najmanjsicas
	//najmanjsicas = casi[0];//in vse ostale primerjamo z njim
	
	for(int i = 1; i <= poskusi; i++)
	{
	if(casi[i] < najmanjsicas)
		najmanjsicas = casi[i];	
	};
	cout<<"Rekord dneva: "<<najmanjsicas<<endl;
	
	return 0;
};
