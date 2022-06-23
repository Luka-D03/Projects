/*
Deklariraj funkcijo, ki med N vnesenimi
števili izpiše najmanjše (ali najveèje).
Algoritem, postopek, metoda,...:
Za najmanjše doloèiš prvega, in ga potem primerjaš z ostalimi.
èe naletiš na manjšega, je to novi najmanjši.
*/

#include <iostream>
using namespace std;

float mini(float st, float min)//podatek: koliko števil vnesemo
{
	//Dva naèina: na zaèetku doloèimo za najmanjšega prvega prebranega
	//ali najveèje možno celo število INT_MAX (le za cela)
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
