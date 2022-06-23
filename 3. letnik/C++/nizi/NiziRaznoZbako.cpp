#include <iostream>
#include <string>
#include <sstream>// !!
//domaèa naloga: s pomoèjo funkcije substring izlušèi ime, priimek, državo
using namespace std;
/*
podatek o tekmovalcu: ime_Priimek_Država_toèke
kaki izlušèiti ime, priimek, drzavo, toèke kot celo število
Uporabimo lahko le funkcijo za dolžino niza, iskanje podniza(od, dolžina)
*/
int main()
{
//polažaji presledkov:podcrt - tabela, pr, dr, st

	int podcrt[3] = {};//shranimo vse položaje presldkov
	int pr, dr, st;//iz tabele shranimo položaje, za lažje razumevanje
	string tekmovalec = "Janez_Vajkard_Slovenija_20223";
	string ime, priimek, drzava, stev;                   
 //poišèemo položaje presledkov
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
//ime: od niè, dolžina pr
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


