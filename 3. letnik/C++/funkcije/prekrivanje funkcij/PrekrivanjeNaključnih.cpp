/*
 Generiranje nakljuène tabele
*/

#include <iostream>
#include <cstdlib>//statistiène funkcije => rand()
#include <ctime>//èasovne funkcije
using namespace std;

void generiraj(int tabela[], int N)//N števil med a in b
{//tabela, N koliko mest v tabeli
	cout<<"Brez omejitev:\n";
	for(int i = 0; i < N; i++)
		tabela[i] = rand();
};

void generiraj(float nakljucna[], int N, int a, int b)
{
	cout<<"Decimalna:\n";
	//tabele velikosti N, števila med a in b
	a = 10000 * a;
	b = 10000 * b;
	if(a > b)//ju zamenjam
	{
		int r = a;
		a = b;
		b = r;
	};
	for(int i = 0; i < N; i++)
		nakljucna[i] = (float)(a+rand()%(b-a+1))/100;
};

void generiraj(int tabela[], int N, int a, int b)//N števil med a in b
{//tabela, N koliko mest v tabeli
	cout<<"Cela:\n";
	if(a > b)//ju zamenjam
	{
		int r = a;
		a = b;
		b = r;
	};
	for(int i = 0; i < N; i++)
		tabela[i] = a + rand()%abs(a-b-1);
};

int main()
{
	srand(time(0));//SEME: zaèetno vrednost vežemo na sistemski èas
	int N = 100;
	int a = 1, b = 200;
	int itab[N];//cela
	float ftab[N];//decimalna
	int tab[N];//brez omejitev
	generiraj(ftab, N, a, b);
	for(int i = 0; i < N; i++)
		cout<<ftab[i]<<", ";
		
	cout<<endl<<endl;
	
	generiraj(itab, N, a, b);
	for(int i = 0; i < N; i++)
		cout<<itab[i]<<", ";
	
	cout<<endl<<endl;
	
	generiraj(tab, N);
	for(int i = 0; i < N; i++)
		cout<<tab[i]<<", ";
	
	return 0;
}

