#include <iostream>
#include <string>

using namespace std;
int main() {
	char znak;//en znak, ena �tevilka, ena �rka
	string niz;//ve� znakov (ni tabela)
	znak = '?';
	niz = "besedilo";
	
/*	cout<<znak<<endl;
	cout<<niz<<endl;
	
	//znak => "kodna" �tevilko
	cout<<int('?')<<endl;
	//"kodna" �tevilka => znak
	cout<<char(63)<<endl;
	
	for(int i = 0; i <= 255; i++)
		cout<<i<<" => "<<char(i)<<endl;
	cout<<"Vnesi poved: ";
	cin>>niz;//bere le do presledka
	cout<<niz;
	niz = "Perica re�e raci rep";//palindrom
	cout<<niz;//�umnikov se izogibamo*/
	//branje nizov s presledki
	getline(cin, niz, '/');//bere do znaka /
	//znak za konec je poljuben, a najve�krat * ali / ali #
	cout<<niz<<endl;

	
	return 0;
};
