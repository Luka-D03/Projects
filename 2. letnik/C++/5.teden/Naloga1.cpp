//1. Napi�i program, ki bo prebral neko naravno �tevilo n in potem zapisal po�tevanko tega �tevila do 10*n. Uporabi FOR zanko.

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
