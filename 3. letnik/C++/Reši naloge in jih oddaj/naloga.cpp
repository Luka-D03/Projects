/*
V tabelo vpi�i TO�NO 10 �tevil, ki so deljiva s 13.
Vna�a� poljubna �tevila, v for zanki preverja� deljivost z while zanko.
*/

#include <iostream>
using namespace std;
int main() {
	const int N = 10;
	int tabela[N] = {};
	
	for(int i = 0; i <= 10; i++) {
		do {
			cout<<"x =";
			cin>>x;
			if(x % 13 == 0)
			tabela[i] = x;
		}while(x % 13 != 0)
	}
	return 0;
}
