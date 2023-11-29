package packA;

public class Programmer {
    private String name;
    protected int salary;
    private int experience;

    public Programmer(String n, int exp, int sal) {
        this.name = n;
        this.experience = exp;
        this.salary = sal;
    }

    public Programmer(String n) {
        this.name = n;
    }

    public Programmer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String toString() {
        return "meaw";
    }

    public void sayHi() {
        System.out.println("hi from"+ name);
    }
}
