#include <iostream>
#include <cmath>
using namespace std;

void StoPok(float r, float v, float &P, float &V)
{
	float s;
	V = M_PI*pow(r,2)*v/3;
	s = sqrt(pow(r,2)+pow(v,2));
	P = M_PI*r*(r+v);
};

void izpis(float r, float v, float &P, float &V)
{
	cout<<"r = "<<r<<", v = "<<v<<", P = "<<P<<", V = "<<V<<endl;
};

int main()
{
	float r,v,P,V;
	cout<<"r = ";
	cin>>r;
	cout<<"v = ";
	cin>>v;	
	StoPok(r,v,P,V);
	izpis(r,v,P,V);
	return 0;
};
