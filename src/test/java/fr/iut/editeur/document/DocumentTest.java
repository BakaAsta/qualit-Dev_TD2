package fr.iut.editeur.document;

import junit.framework.TestCase;

public class DocumentTest extends TestCase {

    public void testDocument() {
        Document document = new Document();
        assertEquals("", document.getTexte());
    }

    public void testAjouter() {
        Document document = new Document();

        document.ajouter("Hello");
        assertEquals("Hello", document.getTexte());
    }

    public void testRemplacer() {
        Document document = new Document();
        document.ajouter("Hello");
        document.remplacer(0, 2, "Hi");
        assertEquals("Hillo", document.getTexte());
    }


    // fais un teste en warning jaune pour voir
    public void testMajuscules() {
        Document document = new Document();
        document.ajouter("Hello");
        document.majuscules(0, 2);

        assertEquals((new Document().ajouter("caca")), document.getTexte());
    }
}
