/*
1. Deklariraj tabelo, z imenom Stevila, 
v kateri bo shranjenih najve? 10 decimalnih ?tevil.
2. S pomo?jo for zanke v tabelo vnesi ?tevila.
3. Izpi?i vsa ?tevila v obliki: Stevila[*]=**, * - indeks, ** - vrednost
4. Se?tej vsa ?tevila v tabeli. Izpis rezultata.
4. Se?tej vsako drugo ?tevilo, za?ni s prvim. Izpis rezultata.
*/
#include <iostream>
using namespace std;

int main()
{
//1. deklaracija
	int N = 5;
	float Stevila[N];// 1.
	float vsota = 0;
//2. Branje števil
	for(int i = 0; i<N; i++)//najveèji indeks je 9: 0,1,2,3,4,5,6,7,8,9
	{
		cout<<"Stevila["<<i<<"] = ";
		cin>>Stevila[i];
	};
	cout<<endl;
//3. izpis vseh
	for(int i = 0; i<N; i++)//najveèji indeks je 9: 0,1,2,3,4,5,6,7,8,9
	{
		cout<<"Stevila["<<i<<"] = "<<Stevila[i]<<endl;
	};
//4. Vsota vseh števil
	for(int i = 0; i<N; i++)//najveèji indeks je 9: 0,1,2,3,4,5,6,7,8,9
	{
		vsota = vsota + Stevila[i];
	};
	cout<<"Vsota je: "<<vsota<<endl;
//5. Vsota vsakega drugega, za?nemo z prvim (i =  0), ce zacnemo z 11.: i = 12
	for(int i = 0; i<N; i = i + 2)//najveèji indeks je 9: 0,1,2,3,4,5,6,7,8,9
	{
		vsota2 = vsota2 + Stevila[i];
	};
	cout<<"Vsota vsakega drugega je: "<<vsota2<<endl;
	return 0;
};
