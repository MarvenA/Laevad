package OOP_pommitamine;

import java.util.Scanner;

/**
 * Created by maus on 21.11.15.
 */
public class Mangija {
    private Scanner sc = new Scanner(System.in); //Klassi muutuja

    public int[] kuhuLasta() {
        System.out.println("Sisesta koordinaadid, kuhu tulistad formaadis vert-horis:");
        String[] input = sc.nextLine().split("-");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        return new int[]{x,y};
    }

    public void pihtas() {
        System.out.println("Said pihta.");
    }

    public void moodas() {
        System.out.println("Möödas.");
    }
}
