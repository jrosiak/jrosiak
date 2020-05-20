package TUT_10_3;

public class Manager extends Employee {

    double bonus;
    double managerSalary;

    public Manager(String name, String surname, int birthYear, int currentYear, String companyName, double salary, double bonus) {
        super(name, surname, birthYear, currentYear,companyName, salary);
        this.bonus=bonus;
        managerSalary=this.salary+this.bonus;
        age=this.currentYear-this.birthYear;
    }


    @Override
    public double getSalary(){
        return managerSalary;
    }

    @Override
    public String toString(){
        return "Manager with last name "+surname+ " and age "+age+" has salary "+ managerSalary;
    }

}
