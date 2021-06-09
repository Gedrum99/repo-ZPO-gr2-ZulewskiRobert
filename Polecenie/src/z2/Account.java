package z2;

public class Account extends Bank {
    long balance=1000;
    String name;
    String interest;

    public Account(String name){
        this.name=name;
    }

    public void doOperation(Operation operation){
        operation.execute();
    }
}
