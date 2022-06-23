/*
1. Funkcija za met kocke
2. Shranimo N metov kocke
3. Pre�tejemo, kolikokrat se posamezna �tevilka pojavi
*/
#include <iostream>
#include <cstdlib>//statististi�ne funkcije => rand()
#include <ctime>//�asovne funkcije
using namespace std;

int met()
{
	int StMet;
	//vrednosti od 1 do 6
	StMet = rand()%6 + 1;//ostanki pri deljenju s 6: 0,1,2,3,4,5 => +1 
	return StMet;
};
//Funkcija, ki shrani N vrednosti metov
void Meti(int VrMetov[], int N)
{//shranimo "mete" v tabelo 
	for(int i = 0; i<N; i++)
		VrMetov[i] = met();//na vsakem koraku vr�emo kocko
};
void izpis(int tab[], int N)
{//za vse tabele, zato je poimenovanje tabele brezpredmetno
	for(int i = 0; i<N; i++)
	{
		if(i%30==0)//30 v vrsto
			cout<<endl;
		cout<<tab[i]<<" ";
	};	
};
//�tetje posameznih metov
int main()
{
	int N = 1200;
	int kocka[N];
	srand(time(0));
	Meti(kocka, N);//funkcija meti je znotraj te funkcije
	izpis(kocka, N);
		
	return 0;
}
