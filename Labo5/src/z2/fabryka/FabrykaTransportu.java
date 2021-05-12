package z2.fabryka;


import z2.fabryka.transport.Ciężarówka;
import z2.fabryka.transport.Statek;
import z2.fabryka.transport.Transport;

public class FabrykaTransportu {
    public Transport nowyTransport(String nowy){
        Transport transport = null;

        if(nowy.equals( "Ciężarówka" )){
            return new Ciężarówka();
        }else
        if(nowy.equals( "Statek" )){
            return new Statek();
        }
        else return null;
    }
}
