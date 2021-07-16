package schoolmanagementsystem;
/**
 * Created by janarthanan on 16/5/2021
 * this class is responsible for keeping track of students
 * track of students,fees,name,grade and fess paid
 *
*/
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;

    /**
     * role of constructor is to create a new student by initialising
     * fees for every students is 60,000 rupees per year
     * fees paid initially is 0.
     * @param id id for the student
     * @param name name of the student
     * @param grade grade of the student
     */

    public Student(int id, String name, int grade){

        this.feesPaid = 0;
        this.totalFees = 60000;

        this.id = id;
        this.name = name;
        this.grade = grade;

    }
    //not going to alter students name,students id.

    //use to update students grade
    public void setGrade(int grade){
        this.grade = grade;

    }

    /**
     * feespaid = 10,000 + 20,000 + 30,000
     * keep adding the fee to the feespaid field
     * Add the to the paid fees
     * The school is going to receive the funds
     */
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }
    //return the id of the student
    public int getId() {
        return id;
    }
    //return the name of the student
    public String getName() {
        return name;
    }
    //return the grade of the student
    public int getGrade() {
        return grade;
    }
    //return the fees paid by the student
    public int getFeesPaid() {
        return feesPaid;
    }
    //return the total fees of the student
    public int getTotalFees() {
        return totalFees;
    }
    public int getRemainingFees(){
        return totalFees-feesPaid;
    }
}
