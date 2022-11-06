package baladeEnVille;

import java.io.*;
import java.util.*;

/**
 * Classe d’arcs possédant des chemins en plus des valeurs
 *
 * @author Niels ETIEN
 */
// L’arc o -> d avec valeur val
public class ArcChemin extends Arc{

    private Sommet[] chem;

    public ArcChemin(Sommet o0, Sommet d0, int val0, Sommet[] chem0) {
        super(Sommet o0, Sommet d0, int val0);
        this.chem = chem0;
    }

    public ArcChemin(ArcChemin a) {
        super(a);
        this.chem = a.chem;
    }
    
    public Sommet[] chemin() {
        return chem;
    }

    public void modifierChemin(Sommet[] tab) {
        this.chem = tab;
    }
}
