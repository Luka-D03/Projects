/*. 
a)Zapiši program, ki izračuna vrednosti funkcije y= 3x^3-2x+3 za vsa cela števila med 12 in 112.

b) Izračunane vrednosti naj sproti shranjuje v tabelo z imenom vrednosti.

c) Program naj izračuna in izpiše največjo vrednost izračunanih vrednosti v tabeli vrednosti.
*/

#include <iostream>
#include <cmath>

using namespace std;
int main ()
{
    float y, max;
    float vrednosti[101] = {};
    max = INT_MIN;

    for (int i = 13, x = 0; i <112 ; i++, x++)
    {
      y = 3*pow(x,3)-2*x+3;
      vrednosti[x] = y;
      if (vrednosti[x] > max)
      {
          max = vrednosti[x];
      }
      
    };

    cout<<"Najvecja vrednst je: "<<max<<endl;
    return 0;
};