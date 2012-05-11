package datenstruckturen;

public class Stapel {

    Knoten Kopf;

    public Stapel() {

    }

    public void fuegeEin(Object obj) {
        if(Kopf == null)
            Kopf = new Stapel.Knoten(obj);
        else {
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

    public Object getInhalt() {
        return Kopf.getInhalt();
    }


    class Knoten {

        Knoten nachFolger;
        Object inhalt;

        public Knoten(Object obj) {
            inhalt = obj;
        }

        private void fuegeAn(Knoten d) {
            if(nachFolger == null)
                nachFolger = d;
            else
                nachFolger.fuegeAn(d);
        }

        private Object getInhalt() {
            return inhalt;
        }

        private Knoten getNachFolger() {
            return nachFolger;
        }

    }

}
