#include <iostream>
#include <cstdlib>
#include <ctime>
#include <cmath>
using namespace std;

float nak()
{
	float nk;
	nk = 2*(float)rand()/RAND_MAX-1;//pomik 1 levo, razteg
	return nk;//Savi� je sre�en, od -1 do 1
};

int main()
{
	srand(time(0));//SEME: za�etno vrednost ve�emo na sistemski �as
	long N = 10000000;
	double x, y, d, pi;
	int ZnKrog = 0;
		cout<<"RAND_MAX "<<RAND_MAX<<endl;
	for(long i = 1; i < N; i++)
	{
		//�tejemo, koliko jih je znotraj kroga
		x = nak();//med -1 in 1
		y = nak();
		d = x*x+y*y;
		if(d <= 1)
			ZnKrog++;
	};
	pi = 4*(double)ZnKrog/N;//N "plo��ina" kvadrata = �tevilo to�k v kvadratu
	cout<<"PI je priblizno "<<pi<<endl;
	cout<<"Napaka: "<<M_PI-pi<<endl;
	return 0;
};
