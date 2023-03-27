package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets",5,0));
		caisses.add(new Caisse("Moyens objets",20,5));
		caisses.add(new Caisse("Grands objets",99,20));
	}

	public void addItem(Item item) {

	for (Caisse caisse: caisses){
		caisse.addItem(item);
	}
	}

	public int taille() {
		int sizeTot=0;
		for(Caisse caisse: caisses){
			sizeTot+=caisse.getItems().size();
		}
		//TODO faites évoluer ce code.
		return sizeTot;
	}
}
