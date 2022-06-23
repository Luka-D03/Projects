#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

void GenStev(int N, int a, int b, unsigned int Nakljucna[])
{
    srand(time(0));
	if(a>b)
	{
		int r = a;
		a = b;
		b = r;
	};
	for(int i = 0; i < N; i++)
	{
		Nakljucna[i] = a+rand()%(b-a+1);	
	};  
}

void Zamenjaj(unsigned int GenStev[], unsigned int Obratno[], int N)
{
	for(int i = 0, j = N; i < N; i++, j--)
		Obratno[j-1] = GenStev[i];
};

void izpis(unsigned int Obratno[], int N)
{
    for (int i = 0; i < N; i++)
    {
        cout<<Obratno[i]<<" ";

    };
};

int main()
{
    int N = 200, a = -50, b = 150;
    unsigned int Nakljucna[N] = {};
    unsigned int Obratno[N] = {};

    GenStev(N, a, b, Nakljucna);
    Zamenjaj(Nakljucna, Obratno, N);
    izpis(Obratno, N);

    return 0;
};
