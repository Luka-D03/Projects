#include <iostream>
using namespace std;
int main() {
	const int N = 10;
	int v = 0, min;
	int tabela[N];
	float pov;
	
	for(int i = 0; i < N; i++) {
		cout<<"Vnesite stevilo: \n";
		cin>>tabela[i];
		v += tabela[i];
	}
	pov = (float)v / N;
	
	min = tabela[0];
	for(int i = 1; i < N; i++)
		if(tabela[i] < min)
			min = tabela[i];
	
	cout<<"Povprecje je: "<<pov<<endl;
	cout<<"Vsota je: "<<v<<endl;
	cout<<"Najmanjse stevilo je: "<<min<<endl;
	
	return 0;
}
