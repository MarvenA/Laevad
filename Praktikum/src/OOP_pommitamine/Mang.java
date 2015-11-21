package OOP_pommitamine;

/**
 * Created by maus on 21.11.15.
 */
public class Mang {
    public Mang() {
        //1. Mängu seadistamine
        Meri meri = new Meri(10);
        Mangija mangija = new Mangija();

        //2. Mängu töös hoidmine
        while (meri.laevuOnAlles()){
            int[] lask = mangija.kuhuLasta();
            boolean pihtas = meri.saiPihta(lask);
            if (pihtas){
                mangija.pihtas();
            } else {
                mangija.moodas();
            }
        }

        // 3. Mis saab kui mäng on läbi?
        mangija.gameover();
    }
}
