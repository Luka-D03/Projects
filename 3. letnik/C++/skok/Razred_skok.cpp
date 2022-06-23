/*
Branje podatkov v strukturo s tabelo
*/
#include <iostream>
using namespace std;
const int N = 5;//globalna spremenljivka, dosegljiva povsod
struct skok
{
	float dolzina;
	float tocke[5];	
};
//izra�un to�k: izlo�i� najmanj�o in najve�jo vrednost in se�teje�
float tocke(float tabela[])
{
	float max = 0, min = 20;//to�ke so mad 0 in 20
	float vsota = 0;
	for(int i = 0; i < N; i++)
	{
		vsota += tabela[i];
		if(tabela[i] < min)
			min = tabela[i];
		if(tabela[i] > max)
			max = tabela[i];
	};
	vsota = vsota - min - max;
	return vsota;
}
//vnos �tevil v tabelo
//v funkciji ni potrebno "operirati" s strukturo
void vnos(float tabela[])
{
	for(int i  = 0; i < N; i++)
	{
		cout<<"Vnesi "<<i+1<<". vrednost: ";
		cin>>tabela[i];
	};
};
int main()
{
	skok s;
	float sestevek;
	vnos(s.tocke);
	sestevek = tocke(s.tocke);
	cout<<"s = "<<sestevek<<endl;
	return 0;
};
