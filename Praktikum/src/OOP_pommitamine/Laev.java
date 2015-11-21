package OOP_pommitamine;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by maus on 21.11.15.
 */
public class Laev {

    private int laevaPikkus;
    private int[] koordinaadid;

    public Laev(int pikkus, int lauaServaPikkus) {
        laevaPikkus = pikkus;
        genereeriKoordinaadid(lauaServaPikkus);
    }

    private void genereeriKoordinaadid(int lauaServaPikkus) {
        Random rand = new Random();
        int x = rand.nextInt(lauaServaPikkus);
        int y = rand.nextInt(lauaServaPikkus);
        koordinaadid = new int[]{x, y};
        System.out.println(Arrays.toString(koordinaadid));
    }
}
