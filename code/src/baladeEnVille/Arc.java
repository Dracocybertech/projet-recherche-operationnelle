package baladeEnVille;

import java.io.*;
import java.util.*;

/**
 * Classe d’arcs
 *
 * @author Niels ETIEN
 */
// L’arc o -> d avec valeur val
public class Arc {

    private Sommet o, d;
    private int val;

    public Arc(Sommet o0, Sommet d0, int val0) {
        this.o = o0;
        this.d = d0;
        this.val = val0;
    }

    public Arc(Arc a) {
        this.o = a.o;
        this.d = a.d;
        this.val = a.val;
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

    public void modifierValeur(int vv) {
        this.val = vv;
    }

    public boolean equals(Object aa) {
        Arc a = (Arc) aa;
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
