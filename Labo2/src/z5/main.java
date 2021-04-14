package z5;

import z5.działania.*;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Działanie>math=new ArrayList<Działanie>();
        math.add(new Dodawanie() );
        math.add(new Odejmowanie() );
        math.add(new Mnożenie() );
        math.add(new Dzielenie() );
        math.add(new Potęga() );

        for(int i=0;i<math.size();i++) {
            for (int j = 0; j < math.size() - 1; j++) {
                {
                    if (math.get( j ).getWaga() < math.get( j+1 ).getWaga()) {
                        Działanie tmp = math.get( j + 1 );
                        math.set( j + 1, math.get( j ) );
                        math.set(j,tmp);

                    }
                }
            }
        }

        System.out.println("Kolejność wykonywania działań to(działania o tej samej wadze mogą być wykonywane naprzemian):");
        for(int i=0;i<math.size();i++){
            System.out.print("Miejsce "+i+1+" Symbol: "); System.out.println(math.get( i ).getSymbol() + " Waga "+ math.get(i).getWaga());
        }
    }
}
