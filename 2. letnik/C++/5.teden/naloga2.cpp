//2. Napi�i program, ki prebere dve celi �tevili A in B. �tevilo A izpi�e tolikokrat, kot je vrednost �tevila B. Uporabo WHILE zanko.

#include <iostream>
using namespace std;

int main() 
{
	int A,B;
	cout<<"Izberi stevilo A: "; cin>>A;
	cout<<"Izberi stevilo B: "; cin>>B;
	int i = 1;
	while (i <= B) 
	{
    cout << A << "\n";
    i++;
	};
	return 0;
};

