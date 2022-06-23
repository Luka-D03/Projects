/*
Deklariramo strukturo tekmovalec:
- ime (niz)
- priimek (niz)
- ocene na maturi

*/
#include <iostream>
using namespace std;
int N = 30;
string predmeti[4] = {"matka", "slova", "teorija", "zmazek"};

struct ucenec
{
	string ime;
	string priimek;
	int ocene[4];//4 ocene na maturi
};

void vnos(ucenec tabela[], int N)
{
	for(int i = 0; i < N; i++)
	{
		cout<<"i = "<<i+1<<"\n\t";
		cout<<"Ime: "; cin>>tabela[i].ime;
		cout<<"\t";
		cout<<"Priimek: "; cin>>tabela[i].priimek;
		cout<<"\t";
		cout<<"Uspeh: \n";
		for(int j = 0; j < 4; j++)
		{
			cout<<"\t "<<predmeti[j]<<": ";
			cin>>tabela[i].ocene[j];
		};
	};

};

int x;//dosegljiv povsod, globalna spremenljivka

int main()
{
	ucenec triR[N];//tabela ucencev
	int st3R;//stevilo ucencev je v 3R
	cout<<"Koliko ucencev?\n"; cin>>st3R;
	
	vnos(triR, st3R);
	
	//izpiši ime dijaka, ki ima matematiko cvek
	for(int i =0; i < st3R; i++)//pregledamo tabelo dijakov
	{
		//matka je prva
		if(triR[i].ocene[0] == 1)
			cout<<"Matematicni cvekar je: "<<triR[i].ime<<endl;
	};
	
	return 0;
};
