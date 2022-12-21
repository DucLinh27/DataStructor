package CodeP3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListStudent {
    private ArrayList<Student> lists;

    public ListStudent() {
        this.lists = new ArrayList<Student>();
    }

    public ListStudent(ArrayList<Student> lists) {
        this.lists = lists;
    }

    // 1.	AddStudent.
    public void addStudent(Student sv) {
        this.lists.add(sv);
    }

    //		2.	printListStudent.
    public void printListStudent () {
        for (Student student : lists) {
            System.out.println(student);
        }
    }
    //		3.	getNumberStudent.
    public int getNumberStudent() {
        return this.lists.size();
    }

    //		4.	checkStudentExists.
    public boolean checkStudentExists(Student sv) {
        return this.lists.contains(sv);
    }

    //		5.	DeleteStudent.
    public boolean DeleteStudent(Student sv) {
        return this.lists.remove(sv);
    }

    //		6.	SearchStudent.
    public void SearchStudent(String name) {
        for (Student employee : lists) {
            if(employee.getName().indexOf(name)>=0) {
                System.out.println(employee);
            }
        }
    }
    //		7.	sortStudentByDTB.
    public void sortStudentByDTB() {
        Collections.sort(this.lists, new Comparator<Student>() {
            @Override
            public int compare(Student sv1, Student sv2) {
                if(sv1.getDTB()<sv2.getDTB()) {
                    return 1;
                }else if(sv1.getDTB()>sv2.getDTB()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }
}
