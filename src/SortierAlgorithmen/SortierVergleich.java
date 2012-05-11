/*
 * Hier sind die verschiedenen Sortieralgorithmen implementiert.
 * Darüber hinaus werden sie bezüglich der Laufzeit verglichen.
 */
package SortierAlgorithmen;

import java.util.Random;

/**
 *
 * @author merlin
 */
public class SortierVergleich {
    
    public static void main(String[] args)
    {
        SortierVergleich s = new SortierVergleich();
        s.testeSortierverfahren();
    }
    
    private int zN = 2000;
    private int[] zufallsZahlen;
    private Random hatRandom;
    private Stoppuhr hatUhr;
    
    public SortierVergleich()
    {
        zufallsZahlen = new int[zN];
        hatRandom = new Random();
        for ( int i = 0; i < zN; i++)
        {
            zufallsZahlen[i] = hatRandom.nextInt(zN);
        }
        hatUhr = new Stoppuhr();
    }
    
    public void testeSortierverfahren()
    {
        System.out.println("BubbleSort: ");
        hatUhr.start();
        int[] lZahlenBubbleSort = this.bubbleSort(zufallsZahlen);
        hatUhr.stop();
        if ( this.istSortiert(lZahlenBubbleSort) )
        {
            System.out.println("Funktioniert! Zeit: " +hatUhr.zeit() +"ms");
        }
        else
        {
            System.out.println("Kaputt!");
        }
        hatUhr.reset();
    }
    
    public boolean istSortiert(int[] pZahlen)
    {
        boolean lSortiert = true;
        for ( int i = 0; i < pZahlen.length-1; i++)
        {
            if ( pZahlen[i] > pZahlen[i+1] ) {
                lSortiert = false;
            }
        }
        return lSortiert;
    }
    
    public int[] bubbleSort(int[] pZahlen)
    {
        for (int i = 0; i < pZahlen.length; i++)
        {
            for (int j = 0; j < pZahlen.length-1; j++)
            {
                if ( pZahlen[j] > pZahlen[j+1])
                {
                    int lBuffer = pZahlen[j];
                    pZahlen[j] = pZahlen[j+1];
                    pZahlen[j+1] = lBuffer;
                }
            }
        }
        return pZahlen;
    }    
    
    
}
