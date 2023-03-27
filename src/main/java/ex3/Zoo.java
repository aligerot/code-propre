package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;

	private List<Animaux> listAnimaux;
	
	public Zoo(String nom){
		this.nom = nom;
		listAnimaux=new ArrayList<>();
	}
	public Zoo(String nom,List<Animaux> listAnimaux){
		this.nom = nom;
		this.listAnimaux=listAnimaux;
	}
	
	public void addAnimal(Animaux animal){
	listAnimaux.add(animal);
	}

	public void afficherListeAnimaux(){
		for (Animaux animal:listAnimaux) {
			System.out.println(animal);
		}
	}
	
	public int taille() {
		return listAnimaux.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
