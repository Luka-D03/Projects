#include <iostream>
#include <cmath>
using namespace std;
/*. a) Program naj za N = 30 pozitivnih celih preveri, èe so deljiva s številoma 5 in 3. 
Èe je število deljivo z obema številoma, naj izpiše "Število je deljivo z obema številoma". 
b) Èe je število deljivo le s 3 ali le s 5, naj izpiše: "Število je deljivo s 3" 
ali "Število je deljivo s 5".
Obvezno uporabo do-while zanko.
*/
int main()
{
	const int N = 30;
	unsigned int Cela[N];
	int st;//stevec
	//"Napolnimo"" tabelo, kakorkoli, ...
	for(int i=0;i<N;i++)
		Cela[i]=i+1;
		
	st=0;//zaèetna vrednost števca v do-while zankoi
	do
	{
		if((Cela[st]%3==0) and (Cela[st]%5==0))
			cout<<"Stevilo "<<Cela[st]<<" je deljivo z obema steviloma.\n";
			
		if(Cela[st]%3==0)
			cout<<"Stevilo "<<Cela[st]<<" je deljivo s 3.\n";
			
		if(Cela[st]%5==0)
			cout<<"Stevilo "<<Cela[st]<<" je deljivo s 5.\n";
			
		st++;//poveèamo števec	
	}while(st<N);

	return 0;	
};







