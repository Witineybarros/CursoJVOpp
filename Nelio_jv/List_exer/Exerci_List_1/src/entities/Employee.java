package entities;

public class Employee {

    private String name;
    private Integer id;
    private Double salary;

    public Employee(String name, Integer id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double porcentage) {
        salary += salary * porcentage / 100;
    }

    @Override
    public String toString() {
        return "Name:" + name +"\n"
                + "Id:" + id + "\n"
                + String.format("Salary:%.2f" ,salary )+"\n" 
                + "---------------------";
    }

}
