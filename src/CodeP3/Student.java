package CodeP3;

import java.util.Objects;
import java.util.Scanner;
public class Student implements Comparable<Student> {
    private String IDStudent;
    private String Name;
    private String Birthday;
    private float DTB;
    public Student(String idStudent) {
        this.IDStudent = idStudent;
    }
    public Student(String idStudent, String name, String birthday, float dtb) {
        this.IDStudent = idStudent;
        this.Name = name;
        this.Birthday = birthday;
        this.DTB = dtb;
    }
    public String getIDStudent() {
        return IDStudent;
    }
    public void setIDStudent(String IDStudent) {
        this.IDStudent = IDStudent;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getBirthday() {
        return Birthday;
    }
    public void setBirthday(String birthday) {
        this.Birthday = birthday;
    }
    public float getDTB() {
        return DTB;
    }
    public void setDTB(float DTB) {
        this.DTB = DTB;
    }



    @Override
    public String toString() {
        return "Student IDStudent: " + IDStudent
                + " , Name=" + Name
                + ", Birthday =" + Birthday
                + ", DTB=" + DTB + "]";
    }
    @Override
    public int compareTo(Student o) {
        return this.IDStudent.compareTo(o.IDStudent);
    }
    @Override
    public int hashCode() {
        return Objects.hash(DTB, Name, IDStudent, Birthday);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return Objects.equals(IDStudent, other.IDStudent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListStudent dssv = new ListStudent();
        int choice = 0;
        do {
            System.out.println("---------- Management Students ----------- ");
            System.out.println("Please select option : ");
            System.out.println(
                    "1.	Add students to the list.\n"
                            + "2.	Print the list of students on the screen.\n"
                            + "3.	Get the number of students in the list.\n"
                            + "4.	Check if a student exists in the list, based on student ID.\n"
                            + "5.	Delete a student from the list based on student ID.\n"
                            + "6.	Search all students based on Name entered from keyboard.\n"
                            + "7.	Sort a list of students with high to low scores.\n"
                            + "0.   Exit\n"
                            + "Please select option: ");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice==1) {
//				1.	Thêm sinh viên vào danh sách.
                System.out.println("Input IDStudent: "); String idstudent = sc.nextLine();
                System.out.println("Input Name: "); String name = sc.nextLine();
                System.out.println("Input Birthday: "); String birthday = sc.nextLine();
                System.out.println("Input DTB: "); float dtb = sc.nextFloat();
                Student sv = new Student(idstudent, name, birthday, dtb);
                dssv.addStudent(sv);
            }else if(choice==2) {
//				2.	printListStudent
                dssv.printListStudent();
            }else if(choice==3) {
//				4.	getNumberStudent
                System.out.println("Current Quantity: "+ dssv.getNumberStudent());
            }else if(choice==4) {
//				6.	checkStudentExists
                System.out.println("Enter student code: "); String idemployee = sc.nextLine();
                Student sv = new Student(idemployee);
                System.out.println("Check students on the list : "+dssv.checkStudentExists(sv));
            }else if(choice==5) {
//				7.	DeleteStudent
                System.out.println("Enter student code: "); String idstudent = sc.nextLine();
                Student sv = new Student(idstudent);
                System.out.println("Delete  students from the list: "+dssv.DeleteStudent(sv));
            }else if(choice==6) {
//				8.	SearchStudent
                System.out.println("Enter your first and last name: "); String name = sc.nextLine();
                System.out.println("Search Results: ");
                dssv.SearchStudent(name);
            }else if(choice==7) {
//				9.	sortStudentByDTB
                dssv.sortStudentByDTB();
                dssv.printListStudent();
            }
        }while(choice!=0);
    }
}
