package z2.fabryka.transport;

public abstract class Transport {
    private String name;

    public String getName(){return name;}
    public void setName(String newName){name=newName;}

    public void send(){
        System.out.println("Transport środkiem: "+getName()+" został wysłany");
    }
}
