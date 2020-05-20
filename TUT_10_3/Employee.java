package TUT_10_3;

public class Employee extends Person{

    int hireYear;
    String companyName;
    double salary;

    public Employee(String name, String surname, int birthYear,   int currentYear, String companyName, double salary){
        this.name=name;
        this.surname=surname;
        this.birthYear=birthYear;
        this.currentYear=currentYear;
        this.companyName=companyName;
        this.salary=salary;
        age=this.currentYear-this.birthYear;
    }

    public int getJobSeniority(){
        int seniority = currentYear-hireYear;
        return seniority;
    }

    public double getSalary(){
        return salary;
    }

}
