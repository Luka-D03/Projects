//Zapi�i program, ki izracuna vrednosti funkcije y= 2(x^3-5koren od x) za liha �tevila med 10 in 120.
//Uporabi for zanko.
//
//Izracunane vrednosti funkcije naj v obliki y = "rezultat" sproti izpisuje, 
//vsak rezultat v novo vrstico (rezultat je izracunana vrednost).

#include <iostream>
#include <cmath>

using namespace std;

int main() {
	
	float y;
	for(int x =11; x < 120; x = x+2) {
		y = 2*(pow(x,3) - 5*sqrt(x));

		cout<<"f("<<x<<") = "<<y<<endl;
	};
	
};



