package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Vanitha = new Teacher(1, "Vanitha", 10000);
        Teacher Nandhini = new Teacher(2, "Nandhini", 12000);
        Teacher Varadharajan = new Teacher(3, "Varadharajan", 11000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Vanitha);
        teacherList.add(Nandhini);
        teacherList.add(Varadharajan);

        Student Jamalveve = new Student(1, "Jamalveve", 1);
        Student Gowtham = new Student(2, "Gowtham", 2);
        Student Keerthana = new Student(3, "Keerthana", 8);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Jamalveve);
        studentList.add(Gowtham);
        studentList.add(Keerthana);

        School mgm = new School(teacherList,studentList);


        Jamalveve.payFees(10000);
        Gowtham.payFees(15000);
        Keerthana.payFees(13000);
        System.out.println("GHS has earned "+ mgm.getTotalMoneyEarned() + " Rupees");

        System.out.println("---------------Making SCHOOL PAY Salary-----------------");

        Vanitha.receiveSalary(Vanitha.getSalary());
        System.out.println("GHS has spent for salary to "+ Vanitha.getName() +
        " and now has " +mgm.getTotalMoneyEarned()+ " Rupees");



    }
}
