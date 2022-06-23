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
	unsigned int x;
	int v;
	
	
	
	while(v < 4000){
		cout<<"Vnesi število"<<endl;
			cin>>x;
			if(x >= 50)
			{
				cout<<"Število je preveliko"<<endl;
			};
			
			if(x < 50)
			{
				v += x;
			};		
	};
	return 0;
};
