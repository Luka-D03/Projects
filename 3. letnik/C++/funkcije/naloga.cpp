/*
Deklariraj funkcijo, ki prebere (izjemoma) 10 celih števil
in kot rezultat vrne nejveèje vneseno število
*/

#include <iostream>
using namespace std;

int MAX()//ni argumentov, ker podatke prebere funkcija
{
	int st, max = INT_MIN;//najmanjše možno v C++ (Dev-C++)
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
