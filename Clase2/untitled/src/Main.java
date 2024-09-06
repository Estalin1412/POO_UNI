// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String s1 = "";
        String s2 = "Hola";
        int anIni = 4, andFin = 2, tasaPor = 4, meses, i, j, k;
        double tasaIni = .05, ahMes = 100, tasaJ, vF, tasaMes;


        for (j = 0, tasaJ = tasaIni; j < tasaPor; j++, tasaJ += .005) {
            System.out.printf(" %.1f%% ", tasaJ * 100);
        }
        int n = 5, m = 0;

        for (i = 0; i < n - 2; i++)
            for (j = i + 1; j < n - 1; j++)
                for (k = j + 1; k < n; k++) m++;
        System.out.println(m);

        i = 0;
        m = 1;
        while (i < 26) {
            m = m * 2;
            i++;
        }
        System.out.println(m);
    }
}