package schoolmanagementsystem;

import java.util.List;

/**
 * Many teachers Many students
 * implements teacher student in the arrayList
 */

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

    //new school object is created...
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    //add teacher to the school
    public void addTeachers(Teacher teacher) {
       teachers.add(teacher);
    }

    //return the list of students
    public List<Student> getStudents() {
        return students;
    }

    //add the student to the school...
    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    //add the total money earned by the school...
    public static void updateTotalMoneyEarned(int MoneyEarned) {
       totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which
     * is the salary given by the school to its teachers
     * @param moneySpent
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
