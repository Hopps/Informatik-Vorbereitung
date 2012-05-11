package datenstrukturen;

public class Schlange<Type> {

    Knoten Kopf;

    public Schlange() {

    }

    public void fuegeEin(Type obj) {
        if(Kopf == null)
            Kopf = new Knoten(obj);
        else
            Kopf.fuegeAn(new Knoten(obj));
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
            if(nachFolger == null)
                nachFolger = d;
            else
                nachFolger.fuegeAn(d);
        }

        private Type getInhalt() {
            return inhalt;
        }

        private Knoten getNachFolger() {
            return nachFolger;
        }

    }

}
