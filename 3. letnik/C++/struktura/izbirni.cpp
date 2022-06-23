/*
1. Deklariraj strukturo z imenom: Izbirni
Vsebuje naj: ime, priimek(niz)
			 tabeli: predmeti[4] (niz)
			 		 ocene[4] (cela števila)
Ocena predmeta ima isti indeks v tabeli kot ime predemta
2. V glavnem programu deklariraj tabelo, v katero lahko shraniš
podatke o 30 študentih
*/
#include <iostream>
using namespace std;

struct Izbirni
{
	string ime, priimek;
	string predmeti[4] = {};
	int ocene[5] = {};
};

int main()
{
	Izbirni faliranec;
	faliranec.ime = "Vinko";
	faliranec.priimek = "Zbacnik";
	faliranec.predmeti[0] = 'mat';
	faliranec.predmeti[1] = 'slo';
	faliranec.predmeti[2] = 'M13';
	faliranec.predmeti[3] = 'M9';
	faliranec.ocene[0] = '1';
	faliranec.ocene[1] = '2';
	faliranec.ocene[2] = '3';
	faliranec.ocene[3] = '4';
	faliranec.ocene[4] = '5';
	//ocena slovenšèine:
	cout<<faliranec.ime<<" iam pri predmetu "<<faliranec.predmeti[1];
	cout<<" oceno "<<faliranec.ocene[1]<<"."<<endl;
	return 0;
};
