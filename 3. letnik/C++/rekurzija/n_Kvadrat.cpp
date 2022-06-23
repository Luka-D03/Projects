/*
Seštek n èlenov 1/2^n
a) s for zanko
b) rekurzija
*/
#include <iostream>
#include <cmath>
using namespace std;

//rekurzija
float VsotaRek(float N)
{
	if(N > 0)//klic funkcije za 1 manjše število
		return 1/pow(2,N) + VsotaRek(N-1);//N prištejemo vsoto do N-1
	if(N == 0)
		return 1;//tu se rekurzija konèa
};

//for zanka
float VsotaFor(int N)
{
	float vs = 0;
	for(int i = 0; i <= N; i++)
		vs += 1/pow(2,i);
	return vs;	
};

int main()
{
	float n, vs;
	cout<<"N = ";
	cin>>n;
	
	vs = VsotaRek(n);
	cout<<"vs z rekurzijo = "<<vs<<endl;
	vs = VsotaFor(n);
	cout<<"vs s for zanko = "<<vs<<endl;
	vs = 0;
	int i = 0;
	while(vs < 2) //teoretièno neskonèna zanka, ker vsota nikoli ne deseže vrednosti 2
	{
		vs += 1/pow(2,i);
		i++;//omejeno število decimalk. 1.99999 => 2
	};
	cout<<"while "<<vs<<", po "<<i<<" korakih."<<endl;

	return 0;
};
