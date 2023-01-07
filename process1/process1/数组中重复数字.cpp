#include<iostream>
using namespace std;
#include<algorithm>
int arr[] = { 3,2,1,0,2,5,3 };
int len = sizeof(arr) / sizeof(int);
void test01()
{
	for (int i = 0;i < len-1;i++)
	{
		for (int j = 0;j < len - 1 - i;j++)
		{
			if (arr[j] > arr[j + 1])
			{
				swap(arr[j], arr[j + 1]);
			}
		}
	}
	for (int k = 0;k < len;k++)
	{
		if (arr[k] == arr[k + 1])
		{
			cout << arr[k] << endl;
		}
	}
}
int test02()
{
	for (int k = 0;k < len;k++)
	{
		while (k != arr[k])
		{
			if (arr[k] == arr[arr[k]])
			{
				return arr[k];
			}
			else
			{
				swap(arr[k], arr[arr[k]]);
			}
		}
	}
}

int main()
{
	//test01();
	test02();
	system("pause");
	return 0;
}