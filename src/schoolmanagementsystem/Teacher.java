package schoolmanagementsystem;

/**
 * this class is responsible for keeping the track
 * of teachers name, id, salary
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * creates a new teacher object
     * @param id id for the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */
    public  Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return return the id for current teacher
     */
    public int getId(){
        return id;
    }
    //return the name of the teacher
    public String getName(){
        return name;
    }
    //return the salary of the teacher
    public int getSalary(){
        return salary;
    }
    //set the salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);

    }
}
