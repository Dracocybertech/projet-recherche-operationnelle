package baladeEnVille;

import java.util.*;
import java.io.*;

public class BaladeEnVille{
	public static void main(String[] args) {
		// création du graphe
		GrapheListe g = GrapheListe.deFichier("./data/reseau.txt");
		Collection<Sommet> s = g.sommets();
		
		// Stockage des adresses avec le nb d'adresses posé plus haut.
		Iterator<Sommet> iterator = s.iterator(); 
		
		Collection<Sommet> adresses = new LinkedList<Sommet>();
		int i=1;
		int nbAdresses=5;
		while (iterator.hasNext() && (i<=nbAdresses)){
			adresses.add(iterator.next());
			i++;
        	}
	}
}
