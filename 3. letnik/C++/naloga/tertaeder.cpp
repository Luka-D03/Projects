/*
a) Deklariraj funkcijo, s katero izraèunaš prostornino tetraedra, èe je podana stranica a.
Namesto števila sqrt(2) uporabi konstanto 1,4142, prostornino izraèunaš po formuli V = sqrt(2)/12*pow(a,3).

b) Deklariraj funkcijo za izpis podatka in rezultata. izpis naj se izvrši znotraj zanke.

c) V glavnem programu s pomoèjo prej deklarirane funkcije raèunaš plošèine tetraedrov toliko èasa, 
dokler je vnesena dolžina stranice veèja od niè(while zanka). Vnos dolžin stranic se vrši preko tipkovnice.
Velikost stranic in izraèunani rezultati naj se sproti izpisujejo na ekran.
*/
#include <iostream>
#include <cmath>
using namespace std;


float prostornina(float a)
{
	const float kor2 = 1.4142;
	float V;
	V = kor2/12*pow(a,3);
	return V;
};

void izpis(float a, float V)
{
	cout<<"Stranica a = "<<a<<endl;
	cout<<"Prostornina = "<<V<<endl;
};

int main()
{
	int a, V;
	while(a > 0)
	{
		cout<<"Vnesi stevilo: "<<endl;
    	cin>>a;
		V = prostornina(a);
    	izpis(a,V);
	};
	return 0;
};
