#include <iostream>
#include <cmath>
using namespace std;

class valj
{
	private://privzeto
	//do podatkov ne moremo priti "direktno":v.r = 3
		float r,v;
	public:
		float P()
		{
			return 2*M_PI*r*(r+v);
		};
		float V()
		{
			return M_PI*pow(r,2)*v;
		};
		void vnos();
		void izpis();
		//to je najava, lahko jih pa tudi definiramo znotrajrazreda
};
//VNOS in IZPIS podatkov se vršie preko metod (=funkcij)
void valj::vnos()//na ta naèin bi lahko definirali tudi funkciji P in V
{
	cout<<"Valj: \n";
	cout<<"r = "; cin>>r;
	cout<<"v = "; cin>>v;
};

void valj::izpis()//valj.. kateremu "classu"pripada
{
	cout<<"P = "<<P()<<", V = "<<V()<<endl;
};
int main()
{
	valj v202;
	v202.vnos();
	v202.izpis();//ni nujna
	float pov;
	pov = v202.P();
	cout<<"\n P = "<<pov<<endl;
	cout<<"\n V = "<<v202.V()<<endl;
	
	return 0;
}
