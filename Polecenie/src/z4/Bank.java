package z4;

public class Bank {

    public Operation income(Account account, long amount){
        Operation o=new Income(account,amount);
        return o;
    }
    public Operation transfer(Account from,Account to){
        Operation o=new Transfer(from, to);
        return o;
    }
    public Operation interestChange(Account account, Interest interest){
        Operation o= new InterestChange(account,interest);
        return o;
    }

    public Operation PayOut(Account account){
        Operation o=new PayOut(account);
        return o;
    }
}
