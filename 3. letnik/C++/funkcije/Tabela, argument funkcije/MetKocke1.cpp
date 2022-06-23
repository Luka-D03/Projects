/*
1. Funkcija za met kocke
2. shranimo N metov kocke
3. Preštejemo, kolikokrat se posamezna številka pojavi
*/
#include <iostream>
#include <cstdlib>//statistiène funkcije => rand()
#include <ctime>//èasovne funkcije
using namespace std;

int met()
{
	int StMet;

	//vrednosti od 1 do 6
	StMet = rand()%6 +1;//ostanki pre deljenju s 6: 0, 1, 2, 3, 4, 5 => +1
	return StMet;
};
//Funkcija, ki shrani N vrednosti metov
void Meti(int VrMetov[], int N)
{
	for(int i = 0; i < N; i++)
		VrMetov[i] = met();//na vsakem koraku vržemo kocko
};
void izpis(int tab[], int N/*int ena, int dva, int tri, int stiri, int pet, int sest*/)//za vse tabele, zato je poimenovanje tabele prezpredmetno
{
	for(int i = 0; i < N; i++)
	{
		if(i % 20 == 0)
			cout<<endl;
		cout<<tab[i]<<" ";
	};
	//cout<<"\n\n1 = "<<ena<<" krat\n2 = "<<dva<<" krat\n3 = "<<tri<<" krat\n4 = "<<stiri<<" krat\n5 = "<<pet<<" krat\n6 = "<<sest<<" krat"<<endl;
	
};
//štetje posameznih metov
/*void stetje(int tab[], int N, int &ena, int &dva, int &tri, int &stiri, int &pet, int &sest)
{
	for(int i = 0; i < N; i++)
	{
		if(tab[i] == 1)
			ena++;
		if(tab[i] == 2)
			dva++;
		if(tab[i] == 3)
			tri++;
		if(tab[i] == 4)
			stiri++;
		if(tab[i] == 5)
			pet++;
		if(tab[i] == 6)
			sest++;
	};
};
*/
void stetje2(int stevc[], int Meti[], int N)
{
	stevc[7] = {};//za vsako "vrednost" meta eno mesto
	//stevc[0] nima pomena, v praksi lahko meti "gori"
	for(int i = 0; i < N; i++)//Meti[i] = 3 => stevc[3]++
	{
		stevc[Meti[i]]++;
	};	
};
//3 enake cifre zapored: kolikokrat (return) in kje (tabela)

int enake(int Meti[]/*podatek*/, int N, int kje[]/*na katerih mestih*/)
{
	int k = 0;
	for(int i = 0;i < N-3; i++)//primerjamo 3 zaporedne
	if(Meti[i] == Meti[i+1] == Meti[i+2])
	{
		kje[k] = i;//kje
		k++;
	};
	return k;//število "treh zaporedni enaki"
};

int main()
{
	srand(time(0));//naj se zažene le enkrat
	int N = 100, koliko3/*ena = 0, dva = 0, tri = 0, stiri = 0, pet = 0, sest = 0*/;
	int kocka[N] = {}, stevec[7] = {}/*na mestih od 1 do 6 shranimo posamezni "metov"*/, kje[] = {};
	Meti(kocka, N);//funkcija meti znotraj funkcije
	
	izpis(kocka, N /*ena, dva, tri, stiri, pet, sest*/);
	cout<<"\n------------------------------"<<endl;
	stetje2(stevec, kocka, N);
	izpis(stevec, 7);
	cout<<"\n------------------------------"<<endl;
	koliko3 = enake(kocka, N, kje);
	
	cout<<"\nStevilo trojk: "<<
	
	cout<<"\n\nIndeksi trojk\n";
	for(int i = 0; i < koliko3; i++)
		cout<<kje[i]<<endl;
		
	return 0;
};
