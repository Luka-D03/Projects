#include <iostream>
#include <cmath>
using namespace std;
int main()
{
	int N = 100;
	float Vrednosti[N]={};
	int i;
	float x;
	for(i = 0,x=-3;x<=6;i++,x=x+0.25)
	{
		Vrednosti[i] = 2*x+4;
		cout<<"f("<<x<<") = "<<Vrednosti[i]<<endl;
	};
	return 0;
};
