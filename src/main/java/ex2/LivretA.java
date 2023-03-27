package ex2;

public class LivretA extends CompteBancaire {

	double tauxRemuneratoinAnnuel;


	public LivretA(double solde, double tauxRemuneratoinAnnuel) {
		super(solde, 0);
		this.tauxRemuneratoinAnnuel = tauxRemuneratoinAnnuel;
	}


	@Override
	public void ajouterMontant(double montant) {
		super.ajouterMontant(montant);
	}

	@Override
	public void debiterMontant(double montant) {
		if(getSolde()-montant>=0){
		super.debiterMontant(montant);
	}else{
			System.out.println("solde insuffisant");
		}
	}


	public double appliquerRemunerationAnnuelle(){
		return getSolde()*tauxRemuneratoinAnnuel/100;
	}

}
