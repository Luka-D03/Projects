#include <iostream>
#include <cmath>

using namespace std;
//Podatka, argumenta: a,b (float),
//rezultat, ki ga funkcija vrne:c (float: tip funkcije), hipotenuza.
//funkcijo deklariramo pred glavnim programom

float hipotenuza(float a, float b) {
	float c;
	c = sqrt(pow(a,2) + pow(b,2));
	return c;
};

int main()
{
	float k1, k2, hi;
	//NE DELAJ TEGA!!
	cout<<"c = "<<hipotenuza(3,4)<<endl;  
	//A lahko izra�unamo vrednost uporabimo za nadaljnje ra�unanje?
	//rezultat NI SHRANJEN
	//Tako se skoraj dela..
	hi = hipotenuza(12,13);//Vrstni red argumentov: a = 12, b = 13
	cout<<"c = "<<hi<<endl;//tudi ni vredu!!
	//Pravilen klic: argumente preberemo ali dolo�imo ali uporabimo izra�unano pred klicem
	cout<<"Vnesi a: ";
	cin>>k1;
	cout<<"Vnesi b: ";
	cin>>k2;
	hi = hipotenuza(k1, k2);//funkcija "prepozna" argumente po vrstnem redu, ne po imenu
	cout<<"c = "<<hi<<endl;
	
	cout<<"Narobe!!\n";
	hipotenuza(k1, k2);
    cout<<"Kaj je rezultat?\n";
	return 0;
};

