/*Pretvori vneseno deseti�ko �t v dvoji�ko*/

#include <iostream>
using namespace std;
int main ()
{
	long long celidel, desetisko;//to �tevilo vnesemo
	long long dvojisko = 0;//za�etna vrednost dvoji�kega
	long long ostanek;//1 ali 0
	
	cout<<"Vnesi desetisko stevilo: ";
	cin>>desetisko;
	
	celidel = desetisko;//shranimo prebrano �tevilo,
	//ker ga v postopku spreminjamo
	while(celidel>0)
	{
		ostanek = celidel%2;//ostanek, desni stolpec
		dvojisko = dvojisko*10 + ostanek;
		celidel = celidel/2;
	};
	cout<<dvojisko<<endl;
};
