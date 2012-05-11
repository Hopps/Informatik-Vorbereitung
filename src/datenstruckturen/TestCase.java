package datenstruckturen;

public class TestCase {

    public static void main(String[] args) {
        /*Schlange schlange = new Schlange();

        schlange.fuegeEin(5);
        schlange.fuegeEin(22165);
        schlange.fuegeEin(524545);
        schlange.fuegeEin(478785578);

        System.out.println((int) schlange.getInhalt());

        schlange.entferneKopf();

        System.out.println((int) schlange.getInhalt());*/

        Stapel stapel = new Stapel();
        stapel.fuegeEin(5);
        stapel.fuegeEin(22165);
        stapel.fuegeEin(2);

        System.out.println((int) stapel.getInhalt());
        stapel.entferneKopf();
        System.out.println((int) stapel.getInhalt());
        stapel.entferneKopf();
        System.out.println((int) stapel.getInhalt());
    }
}
