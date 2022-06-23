/*
Z uporabo while zanke, zapiši program, ki bo shranjeval vnesena pozitivna števila v tabelo z imenom ManjsaOd50 toliko ?asa, dokler bo vsota vnesenih števil manjša od 4000.  
Shrani in sešteva naj le števila, ki so manjša od 50. 
?e je število ve?je ali enako 50 naj izpiše: "Število je preveliko.".
Na koncu naj program naj izpiše, z ustreznim komentarjem, izra?unano vsoto.
*/
#include <iostream>
#include <cmath>

using namespace std;

int main()
{
	int N = 999999999;
	unsigned int ManjsaOd50[N] = {};
	int vsota = 0, x = 0;
	
	
	while(vsota < 4000)
	{
		cout<<"Vnesi število"<<endl;
		cin>>ManjsaOd50[N];
		if(ManjsaOd50[N] >= 50)
		{
			cout<<"Število je preveliko"<<endl;
		};
		
		if(ManjsaOd50[N] < 50)
		{
			vsota += ManjsaOd50[N];
		};
		
	};
	
	cout<<"Vsota je: "<<vsota<<endl;
	

	return 0;	
};
