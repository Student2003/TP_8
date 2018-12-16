import java.util.List;

public class Module {
    String nom;
    int code;
    List<String> listeEnseignant;
    List<String> listeEtudiant; // liste des mails étudiants par module

    public Module(String nom, int code,List<String> listeEnseignant, List<String> listeEtudiant){
        this.nom=nom;
        this.code = code;
        this.listeEnseignant = listeEnseignant;
        this.listeEtudiant = listeEtudiant;
    }

    public void rajouterEtudiant(Etudiant a){
        this.listeEtudiant.add(a.mail);
    }

    public void enleverEtudiant(Etudiant a){
        this.listeEtudiant.remove(a.mail);
    }

    public void afficherEleves(){
        for (int i = 0; i< this.listeEtudiant.size(); i++){
            System.out.println(this.listeEtudiant.get(i));
        }
    }

    public void rajouterEnseignant(Enseignant a){
        this.listeEnseignant.add(a.mail);
    }

    public void enleverEnseignat(Enseignant a){
        this.listeEnseignant.remove(a.mail);
    }

    public void setListeEnseignant(){
        for (int i = 0; i< this.listeEnseignant.size(); i++){
            System.out.println(this.listeEnseignant.get(i));
        }
    }

}
