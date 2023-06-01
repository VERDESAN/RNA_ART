
package rna_art_app;

/**
 *
 * @author verdeHK
 */
public class RNA_ART_APP {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PATRON().setVisible(true);
            }
        });
    }
}
