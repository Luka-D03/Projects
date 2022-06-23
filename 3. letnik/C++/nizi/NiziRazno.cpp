#include <iostream>
#include <string>
#include <sstream>
using namespace std;
/*
podatek o tekmovalcu: ime_Priimek_Država_toèke
kako izlušèiti ime, priimek, drzavo, toèke koz celo število
Uporabimo lahko le funkcijo za dolžino niza, iskanje podniza(od, dolžina)
//domaèa naloga: s pomoèjo 
*/
int main()
{
	//položaji presledkov: pr - tabela, pr, dr, st
	int podcrt[3] = {};//shranimo vse položaje presledkov
	int pr, dr, st;//iz tabele shranimo položaje, za lažje razumevanje
	string tekmovalec = "Janez_Vajkard_Slovenija_2022";
	string ime, priimek, drzava;
	//poišèemo položaje presledkov
	int j = 0;
	for(int i = 0; i <= tekmovalec.length(); i++)
		if(tekmovalec[i] == '_')
		{
			podcrt[j] = i;
			cout<<podcrt[j]<<" ";
			j++;
		};
		if(j != 3) 
		{
			cout<<"napaka";
			return 123;
		};
		
		//ime: od niè,  dolžina pr
		imr = tekmovalec.substr(0, pr);
		cout<<"Ime "<<ime<<endl;
	
	return 0;
}
