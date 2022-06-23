#include <iostream>
#include <string>
using namespace std;

struct knjiga
{
	string naslov;
	string avtor;
	int stStrani;
	bool zasedenost;//true => zasedeno	
};

struct knjiznica
{
	knjiga knjigarna[1000]={};
	//tabela knjig
};

void vnos(knjiznica bukve, int N)//getline(cin, poved,'/');
{
	for(int i = 0; i < N; i++)
	{
		cout<<i + 1<<".\n";
		cout<<"\nAvtor (koncaj z /): "; getline(cin, bukve.knjigarna[i].avtor, '/');
		cout<<"\nNaslov (koncaj z /): "; getline(cin, bukve.knjigarna[i].naslov, '/');
		cout<<"\nStevilo strani: "; cin>>bukve.knjigarna[i].stStrani;
		cout<<"\nZasebnost (0 ne, 1 da): "; cin>>bukve.knjigarna[i].zasedenost;
		
		system("CLS");
	};
};

void izpis(knjiznica bukve, int N)
{
	for(int i = 0; i < N; i++)
	{
		cout<<bukve.knjigarna[i].avtor<<endl;
		cout<<bukve.knjigarna[i].naslov<<endl;
		cout<<bukve.knjigarna[i].stStrani<<endl;
		cout<<bukve.knjigarna[i].zasedenost<<endl;
	};
};

int main()
{
	int N = 3;
	knjiznica bukvice;
	vnos(bukvice, N);
	izpis(bukvice, N);
	return 0;	
};
