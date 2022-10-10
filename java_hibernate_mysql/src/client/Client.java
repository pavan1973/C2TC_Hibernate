package client;
import java.util.Scanner;
import entities.Student;
import service.StudentService;
import service.StudentServiceImpl;
public class Client {
public static void main(String[] args) {
	

//Debug this program as Debug -> Debug as Java Application
StudentService service = new StudentServiceImpl();
Student student = new Student();
System.out.println("enter the number for operation");
System.out.println("input 1 to create operation");
System.out.println("input 2 to Retrieve Operation");
System.out.println("input 3 to Update Operation");
System.out.println("input 4 to Delete Operation");



Scanner s= new Scanner(System.in);
int button=s.nextInt();

switch (button) {

// Create Operation
case 1:
System.out.println("enter the student ID");
Scanner s1= new Scanner(System.in);
int a = s1.nextInt();
student.setStudentId(a);
System.out.println("enter the student name");
Scanner s2= new Scanner(System.in);

String b = s2.nextLine();
student.setName(b);
service.addStudent(student);
break;


//at this breakpoint, we have added one record to table
// Retrieve Operation


case 2:
	System.out.println("enter the student ID to get student info");
	Scanner s3= new Scanner(System.in);
	int d = s3.nextInt();
student = service.findStudentById(d);
System.out.print("ID:"+student.getStudentId());
System.out.println(" Name:"+student.getName()); 
break ;


case 3:
// Update Operation
	System.out.println("enter the student ID to updater the student ");
	Scanner s4= new Scanner(System.in);
	int  e= s4.nextInt();
student = service.findStudentById(e);
System.out.println("enter the student name");
Scanner s5= new Scanner(System.in);

String f = s5.nextLine();
student.setName(f);
service.updateStudent(student);
//at this breakpoint, we have updated record added in first section
student = service.findStudentById(e);
System.out.print("ID:"+student.getStudentId());
System.out.println(" Name:"+student.getName()); 
break;
//at this breakpoint, record is removed from table
// Delete Operation
case 4:
	System.out.println("enter the student ID to delete the student  ");
	Scanner s6= new Scanner(System.in);
	int g = s6.nextInt();
student = service.findStudentById(g);
service.removeStudent(student);
break;

 default:
	 System.out.println("enter the valid option");
}
System.out.println("End of program/Life cycle completed...");
}

}
