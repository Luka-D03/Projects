/*
a) Deklariraj funkcijo, s katero izra�una� prostornino tetraedra, �e je podana stranica a.
Namesto �tevila sqrt(2) uporabi konstanto 1,4142, prostornino izra�una� po formuli V = sqrt(2)/12*pow(a,3).

b) Deklariraj funkcijo za izpis podatka in rezultata. izpis naj se izvr�i znotraj zanke.

c) V glavnem programu s pomo�jo prej deklarirane funkcije ra�una� plo��ine tetraedrov toliko �asa, 
dokler je vnesena dol�ina stranice ve�ja od ni�(while zanka). Vnos dol�in stranic se vr�i preko tipkovnice.
Velikost stranic in izra�unani rezultati naj se sproti izpisujejo na ekran.
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
