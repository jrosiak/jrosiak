package TUT_12;

public class Administrator extends Employee {

    private String id;

    public Administrator(String name, String surname) {
        super(name, surname);
        this.name=name;
        this.surname=surname;

    }

    public void addEmployee(Employee e){
        e.setEmployed(true);
    }

    public void removeEmployee(Employee e){
        e.setEmployed(false);
    }

}
