#include <iostream>
#include <cmath>
/*a) Z uporabo while zanke, zapiši progam, ki bo sešteval vnesena decimalna števila toliko èasa, 
  dokler je vsota teh števil manjša od celoštevilska konstante k = 2000.
b) Sešteva naj le pozitivna števila, ter jih sproti tudi šteje.
c) Na koncu naj izpiše, koliko pozitivnih števil je seštel, ter kolikšna je njihova vsota. 
  Izpis naj vsebuje ustrezne komentarje.
*/
using namespace std;

int main()
{
	const int k = 2000;
	float st;//prebrana (vnesena) števila
	int soda = 0;//števec pozitivnih, zaèetna vrednost je 0
	float vsota = 0;//vsota sodih števil, zaèetna vrednost je 0
	
	while(vsota<k)
	{
		cout<<"Vnesi stevilo: ";
		cin>>st;
		if(st>0)//preverimo pozitivnost
		{
			vsota = vsota + st; //prištejemo
			soda++;//poveèamo števec pozitivnih
		}	
	};
	//izpis
	cout<<"Vsota sodih = "<<vsota<<"; sesteli smo "<<soda<<" stevil\n";
	return 0;	
};







