#include <iostream>
#include <cmath>

using namespace std;

class kvader
{//podatki
	private://dosegljivi le preko metode (funkcije) za vnos
		float a, b, c;
	public: //metode, funkcije, so javne
		//preverimo, èe so stranice >0
		bool so()//NI ARGUMENTOV
		{
			if((a > 0) and (b > 0) and (c > 0))
				return true;
			else
				return false;
		};
		float V();//najava, deklariramo jo "zunaj"(JE PA VSEENO KJE!)
		float P()
		{
			return 2*(a*b + a*c + b*c);
		};
		float D()//diagonala
		{
			return sqrt(pow(a,2) + pow(b,2) + pow(c,2));//a*a + b*b + c*c
		};
		//vnos podatkov preko metode, funkcije
		void vnos();
		void izpis();//funkcij za izpis je lahko veè
		//ker lahko izpišemo le del izraèunanih podatkov
};

float kvader::V()
{
	return a*b*c;
};

void kvader::vnos()
{
	cout<<"KVADER\nVnesi podatke:\n";
	cout<<"a = "; cin>>a;
	cout<<"b = "; cin>>b;
	cout<<"c = "; cin>>c;
};

int main()
{
	kvader k;
	k.vnos();
	//k.a = 3; //ne deluje, deluje le v strukturi, a = preivate
	cout<<"P = "<<k.P()<<endl;
	return 0;	
};
