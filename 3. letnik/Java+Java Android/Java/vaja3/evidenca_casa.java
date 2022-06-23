import java.util.Scanner;

/*
    Napisi program, ki evidentira delovni cas zaposlenega.

    Na zacetku vprasa za ime in priimek (Vnesi svoje ime in priimek), nato za uro prihoda in uro odhoda.

    Program primerja ime in priimek z imenom in priimkom zapisanim v tabeli.

    Izpise nam ime in priimek, uro prihoda, odhoda in stevilo ur in minut, ki jih je posameznik delal tisti dan.

    V primeru, da uporabnika ne najde naj izpise, da je prislo do napacnega vnosa oziroma, da uporabnik ne obstaja.
*/

public class evidenca_casa {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            //samo za barve izpisa
            final String ANSI_RESET = "\u001B[0m";
            final String ANSI_RED = "\u001B[31m";
            final String ANSI_GREEN = "\u001B[32m";
            final String ANSI_YELLOW = "\u001B[33m";
            final String ANSI_BLUE = "\u001B[34m";
            final String ANSI_PURPLE = "\u001B[35m";
            final String ANSI_CYAN = "\u001B[36m";
            final String ANSI_WHITE = "\u001B[37m";
            

            System.out.println(ANSI_YELLOW+"Koliko zaposlenih imate?"+ANSI_WHITE);//izpis
            int st = sc.nextInt();//vnost števila zaposlenih
            String [] imezaposlenega = new String[st];//inicializacija tabele za shranjevnaje imen
            String [] priimekzaposlenega = new String[st];//inicializacija tabele za shranjevanje priimkov
            String ime, priimek;//inicializacija za vpisana imane in priimke

            for (int i = 0; i < st; i++) {//zanka sa shranjevanje imen in priimkov zaposlenih
                System.out.print(ANSI_YELLOW+"Vnesite ime zaposlenega: "+ANSI_WHITE);///izpis
                ime = sc.next();//vpis imena zaposlenega
                sc.nextLine();//nevem zakaj ampak brez tega ne deluje
                System.out.print(ANSI_CYAN+"Vnesite priimek zaposlenega: "+ANSI_WHITE);//izpis
                priimek = sc.nextLine();//vpis priimka zaposlenega
                imezaposlenega[i] = ime;//shranjevanje imen v tabelo
                priimekzaposlenega[i] = priimek;//shranjevanje priimkov v tabelo
            }
            System.out.print(ANSI_BLUE+"Vnesi svoje ime: "+ANSI_WHITE);//izpis
            String uporabnik_ime = sc.nextLine();//vpis svojega imena za preverjanje

            System.out.print(ANSI_BLUE+"Vnesi svoj priimek: "+ANSI_WHITE);//izpis
            String uporabnik_priimek = sc.nextLine();//vpis svojega priimka za preverjanje

            System.out.print(ANSI_BLUE+"(x.xx) Vnesi čas prihoda: "+ANSI_WHITE);//izpis
            String prihod = sc.nextLine();//vpis časa prihoda

            System.out.print(ANSI_BLUE+"(x.xx) Vnesi čas odhoda: "+ANSI_WHITE);//izpis
            String odhod = sc.nextLine();//vpis časa odhoda

            for(int i = 0; i < st; i++) {//zanka, ki preverja ali je vneseno ime in priimek shranjeno v zaposlene
                
                if (imezaposlenega[i].equals(uporabnik_ime)) {//preverjanje imena
                    if (priimekzaposlenega[i].equals(uporabnik_priimek)) {//preverjanje priimka
                        System.out.print(ANSI_PURPLE+uporabnik_ime+" "+uporabnik_priimek+" "+ANSI_GREEN+prihod+" - "+odhod+ANSI_RESET);//izpis imena, priimka, prihoda in odhoda
                    } else {
                        System.out.print(ANSI_RED+"Prišlo je do napačnega vnosa oz. uporabnik ne obstaja."+ANSI_RESET);//izpis napake
                    }
                }
            }
        }
    }
}

        //koda, ki ne deluje

        /* int x = 1;
        String preverjanje = "Da";
        String ImeT[]= new String[0];
        String PriimekT[]= new String[0];
        String imeP[]= new String[0];
        String priimekP[]= new String[0];
        String prihodP[]= new String[0];
        String odhodP[]= new String[0];
        for (int i = 0; i < x; i++, x++) {
            if (preverjanje.contains("da") || preverjanje.contains("Da") || preverjanje.contains("DA") || preverjanje.contains("dA")) {
                System.out.print("Vnesi ime zaposlenega: ");
                ImeT[i] = sc.nextLine();
                System.out.print("Vnesi priimek zaposlenega: ");
                PriimekT[i] = sc.nextLine();
                System.out.println("Ali imate se kakega zaposlenega? (da) ali (ne)");
                preverjanje = sc.nextLine();
                System.out.print(ImeT[0]+"   "+PriimekT[0]);
            } else {
                    System.out.print("Vnesi svoje ime: ");
                    imeP[i] = sc.nextLine();
                    System.out.print("Vnesi svoj priimek: ");
                    priimekP[i] = sc.nextLine();
                    System.out.print("(x.xx) Vnesi cas prihoda: ");
                    prihodP[i] = sc.nextLine();
                    System.out.print("(x.xx) Vnesi cas odhoda: ");
                    odhodP[i] = sc.nextLine();
                    x--;
                    System.out.print(ImeT[0]+"   "+PriimekT[0]);
            }
            System.out.print(ImeT[0]+"   "+PriimekT[0]);
        }
        System.out.print(ImeT[0]+"   "+PriimekT[0]);
        String ime = ImeT[0];
        String priimek = PriimekT[0];
        for(int i = 0; i < ImeT.length; i++) {
            
            if (ImeT[0].equals(imeP[i])) {
                if (PriimekT[0].equals(priimekP[i])) {
                    System.out.print(imeP[i]+" "+priimekP[i]+" "+prihodP[i]+" - "+odhodP[i]);
                } else {
                    System.out.print("Prislo je do napacnega vnosa oz. uporabnik ne obstaja.");
                }
            } else {
                System.out.print("Prislo je do napacnega vnosa oz. uporabnik ne obstaja.");
            }
        } */
