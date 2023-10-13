import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;

public class HelloWorld {
    public static void main(String[] args) {
        // Utilisation des constantes définies dans Constants.java
        String title = Constants.HELLO_WORLD_TITLE;
        String text = Constants.HELLO_WORLD_TEXT;

        // Création de la fenêtre
        JFrame fenetre = new JFrame(title);
        fenetre.setSize(new Dimension(400, 500));
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création du label de texte
        JLabel label = new JLabel(text);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setForeground(Color.YELLOW);

        // Finalisation
        fenetre.add(label);
        fenetre.setVisible(true);
    }
}
