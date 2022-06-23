/*
Podani sta kateti a in b.
Deklariraj funkciji:
- ki kot rezultat vrne dolžino hipotenuze
- izpiše rezultat v obliki: a = *, b = *, c = *

V glavnem programu izvedi klica obeh funkcij,
dolžini katete preberi s pomoèjo tipkovnice.
*/

#include <iostream>
#include <cmath>
using namespace std;

float hipo(float a, float b) {
	float c = sqrt(pow(a,2) + pow(b,2));
	return c;
}

float obseg(float a, float b, float c)
{
	float ob;
	ob = a + b + c;
	return ob;
}

void izpis(float a, float b, float c) {
	cout<<"a = "<<a<<", b = "<<b<<", c = "<<c<<endl;
}

int main() {
	float a, b, c, o;
	
	cout<<"Vnesite dolžino katete a: \n";
	cin>>a;
	cout<<"Vnesite dolžino katete b: \n";
	cin>>b;
	c = hipo(a, b);
	0 = obseg(a, b, c);
	izpis(a, b, c, o);
	return 0;
	
}
