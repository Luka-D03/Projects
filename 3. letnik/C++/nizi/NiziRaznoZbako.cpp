#include <iostream>
#include <string>
#include <sstream>// !!
//doma�a naloga: s pomo�jo funkcije substring izlu��i ime, priimek, dr�avo
using namespace std;
/*
podatek o tekmovalcu: ime_Priimek_Dr�ava_to�ke
kaki izlu��iti ime, priimek, drzavo, to�ke kot celo �tevilo
Uporabimo lahko le funkcijo za dol�ino niza, iskanje podniza(od, dol�ina)
*/
int main()
{
//pola�aji presledkov:podcrt - tabela, pr, dr, st

	int podcrt[3] = {};//shranimo vse polo�aje presldkov
	int pr, dr, st;//iz tabele shranimo polo�aje, za la�je razumevanje
	string tekmovalec = "Janez_Vajkard_Slovenija_20223";
	string ime, priimek, drzava, stev;                   
 //poi��emo polo�aje presledkov
 	int j = 0;
 	for(int i = 0;i<=tekmovalec.length(); i++)
 		if(tekmovalec[i] == '_')
 		{
 			podcrt[j] = i;
 			cout<<podcrt[j]<<" ";
			 j++;			
 		};
 	if((j!=3) or (tekmovalec[tekmovalec.length()-1]=='_'))
 	{
 		cout<<"napaka.";
 		return 123;
 	}
 	pr = podcrt[0];
 	dr = podcrt[1];
 	st = podcrt[2];
//ime: od ni�, dol�ina pr
	ime = tekmovalec.substr(0,pr);
	cout<<"\nIme: "<<ime<<endl;
	
	priimek = tekmovalec.substr(pr+1,dr-pr-1);
	cout<<"\nPriimek: "<<priimek<<endl;
	
	drzava = tekmovalec.substr(dr+1,st-dr-1);
	cout<<"\nDrzava: "<<drzava<<endl;	
	
	stev = tekmovalec.substr(st+1,tekmovalec.length());
	cout<<"\nStNiz: "<<stev<<endl;
	
	stringstream geek(stev);
    geek>>st;	
    cout<<"\nStInt: "<<st<<endl;
	return 0;
};


