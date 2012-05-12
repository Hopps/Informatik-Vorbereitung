package datenstrukturen;
//TEst
public class Stapel<Type> {

    Knoten Kopf;

    public Stapel() {
    }

    public void fuegeEin(Type obj) {
        if (Kopf == null) {
            Kopf = new Stapel.Knoten(obj);
        } else {
            Knoten pKopf = Kopf;
            Kopf = new Stapel.Knoten(obj);
            Kopf.fuegeAn(pKopf);
        }
    }

    public void entferneKopf() {
        Kopf = Kopf.getNachFolger();
    }

    public Knoten getKopf() {
        return Kopf;
    }

    public Type getInhalt() {
        return Kopf.getInhalt();
    }

    class Knoten {

        Knoten nachFolger;
        Type inhalt;

        public Knoten(Type obj) {
            inhalt = obj;
        }

        private void fuegeAn(Knoten d) {
            if (nachFolger == null) {
                nachFolger = d;
            } else {
                nachFolger.fuegeAn(d);
            }
        }

        private Type getInhalt() {
            return inhalt;
        }

        private Knoten getNachFolger() {
            return nachFolger;
        }
    }
}
