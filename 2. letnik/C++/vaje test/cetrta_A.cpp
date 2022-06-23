#include <iostream>
#include <cmath>
using namespace std;
/*Zapiši program, ki bo celo pozitivno število st spremenil v število stobr, 
ki ima števke v obratnem vrstnem redu (primer: 123547 => 745321).
*/
int main()
{
	unsigned long long st, stobr=0;//stobr je na zaèetku 0
	cout<<"Vnesi celo pozitivno stevilo: ";
	cin>>st;
	while(st>0)
	{
		stobr = stobr*10 + st%10;
		st = st/10;
	}
	
	cout<<"Obratno: "<<stobr<<endl;
	
	return 0;	
};







