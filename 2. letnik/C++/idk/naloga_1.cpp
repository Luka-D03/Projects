#include <iostream>
using namespace std;
int main ()
{
	float x, y;
	cout<<"Zapisi prvo stevilo: ";
		cin>>x;
	cout<<"Zapisi drugo stevilo: ";
		cin>>y;
	if(x>y)
	{
		cout<<"Stevilo "<<x<<" je vecje.";	
	}
	if(x<y)
	{
		cout<<"Stevilo "<<y<<" je vecje.";	
	}
	if(x==y)
	{
		cout<<"Stevili sta enaki.";
	}
	
	return 0;
};
