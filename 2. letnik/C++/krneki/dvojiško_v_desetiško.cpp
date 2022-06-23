#include <iostream>
#include <cmath>

using namespace std;

int z(long long);

int main()
{
    long long n;

    cout<<"Vnesi dvojisko stevilo: ";
    cin>>n;
 
    cout<<n<<" v dvojiskem = "<< z(n) << " v desetiskem.";
    return 0;
}

int z(long long n)
{
    int decimalno = 0, i = 0, x;
    while (n!=0)
    {
        x = n%10;
        n /= 10;
       	decimalno += x*pow(2,i);
        ++i;
    }
    return decimalno;
}
