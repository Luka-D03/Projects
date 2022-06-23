#include <iostream>
#include <cmath>
using namespace std;
int main()
{
	int N = 100;
	float Vrednosti[N]={};
	int i;
	float x;
	for(i = 0,x=-5;x<=4;i++,x=x+0.25)
	{
		Vrednosti[i] = 4*x+2;
		cout<<"f("<<x<<") = "<<Vrednosti[i]<<endl;
	};
	return 0;
};
