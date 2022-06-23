//2. Napiši program, ki prebere dve celi števili A in B. Število A izpiše tolikokrat, kot je vrednost števila B. Uporabo WHILE zanko.

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

