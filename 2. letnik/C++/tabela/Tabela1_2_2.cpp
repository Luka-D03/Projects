/*
1. Deklariraj tabelo, z imenom Stevila, 
v kateri bo shranjenih največ 10 decimalnih števil.
2. S pomočjo for zanke v tabelo vnesi števila.
3. Izpiši vsa števila v obliki: Stevila[*]=**, * - indeks, ** - vrednost
4. Seštej vsa števila v tabeli. Izpis rezultata.
5. Seštej vsako drugo število, začni s prvim. Izpis rezultata.
https://www.onlinegdb.com/online_c++_compiler
*/
#include <iostream>
using namespace std;

int main()
{//1. deklaracija
	const int N = 10;
	float Stevila[N]={};
	float vsota = 0, vsota2= 0;//za�etna vrednost za vsoto je 0 (nevtralni element za se�tevanje)
	//Nevtralni element za mno�enje je 1: produkt = 1
//2. Branje �tevil
	for(int i = 0;i<N;i++)//najve�ji indeks je 9: 0,1,2,3,4,5,6,7,8,9
	{
		cout<<"Stevila["<<i<<"] = ";
		cin>>Stevila[i];
	};
	cout<<endl;//prazna vrstica = skok v novo vrsto = prelom vrstice
//3. izpis vseh
	for(int i = 0;i<N;i++)//najve�ji indeks je 9: 0,1,2,3,4,5,6,7,8,9
	{
		cout<<"Stevila["<<i<<"] = "<<Stevila[i]<<endl;

	};
//4. Vsota vseh �tevil
	for(int i = 0;i<N;i++)//najve�ji indeks je 9: 0,1,2,3,4,5,6,7,8,9
	{
		vsota = vsota + Stevila[i];
	};
	cout<<"Vsota je: "<<vsota<<endl;
//5. vsota vsakega drugega, za�nemo z prvim (i = 0), �e za�nemo z 11.: i = 12

	for(int i = 0; i<N ; i = i + 2)//vsak drugi, indeks se pove�a za 2
	{
		vsota2 = vsota2 + Stevila[i];
	};
	cout<<"Vsota vsakega drugega je: "<<vsota2<<endl;
	return 0;
};

