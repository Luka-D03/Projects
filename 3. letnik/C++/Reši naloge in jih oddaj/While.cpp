#include <iostream>
using namespace std;
int main() {
	int i, v = 0;
	
	while(v < 600) {
		cout<<"Vnesite stevilo: "<<endl;
		cin>>i;
		
		if(i % 2 == 0)
			v += i;
	}
	
	cout<<"Vsota stevil je: "<<v<<endl;
}
