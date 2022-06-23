/*. 
a) Program naj za N = 30 pozitivnih celih preveri, če so deljiva s številoma 5 in 3. 
   če je število deljivo z obema številoma, naj izpiče "število je deljivo z obema številoma". 
b) če je število deljivo le s 3 ali le s 5, naj izpiče: "število je deljivo s 3" 
   ali "število je deljivo s 5".
Obvezno uporabo do-while zanko.
*/

#include <iostream>
#include <cmath>
using namespace std;

int main() {
    const int N = 30;
	unsigned int Cela[N];
	int st = 0;

    for(int i=0;i<N;i++)
		Cela[i]=i+1;

	do
	{
		if((Cela[st]%3==0) and (Cela[st]%5==0))
			cout<<"Stevilo "<<Cela[st]<<" je deljivo z obema steviloma.\n";
			
		if(Cela[st]%3==0)
			cout<<"Stevilo "<<Cela[st]<<" je deljivo s 3.\n";
			
		if(Cela[st]%5==0)
			cout<<"Stevilo "<<Cela[st]<<" je deljivo s 5.\n";
			
		st++;
	}while(st<N);
    
};