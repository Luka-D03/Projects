#include <iostream>
#include <string>

using namespace std;
int main() {
	char znak;//en znak, ena �tevilka, ena �rka
	string niz;//ve� znakov (ni tabela)
	//dostop do posameznih znakov v nizu
	int d;
	
	niz = "V ponedeljek potrdili 326 novih okuzb: Epidemioloske razmere se se naprej izboljsujejo.";
	//Dol�ina niza
	d = niz.length();
	cout<<" Niz ima "<<d<<" znakov.\n";//\n = endl: nova vrsta
	//izpis 13 znaka
	cout<<"13. znak: "<<niz[13]<<endl;
	//izpis obravnavamo kot tabelo znakov, �tejemo od 0 naprej
	//izpis v obratnem vrstnem redu
	for(int i = d; i >= 0; i--)
		cout<<niz[i];
		
	cout<<endl;
	//�tetje presledkov (ali drugih znakov)
	int n = 0;//�tevilo dolo�enega znaka
	for(int i = 0; i < d; i++) {
		if(niz[i] == ' ') {
			n++;
			cout<<n<<". ti je na "<<i<<" mestu\n";
		}
	};
	cout<<"V nizu je "<<n<<" presledkov."<<endl;
	
	/*string podniz = niz.substr(od, dol�ina);
	od ... indeks prvega znaka, ki ga kopiramo
	dol�ina ... �tevilo znakov, ki jih kopiramo
	*/
	//�elimo izpisati: Epidemioloske
	cout<<niz.substr(39, 13)<<endl;
	cout<<endl;
	string ime, priimek, ip;
	ime = "Janez";
	priimek = "Novak";
	ip = ime + ' ' + priimek;
	
	cout<<ip<<endl;
	
	
	return 0;
};
