package z1.fabryka.wysyłka;

public abstract class Wysyłka {
    private String name;

    public String getName(){return name;}
    public void setName(String newName){name=newName;}

    public void send(){
        System.out.println("Wysyłka znaczków nastąpi poprzez: "+getName());
    }
}
