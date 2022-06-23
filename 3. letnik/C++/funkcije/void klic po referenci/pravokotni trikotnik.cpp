/*
Podani sta kateti trikotnika a in b.
Kateri sta lahko le stranici pravokotnega trikotnika.
Zapiši ENO fumkcijo, ki izračuna dolžino hipotenuze,
ploščino in  obseg.
Funkcija za izpis rezultatov..
V glavnem programu vnesi točno N podatkov
*/

#include <iostream>
#include <cmath>
using namespace std;

void PravT(float a, float b, float &c, float &P, float &ob)
{
	c = sqrt(pow(a,2) + pow(b,2));
	P = a*b/2;
	ob = a + b + c;
};

void izpis(float c, float P, float ob)
{
	cout<<"c = "<<c<<endl;
	cout<<"P = "<<P<<endl;
	cout<<"ob = "<<ob<<endl;	
};

void vnos(float &a, float &b)
{
	cout<<"a = ";
	cin>>a;
	cout<<"b = ";
	cin>>b;
};

int main()
{
	float a, b, c, P, ob;
	int N;
	cout<<"Koliko trikotnikov?\n";
	cin>>N;
	for(int i = 1; i <= N; i++)
	{
		cout<<i<<". trikotnik: \n\n";
		vnos(a, b);
		PravT(a, b, c, P, ob);
		izpis(c, P , ob);	
	};
	return 0;	
};
