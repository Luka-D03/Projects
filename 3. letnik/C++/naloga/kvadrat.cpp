/*
deklariraj funkcijo za izraèun plošèine kvadrata.
V glavnem programu vnesi N (=10) polmerov.
Polmere shrani v tabelo Stranice, plošèine v tabelo plošèine.
Isti index (isto mesto) v tabeli pomeni podatek za isti kvadrat.
Glej zvazek: 8. 10. 22
*/
#include <iostream>
using namespace std;

float Plkv(float a)
{
	float P;
	P = a*a;
	return P;	
};
//deklariraj funkcijo za zapis "ENEGA" gvadrata.

void izpis(float stranica, float ploscina)
{
	cout<<"\t Stranica: "<<stranica<<", ploscina: "<<ploscina<<endl;
}// \t tabulatorsko mesto
 int main()
{
	float a, P;
	const int N = 10;
	
	float stranice[N] = {}, ploscine[N] = {};
	for(int i = 0; i < N; i++)
	{
		cout<<"Vnesi "<<i+1<<". stranico: ";
		cin>>a;
		P = Plkv(a);
		//na i-to mesto shranimo a
		stranice[i] = a;//shranimo stranico
		ploscine[i] = P;//shranimo plošèino
	};
	//zanka za izpis
	cout<<endl<<endl<<endl;
	for(int i = 0; i < N; i++)
		izpis(stranice[i], ploscine[i]);//podatki so na istem mestu v tabelah
	cout<<endl<<endl<<endl;
	
	cout<<"\nMesto v tabeli (i): "<<endl;
	for(int i = 0; i <N; i++)
		cout<<"\t"<<i+1;
		
	cout<<"\nStranice (a): "<<endl;
	for(int i = 0; i < N; i++)
		cout<<"\t"<<stranice[i];
		
	cout<<"\nPloscine (P): "<<endl;
	for(int i = 0; i < N; i++)
		cout<<"\t"<<ploscine[i];
	return 0;
};
 
