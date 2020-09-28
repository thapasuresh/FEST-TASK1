/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suresh.thapa;

/**
 *
 * @author rokerz
 */
public class Student {
    String firstName;
    String midName;
    String lastName;
    String faculty;
    String program;
    boolean edit;

    public Student(String firstName, String midName, String lastName, String faculty, String program) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.program = program;
    }

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

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }
    
    
    
    
    
}




