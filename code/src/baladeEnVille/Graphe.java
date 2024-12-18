package baladeEnVille;

import java.util.*;

/**
 * Classe abstraite de graphes
 * 
 * @author Niels Etien
 */
public abstract class Graphe {

    public abstract int taille();

    public abstract Graphe copie();

    public abstract void ajouterSommet(Sommet s);

    public abstract boolean existeArc(Sommet s, Sommet t);

    public abstract void ajouterArc(Sommet s, Sommet t, int val);

    public abstract int valeurArc(Sommet s, Sommet t);

    public abstract void enleverArc(Sommet s, Sommet t);

    public abstract Collection<Sommet> sommets();
    
    public abstract int flotMaxFordF(Graphe g);

    public abstract int degre(Sommet s);

}
