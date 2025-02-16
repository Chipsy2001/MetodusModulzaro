package metóduszáró;

import java.util.Scanner;

public class logikaiFeladat {

    static Scanner sc = new Scanner(System.in, "iso-8859-2");
    static String[] palya = {"X", "X", "X", " ", "O", "O", "O"};
    static int[] sorszam = {0, 1, 2, 3, 4, 5, 6};
    static String SEP = System.lineSeparator();

    public static void main(String[] args) {
        feladat();
    }

    private static void feladat() {
        feladatleiras();
        oszlopMegjelenit();
        mezoMegjelenit();
        boolean nyeres = bekeres();
        nyeres(nyeres);

    }

    private static void feladatleiras() {
        System.out.println("Helyezze át az X és O karaktereket, úgy hogy csak üres helyekre helyezheti õket.");

    }

    private static void oszlopMegjelenit() {
        for (int i = 0; i < sorszam.length; i++) {
            System.out.printf("%d ", sorszam[i]);
        }
        System.out.print(SEP);
    }

    private static void mezoMegjelenit() {
        for (int i = 0; i < palya.length; i++) {
            System.out.printf("%s ", palya[i]);
        }
        System.out.print(SEP);
    }

    @SuppressWarnings("empty-statement")
    private static boolean bekeres() {
        int bekeres[] = new int[2];
        do {
            konzolraKiir("Melyik elemet szeretné áthelyezni (0-6): ");
            bekeres[0] = sc.nextInt();
            konzolraKiir("Melyik üres helyre szeretné áthelyezni (0-6): ");
            bekeres[1] = sc.nextInt();
                palya[bekeres[1]] = palya[bekeres[0]];
                palya[bekeres[0]] = " ";
                oszlopMegjelenit();
                mezoMegjelenit();
        } while (!(palya[0].equals("O") && palya[1].equals("O") && palya[2].equals("O") && palya[3].equals(" ")));
        boolean eredmeny = palya[0].equals("O") && palya[1].equals("O") && palya[2].equals("O") && palya[3].equals(" ");
        return eredmeny;
    }

    private static void nyeres(boolean nyeres) {
        if (nyeres) {
            konzolraKiir("Nyert, vege a jateknak! ");
        }

    }

    private static void konzolraKiir(String kimenet) {
        System.out.print(kimenet);
    }

}
