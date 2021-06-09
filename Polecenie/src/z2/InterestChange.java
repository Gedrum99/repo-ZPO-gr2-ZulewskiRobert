package z2;

public class InterestChange implements Operation{
    Account account;
    Interest interest;

    public InterestChange(Account account, Interest interest){
        this.account=account;
        this.interest=interest;
    }

    @Override
    public void execute () {
        System.out.println("Interest for account: "+ account.name+" was updated");
        account.interest= interest.getName();
        interest.compute();
    }
}
