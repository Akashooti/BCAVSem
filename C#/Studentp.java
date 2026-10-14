Package student.Fulltime.BCA;
import java.util.Scanner;
Public class Studentpkg{
String name;
int age;
String sex;
Public void inputDetails(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter name: ");
name = sc.nextLine();
System.out.print("Enter age: ");
age = sc.nextInt();
sc.nextLine();
System.out.print("Enter sex: ");
sex = sc.nextLine();
}
Public void displayDetails() {
System.out.println("\n--- Student Details ---");
System.out.println("Name   :"+ name);
System.out.println("Age    :"+ age);
System.out.println("Sex    :"+ sex);
}
}