#include <iostream>
#include <string>
#include <sstream>
using namespace std;
/*
podatek o tekmovalcu: ime_Priimek_Dr�ava_to�ke
kako izlu��iti ime, priimek, drzavo, to�ke koz celo �tevilo
Uporabimo lahko le funkcijo za dol�ino niza, iskanje podniza(od, dol�ina)
//doma�a naloga: s pomo�jo 
*/
int main()
{
	//polo�aji presledkov: pr - tabela, pr, dr, st
	int podcrt[3] = {};//shranimo vse polo�aje presledkov
	int pr, dr, st;//iz tabele shranimo polo�aje, za la�je razumevanje
	string tekmovalec = "Janez_Vajkard_Slovenija_2022";
	string ime, priimek, drzava;
	//poi��emo polo�aje presledkov
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
		
		//ime: od ni�,  dol�ina pr
		imr = tekmovalec.substr(0, pr);
		cout<<"Ime "<<ime<<endl;
	
	return 0;
}
