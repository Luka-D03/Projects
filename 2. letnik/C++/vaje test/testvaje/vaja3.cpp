/*
Z uporabo while zanke, zapi�i program, ki bo shranjeval vnesena pozitivna �tevila v tabelo z imenom ManjsaOd50 toliko ?asa, dokler bo vsota vnesenih �tevil manj�a od 4000.  
Shrani in se�teva naj le �tevila, ki so manj�a od 50. 
?e je �tevilo ve?je ali enako 50 naj izpi�e: "�tevilo je preveliko.".
Na koncu naj program naj izpi�e, z ustreznim komentarjem, izra?unano vsoto.
*/

#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	unsigned int x;
	int v;
	
	
	
	while(v < 4000){
		cout<<"Vnesi �tevilo"<<endl;
			cin>>x;
			if(x >= 50)
			{
				cout<<"�tevilo je preveliko"<<endl;
			};
			
			if(x < 50)
			{
				v += x;
			};		
	};
	return 0;
};
