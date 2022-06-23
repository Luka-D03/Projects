#include <iostream>
using namespace std;
int main (){
	
int x=0;
int StLih = 0;
   
do 
{
  cout << "Vnesi stevilo: ";
      cin >> x;
      
      if (x % 2 == 1)
	  {
        StLih = StLih + 1;
      }
}
while (StLih < 10);

      
   
   cout << "Liha stevila: "<< StLih <<endl;   
}
