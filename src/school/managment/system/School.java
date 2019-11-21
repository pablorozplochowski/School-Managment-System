package school.managment.system;

import java.util.List;

/**
 * Many teachers, many students
 */
public class School {
    private List<Teatcher> teatchers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    public School(List<Teatcher> teatchers, List<Student> students) {
        this.teatchers = teatchers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teatcher> getTeatchers() {
        return teatchers;
    }

    public void addTeatchers(Teatcher teatcher) {
        teatchers.add(teatcher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    static public void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent -= moneySpent;
    }
}
