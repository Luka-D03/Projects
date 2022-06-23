#include <iostream>
#include <cstdlib>//statistiène funkcije => rand()
#include <ctime>//èasovne funkcije
using namespace std;
//Nakljuèna števila
int main()
{
	int N = 10;
	srand(time(0));//SAME: zaèetno vrednost vežemo na sistemski èas
	cout<<"\n";
	for(int i = 0; i <= N; i++)
	{
		cout<<rand()<<" ";
	};
	cout<<"\n\nOd 0 do 100:\n\n";
	//Nakljuèna od 0 do 100 (ostanek pri deljenju s 100)
	for(int i = 0; i <= N; i++)
	{
		cout<<rand()%100<<" ";//ostanek pri deljenju s 100
	};
	cout<<"\n\n";
	//Nakljuèna med 20 in 80
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
