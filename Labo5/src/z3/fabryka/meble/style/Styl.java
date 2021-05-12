package z3.fabryka.meble.style;

import z3.fabryka.meble.Mebel;

public abstract class Styl {
    private String name;

    public String getName(){return name;}
    public void setName(String newName){name=newName;}

    public void display(){
        System.out.println("Styl: "+getName());
    }
}
