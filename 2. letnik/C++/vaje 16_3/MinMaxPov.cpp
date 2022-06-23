//Zapiši program, ki prebere N poljubnih celih števil, ter med njimi poišce najvecje, najmanjše in izracuna njihovo povprecje.
#include <iostream>
using namespace std;

int main ()
{
	const int N = 10;//poljubno
	int min, max;
	float pov = 0;
	int Stev[N];//tabela
	//vnos števil
	for(int i = 0; i < N; i++)//zaèetek. do kdaj, sprememba
	{
		cout<<"vnesi "<<i<<"-to stevilo: ";
		cin>>Stev[i];
	};
	//min max v isti zanki
	min = max = Stev[0];//prvega doloèimo
	for(int i = 1; i < N; i++)
	{
		if(Stev[i] < min)
			min = Stev[i];
		if(Stev[i] > max)
			max = Stev[i];
	};
	
	for(int i = 0; i < N; i++)
	{
		pov = pov + Stev[i];
	};
	pov = pov/N;//float/int = float
	
	cout<<"povprecje je: "<<pov<<endl;
	
	cout<<"min = "<<min<<", max = "<<max<<endl;
	
	return 0;
};
