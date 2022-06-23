#include <iostream>
using namespace std;
/***********************************************************************
 *Èe funkcija le spremeni vrednosti v tabeli, naj bo tipa void,		   *
 *èe pa s pomoèjo izraèunamo kakšno vrednost (minimum, povpreèje, ...),*
 *pa naj bo tipa, ki ga funkcija vraèa.                                *
 ***********************************************************************/

//Poveèa vrednosti v tabeli za 1 (spremeni le vrednosti => void)

void poveca(int tabela[], int N)//ime tabele[], velikost
{//Dejansko tebela[] "pokaže" na prvi element, N je pa število elementov
//Kazalec na prvega, kar bi morala funkcija vsebovati N števil kot argument
//POZOR: spreminjajo se vrednosti v "originalu".
	for(int i = 0; i < N; i++)//zaènemo z 0, ker se šteje v tabeli z 0
	{
		tabela[i]++;// tabela[i] = tabela[i]+1; tabela[i]+=1
	};
};
void izpis(int stevila[], int M)//ime ni pomembno!! Pomemben je tip!
{
	for(int i = 0; i < M; i++)//zaènemo z 0, ker se šteje v tabeli z 0
	{
		cout<<stevila[i]<<endl;
	};
};
void vnos(int stevila[], int M)//ime ni pomembno!! Pomemben je tip!
{
	for(int i = 0; i < M; i++)//zaènemo z 0, ker se šteje v tabeli z 0
	{
		cout<<"vnesi "<<i+1<<". stevilo: ";
		cin>>stevila[i];
	};
};
int main()
{
	int I = 7;
	int tab[I] = {1, 2, 3, 4, 5, 6, -1};
	vnos(tab, I);
	poveca(tab, I);//le ime in velikost, brez []
	izpis(tab, I);
	return 0;
};
