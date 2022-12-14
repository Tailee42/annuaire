package fr.isika.cda21.annuaire.tests;

import com.itextpdf.text.DocumentException;

import fr.isika.cda21.annuaire.models.ArbreBinaire;
import fr.isika.cda21.annuaire.models.ImpressionPDF;
import fr.isika.cda21.annuaire.models.Stagiaire;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestLibrairiePDF {

    public static void main(String[] args) {
        try {
            ArbreBinaire arbre = new ArbreBinaire("src/main/resources/ecriturearbrebinaire.bin");

            List<Stagiaire> listeRecherche = new ArrayList<>();
            Stagiaire criteresRecherche = new Stagiaire(null, null,"75","",0 );
            arbre.dbtRechAv(listeRecherche, criteresRecherche);

            ImpressionPDF pdf = new ImpressionPDF();

            pdf.createPDF(listeRecherche);

        } catch (IOException | DocumentException e) {
            throw new RuntimeException(e);
        }
    }

}