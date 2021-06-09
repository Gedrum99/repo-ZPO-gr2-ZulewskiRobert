package z2;

public class Income implements Operation{
    Account account;

    public Income(Account account,long amount){
        this.account=account;
        System.out.println("Income for account: "+ account.name+" is equal to: "+amount);
        account.balance= account.balance+amount;
    }

    @Override
    public void execute () {
        System.out.println("Balance of account: "+ account.name+" is equal to: "+ account.balance );
    }
}
