package ex3;

public class Animaux {
    String nom;
    String type;
    String comportement;

    @Override
    public String toString() {
        return
                "nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                ", comportement='" + comportement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComportement() {
        return comportement;
    }

    public void setComportement(String comportement) {
        this.comportement = comportement;
    }

    public Animaux(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }
}
