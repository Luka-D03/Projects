/*
Primer rekurzivne funkcije za izra�un vsote vseh celih �tevil manj�ih ali enakih N

Rekurzija: funkcija kli�e samo sebe
*/

#include <iostream>

using namespace std;

int vsota(int n)
{
	if(n==1)
		return 1;
	else
		if(n>1)//�e je �tevilo ve�je od 1
			return vsota(n-1)+n;
};

int main()
{
	int a;
	cout<<"Vnesi celo stevilo: ";
	cin>>a;
	cout<<"Vsota je "<<vsota(a)<<endl;
	cout<<endl<<a*(a+1)/2<<endl;
	return 2022;
};
