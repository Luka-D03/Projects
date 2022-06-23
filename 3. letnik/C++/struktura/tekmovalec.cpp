/*
Deklariramo strukturo tekmovalec:
- ime (niz)
- priimek (niz)
- država (niz)
- toèke (niz)
*/
#include <iostream>
using namespace std;

struct tekmovalec
{
	string ime;
	string priimek;
	string drzava;
	int tocke;
}prvi, drugi;//inicializacija od deklaraciji

int x;//dosegljiv povsod, globalna spremenljivka

int main()
{
	//struktura je dejansko tip podatka
	tekmovalec lenuh, skakalec;
	lenuh.ime = "Vinko";
	lenuh.priimek = "Zbacnik";
	lenuh.drzava = "Slovenija";
	lenuh.tocke = 1000;//najveè možnih
	prvi.ime = "Janez";
	prvi.tocke = 20;
	prvi.priimek = "Novak";
	prvi.drzava = "Slovenija";
	//kdo je veèji lenuh?
	if(lenuh.tocke > prvi.tocke)
		cout<<"Vecji lenuh je: "<<lenuh.ime;
	else
		cout<<"Vecji lenuh je: "<<prvi.ime;
	//izpis imena in priimka "prvi"
	cout<<prvi.priimek<<" "<<prvi.ime<<" "<<prvi.tocke<<endl;
	return 0;
};
