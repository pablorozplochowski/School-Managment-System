package school.managment.system;

public class Teatcher {
    private int id;
    private String name;
    private int salary;

    public Teatcher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(){
        this.salary = salary;
    }
}
