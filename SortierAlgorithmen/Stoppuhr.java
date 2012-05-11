/*
 * Einfache Stoppuhr um Laufzeit der Sortieralgorithmen zu testen
 */
package SortierAlgorithmen;

/**
 *
 * @author merlin
 */
public class Stoppuhr {
    
    private long zStartzeit;
    private long zStoppzeit;
    
    public Stoppuhr()
    {
        this.reset();
    }
    
    public void reset()
    {
        zStartzeit = 0;
        zStoppzeit = 0;
    }
    
    public void start()
    {
        zStartzeit = System.currentTimeMillis();
    }
    
    public void stop()
    {
        zStoppzeit = System.currentTimeMillis();
    }
    
    public int zeit()
    {
        return (int)(zStoppzeit-zStartzeit);
    }
}
