/*
Zapiši program, ki izračuna vrednosti funkcije y= 2(x^3-5√x) za liha števila med 10 in 120.
Uporabi for zanko.

Izračunane vrednosti funkcije naj v obliki y = "rezultat" sproti izpisuje, vsak rezultat v novo vrstico (rezultat je izračunana vrednost).
*/

#include <iostream>
#include <cmath>

using namespace std;
int main () 
{
    float y;
    
    for (int x = 11; x < 120; x+=2)
    {
        y = 2 * (pow(x,3)-5*sqrt(x));
        cout<<"y = "<<y<<endl;
    };
    return 0;
};