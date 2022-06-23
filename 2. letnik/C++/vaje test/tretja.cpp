#include <iostream>
#include <cmath>
using namespace std;
/*. a) Z uporabo while zanke, zapiši program, ki bo sešteval vnesena pozitivna 
števila toliko èasa,dokler bo vsota seštetih števil manjša od 4000.  
Sešteva naj le števila, ki so manjša od 50. 
Èe je število veèje ali enako 50 naj izpiše: "Število je preveliko.".
Na koncu naj program naj izpiše, z ustreznim komentarjem, izraèunano vsoto.

*/
int main()
{
	unsigned int st, vsota = 0;
	while(vsota < 4000)
	{
		
		cout<<"st = "; 
		cin>>st;
		if(st<50)
			vsota = vsota + st;
		else
			cout<<"Stevilo je preveliko.\n";
	};
	cout<<"Vsota sestetih stevil je "<<vsota<<endl;
	return 0;
}
