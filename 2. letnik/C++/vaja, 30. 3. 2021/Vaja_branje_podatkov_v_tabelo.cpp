#include <iostream>
using namespace std;
/*
Vnesi poljubno �tevilo �tevil v tabelo...
Kon�aj z vnosom znaka (while(cin))
- razni izra�uni....
*/
int main()
{
	const int N = 100;
	int vnosi = 0;//�teje vnose
	float StA[N] = {0}, StB[N] = {},x;
	float vsota = 0, povprecje, minimum = 9999999999, maksimum = -9999999999;//doma�a naloga za NAJMANJ 15 �tevil
	cout<<"Vnos "<<char(231)<<"tevil kon"<<char(159)<<"as tako,";
	cout<<" da pritisne"<<char(231)<<" katerokoli tipko s "<<char(159)<<"rko.\n";
	cout<<"x = ";
	cin>>x;//predhodno branje, ki je potrebno za kontrolo v while zanki
	while (cin)//dokler tip vnesenega podatak ustreza tipu podatka x (�TEVILO)
	{
   		StA[vnosi]=x; //shranimo podatek prebran pred zanko
   		
   		vnosi++; //mesto indeksa v tabeli pove�amo za ena
   		//�tetje vnesenih �tevil
   		//Uporabimo v zankah
		cout<<"x = ";
		cin>>x;
	};
	cout<<endl<<endl;
	//izpis v obratnem vrstnem redu
	for(int i = vnosi-1;i>=0;i--)//vnosi - 1:ker mesta v tabeli za�nemo �teti z 0: 0,12,-2,3,4 => vnesli smo 5 �tevil
		cout<<"Sta["<<i<<"] => "<<StA[i]<<endl;
	/*
	minimum = 9999999999;//najve�je
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
			
	cout<<"Povpre�je �tevil je: "<<povprecje<<endl;	
	cout<<"Najvecje �tevilo je: "<<maksimum<<endl;
	cout<<"Najmanj�e �tevilo je: "<<minimum<<endl;
	
	return 0;
};
