import java.util.Scanner;

/*
    Napiši program, ki prebira imena in priimke, letnico rojstva skakalcev v daljino in njihov rezultat.

    Na začetku mu podaš število tekmovalcev. 

    Program izpiše ime in priimek tekmovalca, ki je dosegel najdaljši skok.
*/
public class ocena2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            //vpis števila tekmovalcev
            System.out.println("Koliko je tekmovalcev?");
            int st = sc.nextInt();
            //incializacija vsega potrebnega
            String [] imetekmovalca = new String[st+1];
            String [] priimektekmovalca = new String[st+1];
            int [] letnicatekmovalca = new int[st+1];
            float [] rezultat = new float[st+1];
            int stv = 0;
            float max = -2147483648;
            //for zanka, ki zahteva vnašanje imena, priimka, letnico rojstva in rezultat tekmovalcev
            for (int i = 0; i < st; i++) {
                System.out.print("Vnesite ime tekmovalca: ");
                imetekmovalca[i] = sc.next();
                sc.nextLine();

                System.out.print("Vnesite priimek tekmovalca: ");
                priimektekmovalca[i] = sc.nextLine();

                System.out.print("Vnesite letnico rojstva tekmovalca: ");
                letnicatekmovalca[i] = sc.nextInt();

                System.out.print("Vnesite rezultat tekmovalca(xx,xx): ");
                rezultat[i] = sc.nextFloat();
                //iskanje najboljšega rezultata
                if(rezultat[i] > max)
                    max = rezultat[i];
                    stv = i;
            }
            stv = stv-1;
            //izpis tekmovalčevega imena in priimka ter njegov rezultat
            //tekmovalec, ki je dosegel najboljsi rezultat
            System.out.println("Zmagal je: \n"+imetekmovalca[stv]+" "+priimektekmovalca[stv]+"\nz dolžino skoka: "+max);
        }
    }
}