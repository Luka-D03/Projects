/*
Spremljamo trening teka na 100 m.
Vnos podatkov kon�amo z 0.
izpi�i:
	-�tevilo poskusov (mora biti vsaj eden)
	-povpre�ni �as
	-najbol�i �as
	
Spremenljivke:
	tabela �asov: casi, tip: float
	velikost tabele: no znana, torej rezerviramo "malo" ve�: N = 100
	poskusi: poskusi, int, za�etna vrednost = 0
	povpre�ni �as (povcas, float)
	najbolj�i �as (najcas, float)
*/

#include <iostream>

using namespace std;

int main ()
{
	const int N = 100;//velikost tabele, naj bo konstanta
	float casi[N] = {};
	int poskusi = 0;
	float povcas = 0, najmanjsicas = 99999, cas;

//vnos �asov: �e uporabimo while. 1. �as preberemo pred zanko
	cout<<"Vnesi 1. cas: ";
	cin>>cas;
	
	while(cas != 0)//�e je razli�en od ni�, nadaljujemo
	{//pove�amo �tevilo poskusov za 1 in shranimo �as v tabelo
	
		poskusi++;
		casi[poskusi] = cas;
		cout<<"Vnesi "<<poskusi<<". cas: ";
		cin>>cas;
	};
	//test: izpis vne�enih �asov
/*	for(int i = 0; i <= poskusi; i++)
	{
		cout<<i<<" "<<casi[i]<<endl;	
	};*/
	
//povprecje in najgraj�i �as
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
