/*
Zamenjaj vrstni red števil v ISTI tabeli.
Zadnjiè: dve tabeli (N korakov)
*/
#include <iostream>
using namespace std;

void menjaj(int tabela[], int N)
{
	//Ideja: zamenjamo 1. in zadnjega, 2. in predzadnjega,
	//3. in predpredzadnjega....
	int rez;
	for(int i = 0; i < N/2; i++)
	{
		rez = tabela[i];
		tabela[i] = tabela[N - 1 - i];
		tabela[N - 1 - i] = rez;
	};
};

void izpis(int tabela[], int N)
{
	for(int i = 0; i < N; i++)
		cout<<tabela[i]<<" ";
		
	cout<<endl;
};

int main()
{
	int N = 10;
	int tab[N] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	izpis(tab, N);
	menjaj(tab, N);
	izpis(tab, N);
	return 0;
}

