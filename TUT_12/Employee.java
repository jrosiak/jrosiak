package TUT_12;

import java.util.ArrayList;

public class Employee extends User {

    private boolean isEmployed;
    private String id;
    public static int EMPLOYEE_COUNTER=0;
    private ArrayList<Client> clients = new ArrayList<>();

    public Employee(String name, String surname){
        this.name=name;
        this.surname=surname;
        EMPLOYEE_COUNTER++;
        id="E."+EMPLOYEE_COUNTER;
        isEmployed=false;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    @Override
    public void addClient(Client c) throws AccountOperationException {
        if (isEmployed) {
            clients.add(c);
        }else{
            throw new AccountOperationException("Employee " +name+ " "+surname+ " has no permission to perform any activities, please assign different employee to this operation");
        }
    }

    @Override
    public void openAccount(Client c) throws AccountOperationException {
        if (!c.hasAccount) {
            if (isEmployed) {
                c.hasAccount = true;
                for (int i = 0; i < clients.size(); i++) {
                    if (c.equals(clients.get(i))) {
                        c.assignAccount(new BankAccount(c));
                        return;
                    }
                }
                throw new AccountOperationException("Employee " +name+ " "+surname+ " has no permission to open an account for this client, please assign different employee to this operation");

            } else {
                throw new AccountOperationException("Employee " +name+ " "+surname+ " has no permission to perform any activities, please assign different employee to this operation");
            }

        }else{
            throw new AccountOperationException("This person already has an account!");
        }
    }
}
