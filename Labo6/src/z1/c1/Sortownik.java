package z1.c1;

public class Sortownik {

    public Sortownik (){
    }


    public void Sortuj(int lista[]){
        System.out.println("Sortowanie !!!");
        for(int i=0;i<lista.length;i++){
            for(int j=0;j<lista.length-1;j++){
                if(lista[j]>=lista[j+1] ){
                    int tmp=lista[j];
                    lista[j]=lista[j+1];
                    lista[j+1]=tmp;
                }
            }
        }
    }
}
