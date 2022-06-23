#include <iostream>
using namespace std;
/*Zapiši program, ki preveri, èe je prebrano število deljivo 
z 2 ali s 3. 
Èe je, ga z obema številoma deli, sicer naj izpiše: 
"Stevilo ni deljivo z 2 ali s 3".
*/
int main()
{ 
	int st, rez;
	cout<<"st = "; cin>>st;
	if((st%2==0) or (st%3==0))
	{
		rez = st/2/3;
		cout<<rez;
	}
	else
		cout<<"Stevilo ni deljivo z 2 ali s 3.\n";
	return 0;
}
