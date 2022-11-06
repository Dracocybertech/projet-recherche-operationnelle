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
        	//traitement qui donne le résultat = le meilleur trajet pour passer par toutes les adresses sans passer 2 fois par la même adresse (partant du dépot et revenant au dépot).
        	Collection<Sommet> resultat = meilleurTrajet(g,adresses);
        	Iterator<Sommet> iteratorResultat = resultat.iterator();
        	System.out.println("Le meilleur trajet est :");
        	System.out.println("");
        	int j=1;
        	while (iterator.hasNext()){
        		System.out.println(j+"."+iterator.next());
        		j++;
        	}
	}
	
	public static Collection<Sommet> meilleurTrajet(GrapheListe g,Collection<Sommet> adresses){
		GrapheListeChemin g2 = GrapheAmeliore(g,adresses);// retourne un graphe avec les adresses dont les arcs sont valués par les sommets composant l'arc et la longueur de ce chemin.
		Collection<Sommet> resultatIntermediaire = voyageurDeCommerce(g2);// retourne une collection de sommet correspondant au meilleur cycle hamiltonien (en terme de distance).
		Collection<Sommet> resultat = Trajet(resultatIntermediaire,g2);// retourne le chemin à effectuer en realit2 pour faire le cycle hamiltonien trouvé précedemment.
		return resultat;
	}
}
