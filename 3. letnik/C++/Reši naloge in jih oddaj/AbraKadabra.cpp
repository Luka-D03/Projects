#include <iostream>
#include <string>
using namespace std;
int main() {
	char znak;
	string niz;
	int v = 0;
	
	cout<<"Napisite stavek: \n";
	getline(cin, niz);
	cout<<"Crka za stetje: \n";
	cin>>znak;
	for(int i  = 0; i < niz.size(); i++)
		if(niz[i] == znak)
			v++;
	
	cout<<"Crka "<<znak<<" se pojavi "<<v<<" krat."<<endl;
	
	return 0;
}
