import java.util.Scanner;
class Student
{
int rollno;
String sname;
int s1,s2,s3;
int total;
Student()
{total=0;}
void set()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter student delails:roll no,name,s1,s2,s3");
rollno=sc.nextInt();
sname=sc.next();
s1=sc.nextInt();
s2=sc.nextInt();
s3=sc.nextInt();
if(s1>=50&&s2>=50&&s3>=50)
total=s1+s2+s3;
}
void disp()
{
System.out.println(rollno+"\t"+sname+"\t"+s1+"\t"+s3+"\t"+total);
}
public static void main(String[]args)
{
Student s[]=new Student[3];
for(int i=0;i<3;i++)
{
s[i]=new Student();
s[i].set();
}
System.out.println("RollNo \t Name \tM1\tM2\tM3\t Total\n");
for(int i=0;i<3;i++)
s[i].disp();
}
}