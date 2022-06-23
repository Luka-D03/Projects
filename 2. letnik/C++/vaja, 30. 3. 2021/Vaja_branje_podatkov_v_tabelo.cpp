#include <iostream>
using namespace std;
/*
Vnesi poljubno število števil v tabelo...
Konèaj z vnosom znaka (while(cin))
- razni izraèuni....
*/
int main()
{
	const int N = 100;
	int vnosi = 0;//šteje vnose
	float StA[N] = {0}, StB[N] = {},x;
	float vsota = 0, povprecje, minimum = 9999999999, maksimum = -9999999999;//domaèa naloga za NAJMANJ 15 števil
	cout<<"Vnos "<<char(231)<<"tevil kon"<<char(159)<<"as tako,";
	cout<<" da pritisne"<<char(231)<<" katerokoli tipko s "<<char(159)<<"rko.\n";
	cout<<"x = ";
	cin>>x;//predhodno branje, ki je potrebno za kontrolo v while zanki
	while (cin)//dokler tip vnesenega podatak ustreza tipu podatka x (ŠTEVILO)
	{
   		StA[vnosi]=x; //shranimo podatek prebran pred zanko
   		
   		vnosi++; //mesto indeksa v tabeli poveèamo za ena
   		//štetje vnesenih števil
   		//Uporabimo v zankah
		cout<<"x = ";
		cin>>x;
	};
	cout<<endl<<endl;
	//izpis v obratnem vrstnem redu
	for(int i = vnosi-1;i>=0;i--)//vnosi - 1:ker mesta v tabeli zaènemo šteti z 0: 0,12,-2,3,4 => vnesli smo 5 števil
		cout<<"Sta["<<i<<"] => "<<StA[i]<<endl;
	/*
	minimum = 9999999999;//najveèje
	maksimum = -9999999999;
	cout<<"Najvecje celo: "<<maksimum<<", najmanjse celo "<<minimum<<endl;
	*/
	cout<<"Izpis negativnih:\n"<<endl;
	for(int i = 0;i<vnosi;i++)
		if(StA[i]<0)
			cout<<StA[i]<<endl;
			
	for(int i = vnosi-1;i>=0;i--)
		vsota += StA[i];
		
	povprecje = vsota/vnosi;
	for(int i = vnosi-1;i>=0;i--)
		if(StA[i] > maksimum)
			maksimum = StA[i];
		
	for(int i = vnosi-1;i>=0;i--)
		if(StA[i] < minimum)
			minimum = StA[i];
			
	cout<<"Povpreèje števil je: "<<povprecje<<endl;	
	cout<<"Najvecje število je: "<<maksimum<<endl;
	cout<<"Najmanjše število je: "<<minimum<<endl;
	
	return 0;
};
