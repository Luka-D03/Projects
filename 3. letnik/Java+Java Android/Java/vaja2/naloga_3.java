import java.util.Scanner;
//Napiši program, ki prebira cene izdelkov. Dodaj možnost, da poljubnemu izdelku dodaš popust 
//in da ob izbiri lahko iz celotne cene odstraniš najcenejši izdelek.
//Na koncu izpiši končno ceno.
public class naloga_3 {
    public static void main(String[] args) {
        Scanner vhod = new Scanner (System.in);
        int x = 1, v = 0;
        float koncna = 0, cena = 0, min = 999999999;
        
        for (int i = 0; i < x; i++, x++) {
            System.out.print("Če izdelkov ni več napišite ok, drugače napišite ceno izdelka: ");
            String y = vhod.next();
            if(y.contains("ok") || y.contains("Ok")){
                /* System.out.println("Vnesi velikost popusta: ");
                int popust = vhod.nextInt();
                koncna = (cena * popust) / 100;
                koncna = cena - koncna; */
                
                System.out.println("Ali želite odstraniti najcenejši izdelek? ");
                System.out.print("Ali ima ta izdelek popust? (da) oz. (ne): ");
                String odl = vhod.next();
                if (odl.contains("Da") || odl.contains("da")) {
                cena -= min;
                x--;
                } else {
                x--;  
                }
            } else {
                float s = Float.parseFloat(y);
                System.out.print("Ali ima ta izdelek popust? (da) oz. (ne): ");
                String pop = vhod.next();
                if (pop.contains("Da") || pop.contains("da")) {
                    System.out.print("Vnesi velikost popusta: ");
                    int popust = vhod.nextInt();
                    koncna = (s * popust) / 100;
                    koncna = s - koncna;
                } else {
                    koncna = s;
                }
                cena += koncna;
                if(koncna < min) {
                    min = koncna;
                }
            }
        }
        System.out.println("Cena s popustom je: "+ cena+"€");
    }
}
