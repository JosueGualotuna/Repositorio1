package pryusoarraylist;

import java.util.ArrayList;

public class PryUSOARRAYLIST {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<String>();
      
//        String faces[] = new String[4];        
//        String nombre[] = {"rt","er"};
            
        nombres.add("Ann");
        nombres.add("Cindy");
        
        System.out.println(nombres);
        
        nombres.add(1, "Bob");

        nombres.remove(0);
        nombres.set(0, "Bill");
        String nombre = nombres.get(1);
        String last = nombres.get(nombres.size() - 1);
        System.out.println(nombres);

    }
}
