/*
V tabelo vpiši TOÈNO 10 števil, ki so deljiva s 13.
Vnašaš poljubna števila, v for zanki preverjaš deljivost z while zanko.
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
