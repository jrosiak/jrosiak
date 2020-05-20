package TUT_10_2;

public abstract class Animal implements Movable {
    String name;

    public Animal(String name){
        this.name=name;
    }

    public abstract String getType();

    public String getName(){
        return name;
    }

}


