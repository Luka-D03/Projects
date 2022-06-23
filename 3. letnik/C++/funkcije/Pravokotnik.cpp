/*
deklariraj funkcije za:
- obseg pravokotnika,
- plo��ino pravokotnika,
- diagonalo pravokotnika,
- izpis podatkov in rezultatov (void)
Podatka: stranici
*/
#include <iostream>
#include <cmath>
using namespace std;

float obseg(float a, float b) {
	float ob;
	ob = 2*(a + b);
	return ob;//rezultat
};

float ploscina(float a, float b) {
	float pl;
	pl = a*b;
	return pl;
};

float diagonala(float a, float b) {
	//v funkcijah, ki vrnejo rezultat, naj ne bi uporabljali izpisa
	float diagonala;//ime spremenljivke je lahko enako imenu funkcije
	diagonala = sqrt(pow(a,2) + pow(b,2));
	return diagonala;
};
//izpis: VRSTNI RED ARGUMENTOV
void izpis (float a, float b, float O, float P, float d){
	//argumenti: vse, kar izpi�emo
	cout<<"a = "<<a<<", b = "<<b<<endl;
	cout<<"O = "<<O<<", P = "<<P<<", d = "<<d<<endl;
}
int main() {
	float Ob, Pl, di, stra, strb;
	cout<<"Prva stranica: ";
	cin>>stra;
	cout<<"Druga stranica: ";
	cin>>strb;
	Ob = obseg(stra, strb);
	Pl = ploscina(stra, strb);
	di = diagonala(stra, strb);
	izpis(stra, strb, Ob, Pl, di);
	//ker ne vra�a rezultata, ni prireditve
	return 0;
}
