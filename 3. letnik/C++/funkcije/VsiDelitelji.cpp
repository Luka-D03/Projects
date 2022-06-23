/*
Poišèi in shrani vse delitelje danega števila
*/
#include <iostream>
#include <cmath>
using namespace std;

void Delitelji(int N, int DelN[], int &StDel)
{
	StDel = 0;//števec deliteljev in v tabeli DelN
	//Ostanek pri deljenju mora biti 0
	for(int i = 1; i <= sqrt(N); i++)//le do korena
	{//Delitelja sta (èe sta) i in n/i
	//v enem koraku zanke for dobimo dva delitelja
		if(N % i == 0)
		{
			DelN[StDel] = i;//20/5 = 4 => sta delitelja obe števili, 4 in 5
			DelN[StDel + 1] = N/i;
			StDel += 2;
		}
	};
	if(sqrt(N) == (int)sqrt(N))//(int) celi del
	{
		//StDel++;
		DelN[StDel] = (int)sqrt(N);
	}
};

void izpis(int tab[], int N)
{
	for(int i = 0; i < N; i++)
		cout<<tab[i]<<endl;
}
//vsota deliteljev
//V tabeli imamo že izraèunane delitelje, torej jih le seštejemo
int Vsota(int Del[], int st)
{
	int suma = 0;
	for(int i = 0; i < st; i++)
		suma = suma + Del[i];
	return suma;
};

int main()
{
	int N = 8128, St;//6, 28, 496, 8128... => popolna števila
	int Del[N] = {};
	Delitelji(N, Del, St);
	izpis(Del, St);//st - koliko je deliteljev
	cout<<"st. "<<N<<" ima "<<St<<" deliteljev.\n";
	if(St == 2)//èe ima natanko dva delitelja, je praštevilo (1 ni)
		cout<<N<<" je prastevilo.\n";
	if(N == Vsota(Del, St)/2)
		cout<<"Stevilo "<<N<<" je popolno.\n";
	return 0;
};
