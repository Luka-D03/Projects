#include <iostream>
using namespace std;

int main()
{
	unsigned int st;
	cout<<"st = ";
	cin>>st;
	if(st % 17 == 0)
	{
		st=st/17;//je deljivo	
	} else {
		cout<<"Stevilo ni deljivo s 17."<<endl;	
	}
	return 0;
};
