package z3.fabryka.meble;

import z3.fabryka.meble.style.Styl;

public abstract class Mebel {
    private String name;
    private Styl styl;

    public String getName(){return name;}
    public void setName(String newName){name=newName;}

    public String getStyl(){return styl.getName();}
    public void setStyl(Styl newStyl){styl=newStyl;}

    public void display(){
        System.out.println(getName()+" w stylu "+getStyl());
    }
}
