import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
/**class java */
public class HelloWorld {
    public static void main(String[] args) {
        // Utilisation des constantes définies dans Constants.java
        String title = Constants.HELLO_WORLD_TITLE;
        String text = Constants.HELLO_WORLD_TEXT;

        // Création de la fenêtre
        JFrame fenetre = new JFrame(title);
        fenetre.setSize(new Dimension(800, 400));
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.getContentPane().setBackground(Color.green);


        // Création du label de texte
        JLabel label = new JLabel(text);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setForeground(Color.BLACK);

        // Création d'un conteneur pour le contenu aligné à gauche
        JPanel contenu = new JPanel();
        contenu.setLayout((LayoutManager) new FlowLayout(FlowLayout.LEFT)); // Alignement à gauche

        fenetre.add(label);
        fenetre.setVisible(true);
    }
    

}
