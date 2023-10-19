package bai2.entities;

public class Worker {
    private static int autoId;
    private int id;
    private String name;
    private int age;
    private double salary;
    private String workPlace;
    private Enum STATUS;

    public Worker(int id) {
        this.id = ++autoId;
    }

    public Worker(String name, int age, double salary, String workPlace) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workPlace = workPlace;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Worker.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public Enum getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Enum STATUS) {
        this.STATUS = STATUS;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", workPlace='" + workPlace + '\'' +
                '}';
    }
}
