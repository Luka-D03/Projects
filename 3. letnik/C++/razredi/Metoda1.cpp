/*
class ime
{
	private:
		deklaracije spremenljivk;
	public:
		metode, funkcije
};
*/
#include <iostream>
using namespace std;

class prav
{
	private://je privzeto
		float a, b;
	public:
		float p();
		void beri();
		void pisi();//najava
		void pi();
};

float prav::p()//p pripada razredu prav
{
	float pl;
	pl = a*b;
	return pl;
};

void prav::pisi()//deklaracija
{
	cout<<"P = "<<p()<<endl;
};

void prav::beri()
{
	cout<<"a = "; cin>>a;
	cout<<"b = "; cin>>b;
};

void prav::pi()
{
	cout<<"vec srece prihodnjic.\n";
};

int main()
{
	prav pravokotnik;//class prav obravnavamo podobno kot tip podatka
	//pravokotnik.a=3; ne gre
	pravokotnik.beri();
	pravokotnik.pisi();
	pravokotnik.pi();
	cout<<"P = "<<pravokotnik.p()<<endl;//do funkcij lahko dostopamo
	return 0;
}
