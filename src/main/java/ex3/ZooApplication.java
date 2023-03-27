package ex3;

import java.util.ArrayList;
import java.util.List;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		
		 zoo.addAnimal(new Animaux("Gazelle", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animaux("Zèbre", "MAMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animaux("Lion", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal( new Animaux("Panthère", "MAMMIFERE", "CARNIVORE"));
		zoo.addAnimal( new Animaux("Requin blanc", "POISSON", "HERBIVORE"));
		zoo.addAnimal( new Animaux("Truite dorée", "POISSON", "HERBIVORE"));
		zoo.addAnimal( new Animaux("Boa constrictor", "SERPENT", "CARNIVORE"));
		zoo.addAnimal( new Animaux("Python", "SERPENT", "CARNIVORE"));



		zoo.afficherListeAnimaux();
	}

}
