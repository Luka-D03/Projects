#include <iostream>
using namespace std;
int main() {
	int vsota = 0;
	unsigned int x;
	
	cout<<"Vnesi Stevilo: ";
	cin>>x;
	while(vsota<5000){
	
	if(x<40) {
		vsota += x;
	} else {
		cout<<"Stevilo je preveliko.";
	};
	cout<<"Vnesi Stevilo: ";
	cin>>x;
	};
	cout<<"Vsota je: "<<vsota<<endl;
	return 0;
};
