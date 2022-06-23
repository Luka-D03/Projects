import java.util.Scanner;

/**
 Program razširi tako, da izpišeš imena in priimke treh najdaljših skokov in dolžino skoka najmlajšega in najstarejšega tekmovalca.
 */
public class ocena3 {
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
            int stv = 0, stv2 = 0, stv3 = 0, Max = -2147483648, Min = 536871066;
            float max = -2147483648, max2 = -2147483648, max3 = -2147483648, let_cas_min = 0, let_cas_max = 0;
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
                //iskanje 3 najboljših rezultatov
                if (rezultat[i] > max) {
                    max3 = max2;
                    max2 = max;
                    max = rezultat[i];
                    stv = i;
                    stv2 = i;
                    stv3 = i; 
                } else 
                if (rezultat[i] > max2) {
                    max3 = max2;
                    max2 = rezultat[i];
                    stv2 = i;
                    stv3 = i;
                } else
                if (rezultat[i] > max3) {
                    max3 = rezultat[i];
                    stv3 = i;
                }
                //iskanje najmlajšega in najstarejšega tekmovalca
                if(Max < letnicatekmovalca[i]) {
                    Max = letnicatekmovalca[i];
                    let_cas_max = rezultat[i];
                }

                if(Min > letnicatekmovalca[i]) {
                    Min = letnicatekmovalca[i];
                    let_cas_min = rezultat[i];
                }
                /* if(max2 > max3)
                    max3 = max2;
                    stv3 = i;
                if(max > max2)
                    max2 = max;
                    stv2 = i;
                if(rezultat > max)
                    max = rezultat;
                    stv = i; */
            }
            /* stv = stv; */
            stv2 = stv2-1;
            stv3 = stv3-2;
            //izpis 3 najboljših tekmovalcev njihovo ime, priimek in rezultat
            System.out.println("\nZmagal je: \n\t"+imetekmovalca[stv]+" "+priimektekmovalca[stv]+"\n\tz dolžino skoka: "+max);
            if (st > 1) {
                System.out.println("\nDrugi povrsti je: \n\t"+imetekmovalca[stv2]+" "+priimektekmovalca[stv2]+"\n\tz dolžino skoka: "+max2);
            }
            if (st > 2) {
                System.out.println("\nTretji povrsti je: \n\t"+imetekmovalca[stv3]+" "+priimektekmovalca[stv3]+"\n\tz dolžino skoka: "+max3);            
            }
            //izpis najmlajšega in najstarejšega tekmovalca
            System.out.println("\n\nNajmlajši skakalec je dosegel rezultat: "+let_cas_min);
            System.out.println("\nNajstarejši skakalec je dosegel rezultat: "+let_cas_max);
        }
    }
}