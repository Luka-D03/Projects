/********************************************************************************
*	1. Generiraj 50 naklju�nih decimalnih �tevil (na 2 decimalni mesti)			*
*	2. Prepi�i jih v drugo tabelo v obratnem vrstnem redu.						*
*	3. Zapi�i program, ki pre�teje koliko �tevil je manj�ih od danega �tevila.	*
*********************************************************************************/
#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

void generiraj(float nakljucna[], int N, int a, int b)
{
	/*tabele velikosti N, �tevila mad a in b*/
	srand(time(0));/*SAME: za�etno vrednost ve�emo na sistemski �as*/
	a = 100*a;
	b = 100*b;
	float nakl;
	if(a>b)/*ju zamenjam*/
	{
		int r = a;
		a = b;
		b = r;
	};
	for(int i = 0; i < N; i++)
	{
		nakl = a+rand()%(b-a+1);/*ostanek pri deljenju le za cela*/
		/*shranimo v decimalno �tevilo, ki ga brez izgube delimo s 100*/
		nakljucna[i] = nakl / 100;
	};
};

void izpis(float tab[], int N)
{
	for(int i = 0; i < N; i++)
		cout<<tab[i]<<", ";	
	cout<<endl<<endl;
};

void prepis(float original[], float obratno[], int N)
{
	for(int i = 0; i < N; i++)
		obratno[N-i-1] = original[i];	
};

int StManj(float tab[], int N, float st)
{/*koliko je man�ih od st*/
		int kolikom = 0;
		for(int i = 0; i < N; i++)
			if(st < tab[i])
				kolikom++;
	return kolikom;
};

int main()
{
	int N = 100, stm;
	float a = 0, b = 100, st;
	float tab[N], preb[N];
	
	generiraj(tab, N, a, b);
	/*izpis(tab, N);*/
	prepis(tab, preb, N);
	/*izpis(preb, N);*/
	
	cout<<"x = ";
	cin>>st;
	
	stm = StManj(tab, N, st);
	cout<<stm<<endl;
	
	stm = StManj(preb, N, st);
	cout<<stm<<endl;
	
	return 0;
};
