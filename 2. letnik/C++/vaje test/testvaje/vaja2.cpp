//Zapiši program, ki bo ra?unal obsege kroga toliko ?asa, dokler je vneseni polmer ve?ji 
//od 0. Uporabi do-while zanko (o= 2?r).
//
//Znotraj zanke naj sproti izpisuje izra?unane ploš?ine v obliki P = *, 
//kjer je namesto * izpisan izra?unan obseg kroga. Vsak izpis v naj bo svoji vrstici.
//
//Namesto števila pi uporabi konstanto z vrednostjo Pi = 3.14159.




#include <iostream>
#include <cmath>

using namespace std;

int main(){
	float r, ob;
	const float Pi = 3.14159;

	cout<<"Vnesi polmer: ";
	cin>>r;	
	do
	{
		ob = 2*Pi*r;
		cout<<"r = "<<r<<"; o = "<<ob <<endl;

		cout<<"Vnesi polmer: ";
		cin>>r;
	}while(r>0);
	return 0;
};
