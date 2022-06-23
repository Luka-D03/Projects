//3*. Napiši program, ki med tremi prebranimi števili A, B in C izpiše najveèje (ali najmanjše) število.

#include<iostream>
using namespace std;

int main()
{
	int n, max=0, min=9999999999;
	int i = 1;

	do
	{		cout<<"Napisi stevilo : ";
		cin>>n;

		if(n>max)
			max=n;
		if(n<min)
			min=n;
		i++;

	}while(i<=3);


	cout<<"Max stevilo :"<<max<<"\nMin stevilo :"<<min;


	return 0;
}
