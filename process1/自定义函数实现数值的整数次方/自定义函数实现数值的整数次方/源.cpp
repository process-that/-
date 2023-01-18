#include<iostream>
using namespace std;

double Power(double base, int ex) {
	double num=1.0;
	if (base == 0 && ex == 1) {
		return -1;
	}
	if (ex == 1) {
		return base;
	}
	if (ex == 0) {
		return num;
	}
	if (ex > 0) {
		for (int i = 1;i <= ex;i++) {
			num *= base;
		}
	}
	else if (ex < 0) {
		for (int i = 1;i <= -ex;i++) {
			num *=base;
		}
		num = 1 / num;
	}
	
	return num;
}

int main() {
	double result=Power(2.000, 14);
	cout << result;

	
}