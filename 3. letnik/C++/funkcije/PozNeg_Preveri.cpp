/*
Preveri, �e je �tevilo negativno ali ve�je ali enako 0
*/
#include <iostream>

using namespace std;

bool NegPoz(int st){
	if(st < 0)
		return false;
	else
		return true;//true = 1, vse pstale vrednosti so false
};

int main()
{
    int a = -3;
    bool PN;
    PN = NegPoz(a);
    if(PN)
    	cout<<"Pozitivno ali nic\n";
    else
    	cout<<"Negativno\n";
    return 0;
};
