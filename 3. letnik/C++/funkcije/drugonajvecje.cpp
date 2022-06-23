/*
	drugo najvecje
*/

#include <iostream>
using namespace std;

float naj(float a, float min, float min2)
{
	if(a < min)
	{
		min = a;
		min2 = min;
	};
	return min2;
};

int main()
{
	float min = INT_MAX, min2 = INT_MAX, a, rez;
	int z = 2;
	
	for(int i = 1; i < z; i++, z++)
	{
		cout<<"Vnesi st.: ";
		cin>>a;
		if(a == 'q')
			z--;
		rez = naj(a, min, min2);
	};
	
	cout<<rez<<" "<<min<<" "<<min2<<endl;
	return 0;
};
