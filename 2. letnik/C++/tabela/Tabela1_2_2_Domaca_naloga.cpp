/*/*
1. Deklariraj tabelo, z imenom Cela, 
v kateri bo shranjenih najve� 15 celih �tevil.
2. S pomo�jo for zanke v tabelo vnesi �tevila.
3. Izpi�i vsa �tevila v obliki: Cela[*]=**, * - indeks, ** - vrednost
4. Zmno�i vsa �tevila v tabeli. Izpis rezultata.
4. Se�tej vsako tretje �tevilo, za�ni s prvim. Izpis rezultata.
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
	cout<<"Zmno�ek �tevil je: "<<vsota<<endl;
	
	for(int i = 0; i<N ; i = i + 3)
	{
		vsota2 = vsota2 + Cela[i];
	};
	cout<<"Vsota vsakega tretjega je: "<<vsota2<<endl;
	return 0;
};
