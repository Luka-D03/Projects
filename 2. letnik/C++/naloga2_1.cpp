#include <iostream>
using namespace std;

int main()
{
    unsigned int N, X;
    float tab[100], vsota=0, rez;

    cout << "Vnesi skupno stevilo podatkov: ";
    cin >> N;

    while (N > 100 || N <= 0)
    {
        cout << "Stevilo je izven obsega" << endl;
        cout << "Ponovno vnesi stevilo: ";
        cin >> N;
    };

	
    while (X < N)
    {
        cout << X + 1 << ". Vnesi stevilo: ";
        cin >> tab[X];
        vsota += tab[X];
        X++;
    };

    rez = vsota / N;
    cout << "Povprecje vnesenih stevil je:  " << rez;

    return 0;
};
