import java.util.Scanner;

/*
 Program razširi tako, da program izpiše zmagovalca posamezne skupine. 
*/
public class ocena5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            //vpis števila tekmovalcev in števila skupin
            System.out.println("Koliko je tekmovalcev?");
            int st = sc.nextInt();
            System.out.println("Koliko je skupin?");
            int skupine = sc.nextInt();
            //inicializacije za letnice
            int [] l = new int[skupine*2];
            int l1, l2;
            //vnašanje letnic
            for (int i = 0, y = 1; i < skupine*2; i++, y++) {
                System.out.println("Med katerimi leti bo "+y+". skupina?");
                System.out.print("Vnesi 1. letnico: ");
                l1 = sc.nextInt();

                System.out.print("Vnesi 2. letnico: ");
                l2 = sc.nextInt();

                if(l1 < l2) {
                    l[i] = l1;
                    i++;
                    l[i] = l2; 
                } else {
                    l[i] = l2;
                    i++;
                    l[i] = l1; 
                }
            }
            //incializacija vsega potrebnega
            String [] imetekmovalca = new String[st+1];
            String [] priimektekmovalca = new String[st+1];
            int [] letnicatekmovalca = new int[st+1];
            float [] rezultat = new float[st+1];
            String [] all = new String[st+1];
            String [] sk1 = new String[st+1];
            String [] sk2 = new String[st+1];
            String [] sk3 = new String[st+1];
            String [] sk4 = new String[st+1];
            String [] sk5 = new String[st+1];
            String [] sk6 = new String[st+1];
            String [] sk7 = new String[st+1];
            String [] sk8 = new String[st+1];
            String [] sk9 = new String[st+1];
            String [] sk10 = new String[st+1];
            String zm1 = "a" ,zm2 = "a" , zm3 = "a", zm4 = "a", zm5 = "a", zm6 = "a", zm7 = "a", zm8 = "a", zm9 = "a", zm10 = "a";
            float max1 = -2147483648, max22 = -2147483648, max33 = -2147483648, max4 = -2147483648, max5 = -2147483648, max6 = -2147483648, max7 = -2147483648, max8 = -2147483648, max9 = -2147483648, max10 = -2147483648;
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
                //shranjevanje za lepši izpis
                all[i] = imetekmovalca[i] + " " + priimektekmovalca[i] + "\nRojen/a: " + letnicatekmovalca[i] + "\nDosegel/a " + rezultat[i] + " točk.";
            }
            //iskanje tekmovalce po skupinah ter iskanje najboljšega tekmovalca v posamezni skupini
            for (int i = 0; i <= skupine; i = i + 2) {
                for (int j = 0; j < st; j++) {
                    if (i == 0) {
                        if (letnicatekmovalca[j] >= l[i] & letnicatekmovalca[j] <= l[i+1]) {
                            sk1[j] = all[j];
                            if (max1 < rezultat[j]) {
                                zm1 = sk1[j];
                            }
                        }
                    }
                    if (i == 1) {
                        if (letnicatekmovalca[j] >= l[i] & letnicatekmovalca[j] <= l[i+1]) {
                            sk2[j] = all[j];
                            if (max22 < rezultat[j]) {
                                zm2 = sk2[j];
                            }
                        }
                    }
                    if (i == 2) {
                        if (letnicatekmovalca[j] >= l[i] & letnicatekmovalca[j] <= l[i+1]) {
                            sk3[j] = all[j];
                            if (max33 < rezultat[j]) {
                                zm3 = sk3[j];
                            }
                        }
                    }
                    if (i == 3) {
                        if (letnicatekmovalca[j] >= l[i] & letnicatekmovalca[j] <= l[i+1]) {
                            sk4[j] = all[j];
                            if (max4 < rezultat[j]) {
                                zm4 = sk4[j];
                            }
                        }
                    }
                    if (i == 4) {
                        if (letnicatekmovalca[j] >= l[i] & letnicatekmovalca[j] <= l[i+1]) {
                            sk5[j] = all[j];
                            if (max5 < rezultat[j]) {
                                zm5 = sk5[j];
                            }
                        }
                    }
                    if (i == 5) {
                        if (letnicatekmovalca[j] >= l[i] & letnicatekmovalca[j] <= l[i+1]) {
                            sk6[j] = all[j];
                            if (max6 < rezultat[j]) {
                                zm6 = sk6[j];
                            }
                        }
                    }
                    if (i == 6) {
                        if (letnicatekmovalca[j] >= l[i] & letnicatekmovalca[j] <= l[i+1]) {
                            sk7[j] = all[j];
                            if (max7 < rezultat[j]) {
                                zm7 = sk7[j];
                            }
                        }
                    }
                    if (i == 7) {
                        if (letnicatekmovalca[j] >= l[i] & letnicatekmovalca[j] <= l[i+1]) {
                            sk8[j] = all[j];
                            if (max8 < rezultat[j]) {
                                zm8 = sk8[j];
                            }
                        }
                    }
                    if (i == 8) {
                        if (letnicatekmovalca[j] >= l[i] & letnicatekmovalca[j] <= l[i+1]) {
                            sk9[j] = all[j];
                            if (max9 < rezultat[j]) {
                                zm9 = sk9[j];
                            }
                        }
                    }
                    if (i == 9) {
                        if (letnicatekmovalca[j] >= l[i] & letnicatekmovalca[j] <= l[i+1]) {
                            sk10[j] = all[j];
                            if (max10 < rezultat[j]) {
                                zm10 = sk10[j];
                            }
                        }
                    } 
                }
            }
            //izpis najboljšega tekmovalca v posamezni skupini
            for (int i = 0; i <= skupine; i = i + 2) {
                if (i == 0) {
                    System.out.println("V skupini med "+l[i]+" in "+l[i+1]+" je zmagal:\n"+zm1+"\n\n");
                }
                if (i == 1) {
                    System.out.println("V skupini med "+l[i]+" in "+l[i+1]+" je zmagal:\n"+zm2+"\n\n");
                }
                if (i == 2) {
                    System.out.println("V skupini med "+l[i]+" in "+l[i+1]+" je zmagal:\n"+zm3+"\n\n");
                }
                if (i == 3) {
                    System.out.println("V skupini med "+l[i]+" in "+l[i+1]+" je zmagal:\n"+zm4+"\n\n");
                }
                if (i == 4) {
                    System.out.println("V skupini med "+l[i]+" in "+l[i+1]+" je zmagal:\n"+zm5+"\n\n");
                }
                if (i == 5) {
                    System.out.println("V skupini med "+l[i]+" in "+l[i+1]+" je zmagal:\n"+zm6+"\n\n");
                }
                if (i == 6) {
                    System.out.println("V skupini med "+l[i]+" in "+l[i+1]+" je zmagal:\n"+zm7+"\n\n");
                }
                if (i == 7) {
                    System.out.println("V skupini med "+l[i]+" in "+l[i+1]+" je zmagal:\n"+zm8+"\n\n");
                }
                if (i == 8) {
                    System.out.println("V skupini med "+l[i]+" in "+l[i+1]+" je zmagal:\n"+zm9+"\n\n");
                }
                if (i == 9) {
                    System.out.println("V skupini med "+l[i]+" in "+l[i+1]+" je zmagal:\n"+zm10+"\n\n");
                }
            }

            /*  for(int i = 0; i < st; i++) {
                System.out.println(sk1[i]+"sk1");
                System.out.println(sk2[i]+"sk2");
                System.out.println(sk3[i]+"sk3");
                System.out.println(sk4[i]+"sk4");
                System.out.println(sk5[i]+"sk5");
                System.out.println(sk6[i]+"sk6");
                System.out.println(sk7[i]+"sk7");
                System.out.println(sk8[i]+"sk8");
                System.out.println(sk9[i]+"sk9");
                System.out.println(sk10[i]+"sk10");
            } */
            
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