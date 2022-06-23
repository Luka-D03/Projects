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
		float p()
		{
			float pl;
			pl = a*b;
			return pl;
		};
		void beri()
		{
			cout<<"a = "; cin>>a;
			cout<<"b = "; cin>>b;
		};
		void pisi()
		{
			cout<<"P = "<<p()<<endl;
		};
		void pi()
		{
			cout<<"vec srece prihodnjic.\n";
		}
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
