package OOP_pommitamine;

/**
 * Created by maus on 21.11.15.
 */
public class Meri {

    private int lauaServaPikkus; //Private näitab, et muutuja või meetod on kättesaadav ainult objekti siseselt
    private Laev[] laevastik = new Laev[5];


    public Meri(int pikkus) {
        lauaServaPikkus = pikkus;
        tekitaLaevastik();
    }

    private void tekitaLaevastik() {
        for (int i = 0; i < laevastik.length; i++) {
            laevastik[i] = new Laev(i+1, lauaServaPikkus);
        }
    }
}
