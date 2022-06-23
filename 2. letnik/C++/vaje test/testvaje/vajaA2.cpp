/*
a) Z uporabo while zanke, zapiši progam, ki bo sešteval vnesena decimalna števila toliko časa, dokler je vsota teh števil manjša od celoštevilska konstante k = 2000.
b) Sešteva naj le pozitivna števila, ter jih sproti tudi šteje.
c) Na koncu naj izpiše, koliko pozitivnih števil je seštel, ter kolikšna je njihova vsota. Izpis naj vsebuje ustrezne komentarje.
*/
#include <iostream>
#include <cmath>
using namespace std;
int main() {
    const int k = 2000;
    float vsota, x;
    int vnosi = 0;
    while (vsota < k)
    {
        cout<<"Vnesi stevilo: ";
        cin>>x;
        if (x > 0)
        {
            vsota += x;//vsota = vsota + x;
            vnosi++;
        }
    }
    cout<<"Sesteli smo "<<vnosi<<". pozitivnih stevil.\nNjihova vsota je: "<<vsota<<endl;

    return 0;
};