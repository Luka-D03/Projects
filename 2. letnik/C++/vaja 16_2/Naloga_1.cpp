#include <iostream>

using namespace std;

main ()
{
	unsigned int N = 10;
	unsigned int tabela[N] = {3,5,4,1,2,3,4,5};
	
	for(int i = 0;i<N;i++)
	{
		tabela[3] = 9;
		tabela[4] = 1;
		tabela[5] = 2;
		tabela[6] = 3;
		tabela[7] = 4;
		tabela[8] = 5;
		cout<<"tabela["<<i<<"] = "<<tabela[i]<<endl;
	};
};
