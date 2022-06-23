/*Pretvori vneseno desetiško št v dvojiško*/

#include <iostream>
using namespace std;
int main ()
{
	long long celidel, desetisko;//to število vnesemo
	long long dvojisko = 0;//zaèetna vrednost dvojiškega
	long long ostanek;//1 ali 0
	
	cout<<"Vnesi desetisko stevilo: ";
	cin>>desetisko;
	
	celidel = desetisko;//shranimo prebrano število,
	//ker ga v postopku spreminjamo
	while(celidel>0)
	{
		ostanek = celidel%2;//ostanek, desni stolpec
		dvojisko = dvojisko*10 + ostanek;
		celidel = celidel/2;
	};
	cout<<dvojisko<<endl;
};
