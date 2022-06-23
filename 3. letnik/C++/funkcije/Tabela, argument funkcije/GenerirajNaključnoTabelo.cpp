#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;
/*
Generiraj tabelo celih naklju�nih �tevil med a in b, a<b
*/
void generiraj(int nakljucna[], int N, int a, int b)
{
	//tabele velikosti N, �tevila mad a in b
	srand(time(0));//SAME: za�etno vrednost ve�emo na sistemski �as
	if(a>b)//ju zamenjam
	{
		int r = a;
		a = b;
		b = r;
	};
	for(int i = 0; i < N; i++)
	{
		nakljucna[i] = a+rand()%(b-a+1);
	};
};
int main()
{
	int N = 100, k = 0;
	int a = -133, b = 133;
	int tab[N];
	generiraj(tab, N, a, b);
	for(int i = 0; i < N; i++)
	{
		cout<<tab[i]<<", ";
	};
	return 0;
};
