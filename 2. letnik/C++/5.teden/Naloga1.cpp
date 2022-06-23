//1. Napiši program, ki bo prebral neko naravno število n in potem zapisal poštevanko tega števila do 10*n. Uporabi FOR zanko.

#include <iostream>
using namespace std;
int main()
{
	int n,y;
	cout<<"Izberi stevilo: "; cin>>n;
	cout<<"Postevanka: \n";
	for (int i = 0; i <= 10; i++)
	{
  		y = i*n;
  		cout << y << "\n";
	};
	return 0;
};
