package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument{


    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
        public void executer() {
            if (this.parameters.length != 1) {
                System.err.println("Cette commande n'accepte pas de paramètres");
                return;
            }
            this.document.clear();
        }
}
