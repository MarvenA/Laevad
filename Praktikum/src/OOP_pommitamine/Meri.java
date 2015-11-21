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

    public boolean laevuOnAlles() {
        for (int i = 0; i < laevastik.length; i++) {
            boolean elus = laevastik[i].oledElus();
            if(elus) {
                return true;
            }
        }
        return false;
    }

    public boolean saiPihta(int[] lask) {
        for (Laev laev : laevastik) {
            boolean pihtas = laev.kasTabas(lask);
            if(pihtas){
                return true;
            }
        }
        return false;
    }

    public void kuvaLaud() {
        for (int i = 0; i < lauaServaPikkus; i++) {
            for (int j = 0; j < lauaServaPikkus; j++) {
                boolean onLaev = kasLaevaOnSiin(i, j);
                if (onLaev) {
                    System.out.print(" 0 ");
                } else {
                    System.out.print(" ~ ");
                }
            }
            System.out.println();
        }
    }

    private boolean kasLaevaOnSiin(int i, int j) {
        for (Laev laev : laevastik){
            if (laev.oledSiin(i,j)){
                return true;
            }
        }
        return false;
    }
}
