package ca.cgodin.beans;

public class Auteur {

private String nom;
private String prenom;
private boolean estActif;




@Override
public String toString() {
	return "Auteur [nom=" + nom + ", prenom=" + prenom + ", estActif=" + estActif + "]";
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public boolean isEstActif() {
	return estActif;
}
public void setEstActif(boolean estActif) {
	this.estActif = estActif;
}



}
