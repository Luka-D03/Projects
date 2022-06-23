/*
Èe sta podatka celi števili ju 
*/

#include <iostream>

using namespace std;

float TIP(int a, int b)
{
	cout<<"Vsota: ";
	return a+b;	
};

float TIP(float a, float b)
{
	cout<<"Produkt: ";
	return a*b;
};

int main()
{
	int a = 3.1, b = 2.4;//CELI: 3 IN 2
	float x = 23, y = 7;//23.00000 IN 7.0000
	//tip argumentov doloèa deklaracija!!	
	cout<<TIP(a,b)<<endl;//CELI
	cout<<TIP(x,y)<<endl;//DECIMALNI
	
	//cout<<TIP(a,x)<<endl;//?!?!?!VSOTA ALI PRODUKT? CELO in DECIMALKA
	//Napaèna argumenta

	return 0;	
};
