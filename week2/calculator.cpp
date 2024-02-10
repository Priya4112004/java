#include<iostream>
using namespace std;
int main()
{
  float a,b;
  char op ;
  cout<<"Enter the first number : ";
  cin>>a;
  cout<<"Enter the second number : ";
  cin>>b;
  cout<<"Enter operator:1.Add\n 2.Subtract\n 3.Multiply\n 4.Division\n";
  cin>>op;
  switch(op)
    {
      case 1:
            cout<<a<<"+"<<b<<a+b;
            break;
      case 2:
            cout<<a<<"-"<<b<<a-b;
            break;
       case 3:
            cout<<a<<"*"<<b<<a*b;
            break;
       case 4:
            cout<<a<<"/"<<b<<a/b;
            break;
      default:
             cout<<"Invalid operator";
    }
}
