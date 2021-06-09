package z3;

public interface State {
    void zablokuj();
    void odblokuj();
    void login(String login,String hasło) throws InterruptedException;
    void error();
}
