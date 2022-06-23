import java.util.Scanner;

/*
Napiši program, v katerega vnašamo dnevne športne aktivnosti: 
datum aktivnosti, čas trajanja aktivnosti in stopnja napora (nizka, srednja, visoka).
✔
Programu dodaj možnost, da izpiše tedensko statistiko: 
število športnih aktivnosti✔, skupen čas vseh aktivnosti v tednu✔, čas najdaljše aktivnosti✔, 
število posameznih stopenj napora✔ in povprečno stopnjo napora✔.

Tedenska statistika naj bo za 7 dni nazaj od datuma izpisa ali izpis po posameznem tednu v letu.

Programu dodaj možnost izpisa letne statistike.
*/
public class sportna_aktivnost {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Koliko Športnih aktnivnosti boste vnesli?");
        int spost = sc.nextInt();
        String [] DatumAktivnosti = new String[spost+1];
        String [] CasTrajanjaAktivnosti = new String[spost+1];
        String [] StopnjaNaporaAktivnosti = new String[spost+1];
        int cas = 0, nizka = 0, srednja = 0, visoka = 0, max = Integer.MIN_VALUE, casRac = 0, pov = 0;

        for (int i = 0, j = 0; i < spost; i++) {
            System.out.print("Vnesi datum aktivnosti(xx-xx-xxxx): ");
            DatumAktivnosti[i] = sc.next();
            sc.nextLine();
            System.out.print("Vnesi čas trajanja aktivnosti(xx.xx): ");
            CasTrajanjaAktivnosti[i] = sc.nextLine();
            System.out.print("Vnesi stopnjo napora aktivnosti(nizka, srednja, visoka): ");
            StopnjaNaporaAktivnosti[i] = sc.nextLine();
            
            if (StopnjaNaporaAktivnosti[i] == "nizka" || StopnjaNaporaAktivnosti[i] == "Nizka") {
                nizka++;
            } else if(StopnjaNaporaAktivnosti[i] == "srednja" || StopnjaNaporaAktivnosti[i] == "Srednja") {
                srednja++;
            } else if (StopnjaNaporaAktivnosti[i] == "visoka" || StopnjaNaporaAktivnosti[i] == "Visoka") {
                visoka++;
            } else {
                System.exit(007);
            }
            
            if (nizka <= srednja && srednja <= visoka) {
                pov = srednja;
            } else if(srednja <= nizka && nizka <= visoka) {
                pov = nizka;
            } else if(nizka <= visoka && visoka <= srednja) {
                pov = visoka;
            } else if (visoka <= srednja && srednja <= nizka) {
                pov = srednja;
            } else if(visoka <= nizka && nizka <= srednja) {
                pov = nizka;
            } else if(srednja <= visoka && visoka <= nizka) {
                pov = visoka;
            }
            

            String[] parts = CasTrajanjaAktivnosti[i].split("\\.");
            casRac = (Integer.parseInt(parts[j])*60)+Integer.parseInt(parts[j+1]);
            if (casRac > max) {
                max = casRac;
                cas += casRac;
            } else {
                cas += casRac;
            }
        }

        System.out.println("Športnih aktivnosti je bilo: " + spost);
        System.out.println("Skupen čas vseh aktivnosti je: " + cas);
        System.out.println("Čas najdaljše aktivnosti: " + max);
        System.out.println("Število aktivnosti po naporu:\nnizka: " + nizka + "\nsrednja: " + srednja + "\nvisoka: " + visoka);
        System.out.println("Povprečni napor aktivnosti je: " + pov);
        
    sc.close();
    }
}