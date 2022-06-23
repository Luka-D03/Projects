#include <iostream>

using namespace std;

int main (){
	
	int N = 10;
	int min, max;
	int povp = 0;
	int tabela[N]= {134, 157, 149, 155, 158, 126, 148, 125, 163, 165};
	
	for(int N = 0;N < 10;N++)
	{
		povp = povp + tabela[N];
	}
		povp = povp/N;
	
	min = max = tabela[0];
	for(int N = 1;N < 10; N++)
	{
		if(tabela[N] < min)
			min = tabela[N];
		if(tabela[N] > max)
			max = tabela[N];
	}
	
		cout<<"Skakac je skakal in dosegel naslednje dolzine: "<<"134m, 157m, 149m, 155m, 158m, 126m, 148m, 125m, 163m in 165m"<<endl;
		cout<<"Povprecje vseh dolzinj je: "<<povp<<endl;
		cout<<"Najmanjsa dosezena razdalja je: "<<min<<endl;
		cout<<"Najvecja dosezena razdalja je: "<<max<<endl;
	return 0;	
};
