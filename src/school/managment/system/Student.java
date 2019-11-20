package school.managment.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Fees for every student is $30.000
     * Feed paid initially is 0
     *
     * @param id    for the student unique
     * @param name  name of student
     * @param grade grade of the student
     */
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * Used to update the student's grade
     *
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Add the fees to the feesPaid Field
     * The school is going to receive the funds
     *
     * @param fees
     */
    public void updateFeesPaid(int fees) {
        feesPaid += fees;

    }


}
