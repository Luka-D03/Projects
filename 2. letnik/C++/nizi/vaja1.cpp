#include <iostream>
#include <string>

using namespace std;
int main() {
	char znak;//en znak, ena številka, ena èrka
	string niz;//veè znakov (ni tabela)
	znak = '?';
	niz = "besedilo";
	
/*	cout<<znak<<endl;
	cout<<niz<<endl;
	
	//znak => "kodna" številko
	cout<<int('?')<<endl;
	//"kodna" številka => znak
	cout<<char(63)<<endl;
	
	for(int i = 0; i <= 255; i++)
		cout<<i<<" => "<<char(i)<<endl;
	cout<<"Vnesi poved: ";
	cin>>niz;//bere le do presledka
	cout<<niz;
	niz = "Perica reže raci rep";//palindrom
	cout<<niz;//Šumnikov se izogibamo*/
	//branje nizov s presledki
	getline(cin, niz, '/');//bere do znaka /
	//znak za konec je poljuben, a najveèkrat * ali / ali #
	cout<<niz<<endl;

	
	return 0;
};
