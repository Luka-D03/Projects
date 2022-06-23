#include <iostream>
using namespace std;
int main() 
{
	float vrednosti[100] = {}, y;
	int i = 0;
	for(float x = -2; x <= 5; x = x+0.25, i++)
	{
		y = 2*x-3;
		vrednosti[i] = y;
		cout<<"f("<<x<<") = "<<vrednosti[i]<<endl;
	};
	return 0;	
};
