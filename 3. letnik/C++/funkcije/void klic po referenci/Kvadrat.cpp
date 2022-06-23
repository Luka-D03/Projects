/*
Kvadrat
*/
#include <iostream>
#include <cmath>
using namespace std;

void kvadrat(float a, float &ob, float &P, float &d)
{
	ob = 4*a;
	P = a*a;//pow(a,2);
	d = sqrt(2)*a;
};

/* void izpis(float obseg, float ploscina, float diagonala)
{
	cout<<"o = "<<obseg<<endl;
	cout<<"P = "<<ploscina<<endl;
	cout<<"d = "<<diagonala<<endl;
}; */

int main()
{
	float a =  3;
	float obseg, ploscina, diagonala;
	kvadrat(a, obseg, ploscina, diagonala);//VRSTNI RED
	cout<<"o = "<<obseg<<endl;
	cout<<"P = "<<ploscina<<endl;
	cout<<"d = "<<diagonala<<endl;
	/* izpis(obseg, ploscina, diagonala); */
	return 0;
};
