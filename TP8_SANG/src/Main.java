public class Main {
    static void main(String[] args){
        Byte choix = null;

    }

    static void menuPrincipal(){
        System.out.println("Bienvenue sur le sytème de gestion de l'ISEP");
        System.out.println("Que souhaitez vous faire ?");
        System.out.println("1. Section Élèves");
        System.out.println("2. Section Professeur");
        System.out.println("3. Section Module");
        System.out.printf("4. Quitter");
    }

    static void menuEtudiant(){
        System.out.println("Que voulez vous faire ?");
        System.out.println("1. Inscription à l'ISEP");
        System.out.println("2. S'inscrire à un module");
        System.out.println("3. Se désinscrire d'un module");
        System.out.println("4. Obtenir sa moyenne générale");
        System.out.println("5. Obtenir sa moyenne sur un module");
        System.out.println("6. Obtenir son bulletion");
        System.out.println("7. Retour");
    }

    static void menuEnseigant(){
        System.out.println("Que voulez vous faire ?");
        System.out.println("1. Inscription");
        System.out.println("2. Ajouter un note à un élève ");
        System.out.println("3. Devenir professeur d'un module");
        System.out.println("4. Arrêter de s'occuper d'un module");
        System.out.println("5. Retour");

    }

    static void menuModule(){
        System.out.println("Que voulez vous faire ?");
        System.out.println("1. Créer un nouveau module");
        System.out.println("2. Changer de professeur référent");
        System.out.println("3. Ajouter un professeur au module");
        System.out.println("4. Retirer un professeur du module");
        System.out.println("5. Obtenir la liste des moyennes des élèves d'un module");
        System.out.println("6. Obtenir la moyenne d'un module");
        System.out.println("7. Liste des étudiants d'un module");
        System.out.println("8. Quitter");
    }
}
