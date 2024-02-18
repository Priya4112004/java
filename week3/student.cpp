#include <iostream>
using namespace std;
class Student
{ public: string fullName; 
int rollNum; 
double semPerentage; 
string collegeName; 
int collegeCode; 
Student()
 { 
 cout<<"Student class initialized!!\nIam a student\n";
 }
~Student(){} 
};
int main() 
{
Student LakshmiPriya;
cout<<"Enter your name : ";
getline(cin,LakshmiPriya.fullName);
cout<<"Enter your roll number : ";
cin>>LakshmiPriya.rollNum;
cout<<"Enter your sem percentage : ";
cin>>LakshmiPriya.semPerentage;
cout<<"Enter your college name : ";
cin>>LakshmiPriya.collegeName;
cout<<"Enter your college code : ";
cin>>LakshmiPriya.collegeCode;
cout<<"Name : "<<LakshmiPriya.fullName<<endl;
cout<<"RollNum : "<<LakshmiPriya.rollNum<<endl;
cout<<"SemPercentage : "<<LakshmiPriya.semPerentage<<endl;
cout<<"CollegeName : "<<LakshmiPriya.collegeName<<endl;
cout<<"CollegeCode : "<<LakshmiPriya.collegeCode<<endl;
return 0;
}
