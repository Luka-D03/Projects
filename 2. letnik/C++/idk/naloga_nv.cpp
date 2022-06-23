/*Nora števila

2. Števil je noro, èe v razcepu na prafaktorje vsebuje le števila 7 in 3.
Sestavi program, ki bo izpisal vsa nora števila med ena in N. 
Uporabo FOR zanko.
*/
#include <iostream>
using namespace std;
int main()
{//katerer spremenljivke??
	int N;
	cout<<"N = "; cin>>N;
	//for (zaèetne vrednosti;pogoj;sprememba)
	cout<<endl<<"Nora stevila: "<<endl;
	for(int i = 1;i<=N;i++)//i preverjamo, èe je noro
	{
		//deljivost s 3 in s 7
		if((i%3==0) and (i%7==0))//and=&&, ker mora biti z obema, ostanek 0,
			cout<<i<<endl; 
	};
	
	return 0;
};
