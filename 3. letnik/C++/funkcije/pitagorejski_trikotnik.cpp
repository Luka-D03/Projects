/*
Pitagorske trojice:
pravokotni trikotniki, pri kateri so stranice cela števila.
3, 4, 5
velja a^2 + b^2 = c^2
*/
#include <iostream>
#include <cmath>
using namespace std;

float PitIzrek(float a, float b)//kateti
{
	float c;
	c = sqrt(pow(a, 2)+pow(b, 2));
	return c;//hipotenuza
};

void izpis(int dotu)
{
	float c;
	for(float a = 1; a <= dotu; a++) //za vsako stranico a
		for(float b = a; b <= dotu; b++)//izraèunamo c za vse b-je (veèje ali enake a, da se ne podvajajo)
		{
			c = PitIzrek(a, b);
			if(c == (int)c)//(int) - celi del, brez decimalk
				cout<<"a = "<<a<<", b = "<<b<<", c = "<<c<<endl;
		};
};

int main()
{
	int dotu;
	cout<<"do = ";
	cin>>dotu;
	izpis(dotu);
	cout<<endl<<sqrt(952*952+960*960)<<endl;
	return 0;
}
