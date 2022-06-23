/*
Deklariraj funkcijo, ki med N vnesenimi
�tevili izpi�e najmanj�e (ali najve�je).
Algoritem, postopek, metoda,...:
Za najmanj�e dolo�i� prvega, in ga potem primerja� z ostalimi.
�e naleti� na manj�ega, je to novi najmanj�i.
*/

#include <iostream>
using namespace std;

float mini(float st, float min)//podatek: koliko �tevil vnesemo
{
	//Dva na�ina: na za�etku dolo�imo za najmanj�ega prvega prebranega
	//ali najve�je mo�no celo �tevilo INT_MAX (le za cela)
	/*
	float st, min;
	cout<<"1. stevilo: ";
	cin>>min;
	for(int i = 2; i <= N; i++)
	{
		cout<<i<<". stevilo: ";
		cin>>st;
		if(st < min)
			min = st;
	};
	return min;
	*/
	if(st < min)
		min = st;
	return min;
	
};

float maxi(float st, float max)
{
	if(st > max)
		max = st;
	return max;
};

void izpis(float min, float max)
{
	cout<<"Najmanjse st: "<<min<<endl;
	cout<<"najvecje st: "<<max<<endl;
};

int main()
{
	float st, min, max, minimum, maximum;
	int N;
	cout<<"Koliko stevil? \n";
	cin>>N;
	cout<<"1. stevilo: ";
	cin>>min;
	max = min;
	for(int i = 2; i <= N; i++)
	{
		cout<<i<<". stevilo: ";
		cin>>st;
		minimum = mini(st, min);
		maximum = maxi(st, max);
	};
	izpis(minimum, maximum);	
};
