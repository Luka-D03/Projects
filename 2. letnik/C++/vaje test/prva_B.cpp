#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	float y;

	//za liha stevila med 10 in 120
	for(int x =11; x<=119;  x = x+2)//vsako drugo je liho
	{
		y = 2*(pow(x,3) - 5*sqrt(x));
		cout<<"f("<<x<<") = "<<y<<endl;
	}
	return 0;
};
