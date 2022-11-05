all: Numerotation.class Sommet.class Arc.class ArcChemin.class Graphe.class GrapheListe.class BaladeEnVille.class

Numerotation.class: ./src/baladeEnVille/Numerotation.java
	javac -classpath ./classes -sourcepath ./src -d ./classes ./src/baladeEnVille/Numerotation.java
	
Sommet.class: ./src/baladeEnVille/Sommet.java
	javac -classpath ./classes -sourcepath ./src -d ./classes ./src/baladeEnVille/Sommet.java
	
Arc.class: ./src/baladeEnVille/Arc.java
	javac -classpath ./classes -sourcepath ./src -d ./classes ./src/baladeEnVille/Arc.java
	
ArcChemin.class: ./src/baladeEnVille/ArcChemin.java
	javac -classpath ./classes -sourcepath ./src -d ./classes ./src/baladeEnVille/ArcChemin.java
	
Graphe.class: ./src/baladeEnVille/Graphe.java
	javac -classpath ./classes -sourcepath ./src -d ./classes ./src/baladeEnVille/Graphe.java
	
GrapheListe.class: ./src/baladeEnVille/GrapheListe.java
	javac -classpath ./classes -sourcepath ./src -d ./classes ./src/baladeEnVille/GrapheListe.java
	
BaladeEnVille.class: ./src/baladeEnVille/BaladeEnVille.java
	javac -classpath ./classes -sourcepath ./src -d ./classes ./src/baladeEnVille/BaladeEnVille.java
	
clean:
	rm -f classes/baladeEnVille/*.class
