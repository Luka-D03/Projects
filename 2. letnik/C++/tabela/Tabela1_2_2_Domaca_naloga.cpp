/*/*
1. Deklariraj tabelo, z imenom Cela, 
v kateri bo shranjenih najveè 15 celih števil.
2. S pomoèjo for zanke v tabelo vnesi števila.
3. Izpiši vsa števila v obliki: Cela[*]=**, * - indeks, ** - vrednost
4. Zmnoži vsa števila v tabeli. Izpis rezultata.
4. Seštej vsako tretje število, zaèni s prvim. Izpis rezultata.
*/
#include <iostream>
using namespace std;

int main()
{
	int N = 15;
	float Cela[N]={};
	float vsota = 1, vsota2= 0;
	
	for(int i = 0;i<N;i++)
	{
		cout<<"Cela["<<i<<"] = ";
		cin>>Cela[i];
	};
	
	for(int i = 0;i<N;i++)
	{
		cout<<"Cela["<<i<<"] = "<<Cela[i]<<endl;

	};
	
	for(int i = 0;i<N;i++)
	{
		vsota = vsota * Cela[i];
	};
	cout<<"Zmnožek števil je: "<<vsota<<endl;
	
	for(int i = 0; i<N ; i = i + 3)
	{
		vsota2 = vsota2 + Cela[i];
	};
	cout<<"Vsota vsakega tretjega je: "<<vsota2<<endl;
	return 0;
};
