#include <iostream>
#include <cmath>

using namespace std;

void rac(float v, float r, float &P, float &V)
{
	const float pi = 3.14;
	V = pi*pow(r,2)*v;
	P = 2*pi*r*(r + v);
};

int main()
{
	int st = 0;
	float v = 1, r = 1, P, V;
	while(st != 10)
	{
		cout<<"Polmer je: ";
		cin>>r;
		cout<<"Visina je: ";
		cin>>v;

		if (r >= 0 && v >= 0)
		{
			rac(v, r, P, V);
			cout<<"r = "<<r<<"\nv = "<<v<<"\nP = "<<P<<"\nV = "<<V<<"\n\n";
			st++;
		}
	};
	return 0;
};