/*. 
a)Zapiši program, ki izračuna vrednosti funkcije y= 3x^3-2x+3 za vsa cela števila med 12 in 112.
b) Izračunane vrednosti naj sproti shranjuje v tabelo z imenom vrednosti.
c) Program naj izračuna in izpiše največjo vrednost izračunanih vrednosti v tabeli vrednosti.
*/

#include <iostream>
#include <cmath>

using namespace std;
int main() {
    
    int vrednosti[111] = {};
    int y, max = 0;

    for (int x = 13, i = 1; x < 112; x++, i++)
    {
        y = 3*pow(x, 3) - 2*x +3;
        vrednosti[i] = y;
        if (vrednosti[i] > max)
        {
            max = vrednosti[i];
        }; 
    };
    cout<<max<<endl;

    return 0;
};