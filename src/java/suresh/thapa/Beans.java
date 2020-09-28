/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suresh.thapa;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author rokerz
 */
@ManagedBean(name = "bean")
@SessionScoped
public class Beans implements Serializable {

    private static final long serialVersionUID = 1L;

   String firstName;
   String midName;
   String lastName;
   String faculty;
   String program;
   private static final ArrayList<Student> studentList = new ArrayList<Student>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }



    public String addAction() {
        Student st = new Student(this.firstName, this.midName, this.lastName, this.faculty, this.program);

        studentList.add(st);
        return null;
    }

    public String deleteAction(Student student) {
        studentList.remove(student);
        return null;
    }

    public String saveAction() {
        //get all existing value but set "editable" to false
        for (Student student : studentList) {
            student.setEdit(false);
        }
        //return to current page
        return null;
    }

    public String editAction(Student student) {
        student.setEdit(true);
        return null;
    }
}
