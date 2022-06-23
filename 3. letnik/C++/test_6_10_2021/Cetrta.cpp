#include <iostream>
using namespace std;

int main()
{
	float x, y, vrednosti[100] = {};
	int i;
	//èe so v for zanki "rezlièni tipi", jih deklariramo "zunaj"	
	for(i = 0, x = -5; x <= 4; i++, x = x+ 0.25)
	{
		y = 4*x + 2;
		vrednosti[i] = y;
		cout<<"f("<<x<<") ="<<vrednosti[i]<<endl;
	};
	
	return 0;
};
