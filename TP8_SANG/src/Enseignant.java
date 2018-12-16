import java.util.List;

public class Enseignant {
    String prenom;
    String nom;
    String mail;
    String specialite;
    List<String> listemodule;

    public Enseignant(String prenom, String nom, String mail, String specialite, List<String> listemodule){
        this.prenom= prenom;
        this.nom=nom;
        this.mail=mail;
        this.specialite = specialite;
        this.listemodule = listemodule;

    }

    public void ajouterModule(int codemodule){

    }


}
