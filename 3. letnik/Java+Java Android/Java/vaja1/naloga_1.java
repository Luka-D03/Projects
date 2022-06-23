/**
Napiši program, ki izpiše števila med 6 in 53 in vsoto teh števil deljeno s številom teh števil.
 */
public class naloga_1 {

    public static void main(String[] args) {
        int v = 0, s = 0;
        float d;
        for(int i = 7; i < 53; i++) {
            s++;
            v += i;
            System.out.println(i);
        }
        d = v/s;
        System.out.println("vsota deljene s številom števil je: "+d);
    }
}