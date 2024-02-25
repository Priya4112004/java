import java.util.Scanner; 
class Student010
{
 public String fullName; 
int rollNum; 
double semPercentage;
String collegeName;
 int collegeCode; 
Student010()
{ 
     System.out.println("Student class is created successfully!!\nIam a student\n");
 } 
 protected void finalize() throws Throwable
{ 
   System.out.println("The class is finalized\n"); 
} 
}
public class Student
{
 public static void main(String[] args) 
{ 
Student010 priya=new Student010();; 
Scanner input=new Scanner(System.in); 
System.out.print("Enter your sweet name : "); 
priya.fullName=input.nextLine(); 
System.out.print("Enter your rollNumber : "); 
priya.rollNum=input.nextInt(); 
System.out.print("Enter your semPercentage : "); priya.semPercentage=input.nextDouble(); 
input.nextLine(); 
System.out.print("Enter your collegeName : "); 
priya.collegeName=input.nextLine(); 
System.out.print("Enter your collegeCode : "); 
priya.collegeCode=input.nextInt(); 
System.out.print("Name : "+priya.fullName+"\n"); 
System.out.print("RollNumber : "+priya.rollNum+"\n"); System.out.print("SemPercentage : "+priya.semPercentage+"\n"); System.out.print("CollegeName : "+priya.collegeName+"\n"); System.out.print("CollegeCode : "+priya.collegeCode+"\n"); input.close();
 } 
} 
