import javax.swing.JFrame;
/**
* Assignment 9: Pokemon GUI - the Frame.
* @author Kairi Tanaka & Jamie Laurin
* @since 12/03/2021
*/
public class PokemonFrame {
  /** main method.
   * @param args not used
   */
   public static void main(String[] args) {
      // basic JFrame setup
      JFrame frm = new JFrame("Pokemon Go");
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
      // contents here 
      frm.getContentPane().add(new PokemonPanel());
   
      // displays to screen
      frm.pack();
      frm.setVisible(true);
    
   }
}
