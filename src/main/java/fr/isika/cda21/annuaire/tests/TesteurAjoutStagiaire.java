package fr.isika.cda21.annuaire.tests;

import fr.isika.cda21.annuaire.models.ArbreBinaire;
import fr.isika.cda21.annuaire.models.GestionFichiers;
import fr.isika.cda21.annuaire.models.Noeud;
import fr.isika.cda21.annuaire.models.Stagiaire;

import java.io.IOException;

public class TesteurAjoutStagiaire {

    public static void main(String[] args) {
        try {

            ArbreBinaire.ajouterUnStagiaire(new Stagiaire("Hurlin", "Nathalie", "05", "CDA 21", 2022), GestionFichiers.getRaf());
            ArbreBinaire.ajouterUnStagiaire(new Stagiaire("Lacroix", "Charles", "23", "AL10", 2018), GestionFichiers.getRaf());
            ArbreBinaire.ajouterUnStagiaire(new Stagiaire("Boucher", "Caroline", "19", "BOBI 4", 2016), GestionFichiers.getRaf());
            ArbreBinaire.ajouterUnStagiaire(new Stagiaire("Bernaudon", "Jean-Marc", "76", "ARD 4", 2015), GestionFichiers.getRaf());
            ArbreBinaire.ajouterUnStagiaire(new Stagiaire("Pasquali", "Séverine", "56", "GHI 12", 2017), GestionFichiers.getRaf());
            ArbreBinaire.ajouterUnStagiaire(new Stagiaire("Lacroix", "Antoine", "23", "BOBI 14", 2010), GestionFichiers.getRaf());
            ArbreBinaire.ajouterUnStagiaire(new Stagiaire("Crocq", "Camille", "01", "BOBI 12", 2017), GestionFichiers.getRaf());
            ArbreBinaire.ajouterUnStagiaire(new Stagiaire("Rulof", "Mélanie", "13", "ARD 12", 2017), GestionFichiers.getRaf());
            ArbreBinaire.ajouterUnStagiaire(new Stagiaire("Lalonde", "Tiphaine", "75", "CDA 21", 2017), GestionFichiers.getRaf());
            ArbreBinaire.ajouterUnStagiaire(new Stagiaire("Vallin", "Jerome", "67", "GHI 12", 2017), GestionFichiers.getRaf());
            ArbreBinaire.ajouterUnStagiaire(new Stagiaire("Lacroix", "Edgard", "18", "ARD 8", 2013), GestionFichiers.getRaf());
            ArbreBinaire.ajouterUnStagiaire(new Stagiaire("Rouget", "Dara", "46", "BOBI 3", 2008), GestionFichiers.getRaf());
            ArbreBinaire.ajouterUnStagiaire(new Stagiaire("Touch", "Antoine", "09", "AI 56", 2010), GestionFichiers.getRaf());
            ArbreBinaire.ajouterUnStagiaire(new Stagiaire("Ragout", "Emma", "41", "CDA 3", 2008), GestionFichiers.getRaf());

            GestionFichiers.getRaf().seek(0);
            for (int i = 0; i < (GestionFichiers.getRaf().length() / Noeud.TAILLE_NOEUD_OCTETS); i++) {
                System.out.println(GestionFichiers.lectureNoeud());
            }


            /*GestionFichiers.getRaf().seek(0);
            Noeud racine = GestionFichiers.lectureNoeud();
            System.out.println(new Stagiaire("Hurlin", "Nathalie", "05", "CDA 21", 2022).compareTo(racine.getStagiaire()));*/


            GestionFichiers.fermetureAccessFile();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
