package entities;

public class Employee {

    public String name;
    public double grossSalary, tax, percentage;

    public double netSalary() {
        return (grossSalary - tax) + percentage * grossSalary / 100;
    }

    public void increaseSalary(double percentage) {
        this.percentage = percentage;
        
        
    }
    
                
    
}
