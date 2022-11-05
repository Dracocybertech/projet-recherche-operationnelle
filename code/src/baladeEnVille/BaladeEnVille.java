package baladeEnVille;

import java.util.*;
import java.io.*;

public class BaladeEnVille{
	public static void main(String[] args) {
		int i=1;
		GrapheListe g = GrapheListe.deFichier("./data/reseau.txt");
		Collection<Sommet> s = g.sommets();
		Iterator<Sommet> iterator = s.iterator(); 
		while (iterator.hasNext()){  
            		System.out.println(i++ + "." + iterator.next());  
        	}
	}
}
