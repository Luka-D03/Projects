/*
a) Program naj za N = 30 pozitivnih celih preveri, če so deljiva s številoma 5 in 3. 
če je število deljivo z obema številoma, naj izpiše "Število je deljivo z obema številoma". 

b) če je število deljivo le s 3 ali le s 5, naj izpiše: "Število je deljivo s 3" 
ali "Število je deljivo s 5".

Obvezno uporabo do-while zanko.
*/

#include <iostream>

using namespace std;
int main() 
{
    unsigned int N, i;
    i = 1;

    do
    {
        cout<<"Vnesi število: ";
        cin>>N;
        if (N % 5 == 0 && N % 3 == 0)
        {
            cout<<"Število je deljivo z obema številoma \n";
        }else {
            if (N % 5 == 0)
            {
                cout<<"Število je deljivo s 5 \n";
            }else {
                if (N % 3 == 0)
                {
                    cout<<"Število je deljivo s 3 \n";
                } 
            }
        }
        i++;
        
    } while (i <= 30);
    
    return 0;
};