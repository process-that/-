#include<iostream>
using namespace std;
void test() {
	int a[33];
	int i = 0;
	int n;
	cin >> n ;
	for (i;;i++) {
		a[i] = n % 2;
		n = n / 2;
		if (n == 0) {
			break;
		}
	}
	for (i;i >= 0;i--) {
		cout << a[i];
	}
	
}
int main() {
	test();
	system("pause");
	return 0;
}