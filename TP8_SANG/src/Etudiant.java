import java.util.*;

public class Etudiant {
    String prenom;
    String nom;
    String mail;
    Byte annee;
    Map<String,List<Integer>> note; //Dictionnaire : clé->module,, valeur : liste des notes par module

    public Etudiant(String prenom, String nom, String mail, Byte annee, Map<String,List<Integer>> note){
        this.prenom=prenom;
        this.nom= nom;
        this.mail=mail;
        this.annee = annee;
        this.note= note;

    }

    public String getPrenom(){
        return prenom;
    }

    public String getNom(){
        return nom;
    }

    public String getMail(){
        return mail;
    }

    public Byte getAnnee(){
        return annee;
    }

    public int moyennemodule(String module){
        int somme = 0;
        List<Integer> notemodule = note.get(module);
        for (int i = 0; i< notemodule.size(); i++){
            somme += notemodule.get(i);
        }
        return somme/notemodule.size();
    }

    public void bulletin(){ //Imprimer son bulletin
        Collection keySet = note.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator + " : ");
            Object iterateur = iterator.next();
            System.out.println(moyennemodule(iterateur));
        }

    }



}
