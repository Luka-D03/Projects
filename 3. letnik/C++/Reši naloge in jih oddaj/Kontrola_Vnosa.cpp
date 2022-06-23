/* 
Vnašamo starost ljudi. Starost je celo število, 
veèje od 0 in manjše od 120.
Vnašamo toliko èasa, dokler ni vnos pravilen.
Èe vnesemo, se branje ponovi.
Opozorilo o nepravilnost vnosa naj se pojavi šele ob drugem vnosu,
èe je prvi neprevilen;
*/
#include <iostream>
using namespace std;

int main()
{
	int starost;
	int vnosi = 0;
	do
	{
		vnosi++;
		if(vnosi == 1)
		{
			cout<<"Starost mora bit vecja od 0 in manjsa od 120: ";
			cin>>starost;
		}
		else
		{//Èe bi dejansko vnašali starost, bi uporabili le ta ukaz
			cout<<"Starost mora bit vecja od 0 in manjša od 120: ";
			cin>>starost;	
		}
				
	}while((starost<0) or (starost>120));
	cout<<starost;
	return 0;
}


