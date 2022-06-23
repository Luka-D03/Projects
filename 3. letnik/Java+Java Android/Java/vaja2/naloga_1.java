import java.util.Scanner;

//Napiši program, ki prebira cene izdelkov. Ko vnesemo vse cene, določimo popust in izpišemo končno ceno.

public class naloga_1 {
    public static void main(String[] args) {
        Scanner vhod = new Scanner (System.in);
        int x = 1, v = 0;
        float koncna = 0, cena = 0;

        for (int i = 0; i < x; i++, x++) {
            System.out.print("Če izdelkov ni več napišite ok, drugače napišite ceno izdelka: ");
            String y = vhod.next();
            if(y.contains("ok")){
                System.out.println("Vnesi velikost popusta: ");
                int popust = vhod.nextInt();
                koncna = (cena * popust) / 100;
                koncna = cena - koncna;
                x--;
            } else {
                float s = Float.parseFloat(y);
                cena += s;
            }
        }
        System.out.println("Cena s popustom je: "+ koncna+"€");
    }
}