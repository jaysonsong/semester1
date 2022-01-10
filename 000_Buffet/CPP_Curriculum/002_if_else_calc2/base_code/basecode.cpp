// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int x;
	int y;
	char z;
	int b;
	char q = '/';
	char w = '*';
	char e = '+';
	char r = '-';
	cout<<"enter 2 numbers"<<endl;
	cin>>x>>y;
	cout<<"choose an operator (%,/,+,-)"<<endl;
	cin>>z;
	
	if(z==q){
	b=x/y;
	cout<<b<<endl;
	}
	if(z==w){
	b=x*y;
	cout<<b<<endl;
	}
	if(z==e){
	b=x+y;
	cout<<b<<endl;
	}
	if(z==r){
	b=x-y;
	cout<<b<<endl;
	}
	
	
	
	

}
