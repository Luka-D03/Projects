/*
Deklariraj funkcijo, ki prebere (izjemoma) 10 celih �tevil
in kot rezultat vrne nejve�je vneseno �tevilo
*/

#include <iostream>
using namespace std;

int MAX()//ni argumentov, ker podatke prebere funkcija
{
	int st, max = INT_MIN;//najmanj�e mo�no v C++ (Dev-C++)
	for(int i = 0; i < 10; i++)
	{
		cout<<"Vnesi "<<i+1<<". stevilo: ";
		cin>>st;
		if(st > max)
			max = st;
	};
	return max;
};

int main()
{
	int najv;
	najv = MAX();
	cout<<"Najvecje prebrano stevilo je: "<<najv<<endl;
	return 0;
};
