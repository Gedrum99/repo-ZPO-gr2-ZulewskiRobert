package z4;

public class Income implements Operation {
    Account account;
    Boolean Authorized=true;

    public Income(Account account, long amount){
        this.account=account;
        System.out.println("Income for account: "+ account.name+" is equal to: "+amount);
        account.balance= account.balance+amount;
        account.summarise( "Income", amount );
    }
    @Override
    public void setAuthorized (boolean authorized) {
        Authorized = authorized;
    }
    @Override
    public boolean getAuthorized () {
        return Authorized;
    }
    @Override
    public void execute () {
        System.out.println("Balance of account: "+ account.name+" is equal to: "+ account.balance );
    }
}
