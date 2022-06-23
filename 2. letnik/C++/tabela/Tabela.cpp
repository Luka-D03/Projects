/*Tabela, polje, matrika, array,
V tabeli lahko shranimo veè razliènih podatkov isteg tipa.
*/
#include <iostream>
using namespace std;

int main()
{
	//deklaracija tabele, polja, matrike,
	//tip poatkov, koliko je podatkov v tabeli
	//10 celih števil
	int N = 10;//zadnji indeks, zadnje mesto, zadnji števec, zadnji "i" je 9
	//Predviden velikost tabele na bo veèja od dejanske
	int ImeTabele[N];//deklaracija, dodelimo le prostor
	for(int i=0;i<N;i++)
		cout<<"T["<<i<<"] = "<< ImeTabele[i]<<endl;
	
	cout<<endl;	
	int Nicle[N] = {};//deklaracija, vse vrednosti so 0, inicializacija
	for(int i=0;i<N;i++)
		cout<<"N["<<i<<"] = "<< Nicle[i]<<endl;
	cout<<endl;	
	int Stevila[N] = {-3, 2, 5, 6};//deklaracija, ostale vrednosti so 0
	for(int i=0;i<N;i++)
		cout<<"S["<<i<<"] = "<< Stevila[i]<<endl;
	
	cout<<endl;	
	float DvaDeci[N] = {-3.231, 21/2, 5+6.5, 6*(8+9)};//deklaracija, ostale vrednosti so 0
	for(int i=0;i<N;i++)
		cout<<"S["<<i<<"] = "<< DvaDeci[i]<<endl;
	
		
	cout<<endl;	
	//string: nizi, BESEDE, sestavljene iz znakov
	string Imena[N] = {"Marko", "Micka","2021- kot besedilo", "Ivo", "Branka", "Janez Novak"};//deklaracija, ostale vrednosti so 0
	for(int i=0;i<N;i++)
		cout<<"S["<<i<<"] = "<< Imena[i]<<endl;
	return 0;
};
