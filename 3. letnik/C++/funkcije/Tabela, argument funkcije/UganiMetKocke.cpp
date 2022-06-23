/*
Simuliraj ugibanje meta kocke
*/

#include <iostream>
#include <cmath>
#include <cstdlib>
#include <ctime>
using namespace std;

int Kocka()
{
	return rand()%6 + 1;
};

int main()
{
	srand(time(0));
	int ugani, i = 0, vr;
	while(1<2)//neskonèna zanka (vedno izpoln jen pogoj)
	{
		//cout<<"Ugibaj: "; cin>>ugani;
		cout<<"Vnesi vrednost od 1 do 6: ";
		cin>>ugani;
		i++;
		vr = Kocka();
		cout<<"Skatla je vrgla: "<<vr<<endl;
		if(vr == ugani)
		{
			cout<<"Bravo! "<<i<<endl;
			return 2023;//izhod iz glavnega programa
		}
	}
	return 0;
}
