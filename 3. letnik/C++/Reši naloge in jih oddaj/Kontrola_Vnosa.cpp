/* 
Vna�amo starost ljudi. Starost je celo �tevilo, 
ve�je od 0 in manj�e od 120.
Vna�amo toliko �asa, dokler ni vnos pravilen.
�e vnesemo, se branje ponovi.
Opozorilo o nepravilnost vnosa naj se pojavi �ele ob drugem vnosu,
�e je prvi neprevilen;
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
		{//�e bi dejansko vna�ali starost, bi uporabili le ta ukaz
			cout<<"Starost mora bit vecja od 0 in manj�a od 120: ";
			cin>>starost;	
		}
				
	}while((starost<0) or (starost>120));
	cout<<starost;
	return 0;
}


