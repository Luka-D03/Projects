#include <iostream>
#include <cstdlib>//statisti�ne funkcije => rand()
#include <ctime>//�asovne funkcije
using namespace std;
//Naklju�na �tevila
int main()
{
	int N = 10;
	srand(time(0));//SAME: za�etno vrednost ve�emo na sistemski �as
	cout<<"\n";
	for(int i = 0; i <= N; i++)
	{
		cout<<rand()<<" ";
	};
	cout<<"\n\nOd 0 do 100:\n\n";
	//Naklju�na od 0 do 100 (ostanek pri deljenju s 100)
	for(int i = 0; i <= N; i++)
	{
		cout<<rand()%100<<" ";//ostanek pri deljenju s 100
	};
	cout<<"\n\n";
	//Naklju�na med 20 in 80
	for(int i = 0; i <= 20; i++)
	{
		cout<<20+rand()%(80-20)<<" ";//ostanek pri deljenju s 100
	};
	cout<<"\n\n";
	cout<<"\nMed a = -30 in b = 50:\n";
	int a = -30, b = 50;
	for(int i = 0; i <= 20; i++)
	{
		cout<<a+rand()%(b-a+1)<<" ";
	};
	return 2021;
}
