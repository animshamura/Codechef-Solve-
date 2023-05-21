#include <iostream>
#include <string>
using namespace std;

int main() {
	int t,a,b;
	cin>>t;
	for(int i = 1; i <= t; i++) {
        cin>>a>>b;
	    if((b-a)%3==0 || (b-a-1)%3==0)cout<<"YES"<<endl;
	    else cout<<"NO"<<endl;
	}
}
