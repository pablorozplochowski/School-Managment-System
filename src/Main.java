import school.managment.system.School;
import school.managment.system.Student;
import school.managment.system.Teatcher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teatcher lizzy = new Teatcher(1, "Lizzy", 500);
        Teatcher mellisa = new Teatcher(2, "Mellisa", 700);
        Teatcher tomek = new Teatcher(3, "Tomek", 999);

        List<Teatcher> teatcherList = new ArrayList<>();

        teatcherList.add(lizzy);
        teatcherList.add(mellisa);
        teatcherList.add(tomek);


        Student weronika = new Student(1, "weronika", 4);
        Student wiktor = new Student(2, "wiktor", 5);
        Student pawel = new Student(3,"pawel", 8);

        List<Student> studentList = new ArrayList<>();

        studentList.add(weronika);
        studentList.add(wiktor);
        studentList.add(pawel);

        School highSchool = new School(teatcherList, studentList);

        wiktor.payFees(6000);
        weronika.payFees(5000);
        System.out.println("high school has earned: $" + highSchool.getTotalMoneyEarned());

    }
}
