/*Izra�unaj plo��ine enakostrani�nih trikotnikov 
za dol�ine stranic med 3 in 12 s korakom 1/5.
Vrednost shrani v tabelo
*/

#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	int N = 50, i/*�tevec v tabeli*/;
	float P, a;/*stranica, plo��ina*/
	float ploscine[N];/*5*9 => 50, raje malo ve�, a ne preve�*/
	/*�e sta v tabeli dva "�tevca", ju deklariramo zunaj for*/
	for(a = 3, i = 0; a <= 12; a = a + 0.2, i++)//1/5 = 0!!!!
	{
		ploscine[i] = sqrt(3)*pow(a,2)/2;
	};
	/*izpis, i je deklariran zunaj for*/
	for(int k = 0; k <= i; k++)
		cout<<ploscine[k]<<"\n";
	
	return 0;
};
