/*Zapiši program, ki vrne
sedemkratnik število, ki ga funkcija sprejme kot 
vhodno spremenjljivko.
Krajše: sedemkratnik celega števila
Nikoli ne izpisujemo ali beremo podatkov v funkciji, ki vrne vrednost (nepisano pravilo)
*/
#include <iostream>

using namespace std;

int sedemkratnik(int a) {
	int r;
	r = a*7;
	return r;
};

int main()
{
    int b, c;
    cout<<"Vnesi stevilo: "<<endl;
    cin>>b;
    c = sedemkratnik(b);
    cout<<c<<endl;
	return 0;
};
