package baladeEnVille;

public class BaladeEnVille{
	public static void main(String[] args) {
		GrapheListe g = initialiserGraphe();
	}
	
	public GrapheListe initialiserGraphe(){
		GrapheListe g = GrapheListe.deFichier("./data/reseau.txt");
		g.modifierValeur(d,m2,47);
		g.modifierValeur(d,s1,13);
		g.modifierValeur(s1,s2,18);
		g.modifierValeur(s2,s3,5);
		g.modifierValeur(s2,s11,64);
		g.modifierValeur(s3,s5,11);
		g.modifierValeur(s4,s5,38);
		g.modifierValeur(s4,v,38);
		g.modifierValeur(v,s10,46);
		g.modifierValeur(s10,m1,60);
		g.modifierValeur(m1,s12,36);
		g.modifierValeur(s12,s13,10);
		g.modifierValeur(s12,s8,45);
		g.modifierValeur(s8,s9,15);
		g.modifierValeur(s8,s6,30);
		g.modifierValeur(s7,s9,30);
		g.modifierValeur(s6,s7,15);
		g.modifierValeur(s6,s5,12);
		g.modifierValeur(s11,s9,8);
		g.modifierValeur(s11,r,10);
		g.modifierValeur(r,s10,47);
		return g;
	}
}


