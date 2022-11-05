package baladeEnVille;
import java.io.*;
import java.util.*;

/*    Classe de Sommets
@author Niels ETIEN
 */
public class SommetPlusCourtChemin extends Sommet  {
    final int MAX_DISTANCE = 100;

    private int distance;
    private List<Sommet> plusCourtChemin = new LinkedList<>();

    public SommetPlusCourtChemin(String nn, int mm) {
        super(nn,mm);
        this.distance = MAX_DISTANCE;
    }

    public int valeurMarque() {
        return marque;
    }

    public void modifierMarque(int m) {
        marque = m;
    }

    public boolean equals(Object o) {
        return nom.equals(((Sommet) o).nom);
    }

    public int compareTo(Object o) {
        Sommet s = (Sommet) o;
        return nom.compareTo(s.nom);
    }

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String toString() {
        return "" + nom + " "+ " marque "+ this.marque + " distance : " +this.distance;
    }

    public int hashCode() {
        return nom.hashCode();
    }

    public static void main(String[] args) {
        SommetPlusCourtChemin s = new SommetPlusCourtChemin("SommetTest",13);
        System.out.println(s);
    }
}
