package z4;

public class InterestChange implements Operation {
    Account account;
    Interest interest;
    Boolean Authorized=true;

    public InterestChange(Account account, Interest interest){
        this.account=account;
        this.interest=interest;
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
        System.out.println("Interest for account: "+ account.name+" was updated");
        account.interest= interest.getName();
        interest.compute();
    }
}
