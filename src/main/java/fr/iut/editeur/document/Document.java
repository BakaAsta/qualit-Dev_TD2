package fr.iut.editeur.document;

import java.util.Objects;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.deepEquals(texte, document.texte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(texte);
    }

    /**
     * Description de la méthode
     * @param start donne la position du premier caractère à remplacer
     * @param end donne la position du dernier caractère à remplacer
     * @param remplacement donne la chaîne de caractères qui va remplacer la sélection
     * @return Description de la valeur retournée
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }
    public void majuscules(int start, int end) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        String toUpper = texte.substring(start, end).toUpperCase();
        texte = leftPart + toUpper + rightPart;
    }

    public void effacer(int start, int end) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + rightPart;
    }

    public void clear() {
        texte = "";
    }
    @Override
    public String toString() {
        return this.texte;
    }
}
