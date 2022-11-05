package baladeEnVille;

import java.io.*;
import java.util.*;

/**
 * Classe d’arcs possédant des chemins en plus des valeurs
 *
 * @author Niels ETIEN
 */
// L’arc o -> d avec valeur val
public class ArcChemin {

    private Sommet o, d;
    private int val;
    private Sommet[] chem;

    public ArcChemin(Sommet o0, Sommet d0, int val0, Sommet[] chem0) {
        this.o = o0;
        this.d = d0;
        this.val = val0;
        this.chem = chem0;
    }

    public ArcChemin(ArcChemin a) {
        this.o = a.o;
        this.d = a.d;
        this.val = a.val;
        this.chem = a.chem;
    }

    public Sommet destination() {
        return d;
    }

    public Sommet origine() {
        return o;
    }

    public int valeur() {
        return val;
    }
    
    public Sommet[] chemin() {
        return chem;
    }

    public void modifierValeur(int vv) {
        this.val = vv;
    }
    
    public void modifierChemin(Sommet[] tab) {
        this.chem = tab;
    }

    public boolean equals(Object aa) {
        ArcChemin a = (ArcChemin) aa;
        return o.equals(a.o) && d.equals(a.d) && (val == a.val);
    }

    public String toString() {
        return "(" + this.o + ", " + this.d + ")";
    }

    public int hashCode() {
        String str = "" + this;
        return str.hashCode();
    }
}
