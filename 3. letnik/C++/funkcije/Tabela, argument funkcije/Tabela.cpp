#include <iostream>
using namespace std;
/***********************************************************************
 *�e funkcija le spremeni vrednosti v tabeli, naj bo tipa void,		   *
 *�e pa s pomo�jo izra�unamo kak�no vrednost (minimum, povpre�je, ...),*
 *pa naj bo tipa, ki ga funkcija vra�a.                                *
 ***********************************************************************/

//Pove�a vrednosti v tabeli za 1 (spremeni le vrednosti => void)

void poveca(int tabela[], int N)//ime tabele[], velikost
{//Dejansko tebela[] "poka�e" na prvi element, N je pa �tevilo elementov
//Kazalec na prvega, kar bi morala funkcija vsebovati N �tevil kot argument
//POZOR: spreminjajo se vrednosti v "originalu".
	for(int i = 0; i < N; i++)//za�nemo z 0, ker se �teje v tabeli z 0
	{
		tabela[i]++;// tabela[i] = tabela[i]+1; tabela[i]+=1
	};
};
void izpis(int stevila[], int M)//ime ni pomembno!! Pomemben je tip!
{
	for(int i = 0; i < M; i++)//za�nemo z 0, ker se �teje v tabeli z 0
	{
		cout<<stevila[i]<<endl;
	};
};
void vnos(int stevila[], int M)//ime ni pomembno!! Pomemben je tip!
{
	for(int i = 0; i < M; i++)//za�nemo z 0, ker se �teje v tabeli z 0
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
