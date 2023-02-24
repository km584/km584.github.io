import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*; //add this for the listener
import java.util.Random;
/**
* Assignment 9: Pokemon GUI - the Panel.
* @author Kairi Tanaka & Jamie Laurin
* @since 12/03/2021
*/
public class PokemonPanel extends JPanel {

/********** Top Section Instance Variables *************/

   /******* button. ****************/
   private JButton bHunt = new JButton(" Hunt ");
   /******* button. ****************/
   private JButton bCatch = new JButton(" Catch ");
 
   
   /****** text are for displaying Pokemon. *******/
   private JTextField tfPokemon = new JTextField(25);
   /****** text are for displaying Pokemon. *******/
   private JTextArea textArea = new JTextArea(14, 15);
   /****** text are for displaying Pokemon. *******/
   private JTextArea textArea2 = new JTextArea(2, 15);
   /** Make TextArea scrollable. **********************/
   private JScrollPane tScroll = new JScrollPane(textArea,
                        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
   /** Make TextArea scrollable. **********************/
   private JScrollPane tScroll2 = new JScrollPane(textArea2,
                        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);                     
  
  
 /********* Bottom Section Instance Variables ************/
   
   /******* button. ****************/
   private JButton bPokedex = new JButton(" Pokedex ");
   /******* button. ****************/
   private JButton bBackpack = new JButton(" Backpack ");
   /******* pop up button. *********/
   private JButton bRecent = new JButton(" Recent ");
   /******* pop up button. *********/
   private JButton bNumber = new JButton(" Number ");
 
  /********** Choice drop down menu for Pokemon Ordering. **/
   private Choice chOrdering = new Choice();
  
   /****** text are for displaying Pokemon. *******/
   private JTextArea btextArea = new JTextArea(15, 15);
   /** Make TextArea scrollable. **********************/
   private JScrollPane botScroll = new JScrollPane(btextArea,
                        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
   
 /******** Pokemon Instance Variables **************/
  
   /******** Pokemon. *********/
   private Pokemon p = new Bulbasaur();
   /******** Pokemon tree. *********/
   private PokeTree pokeTree = new PokeTree();
   /******** Pokemon Queue. *********/   
   private PriorityQueue<Pokemon> pq = new PriorityQueue<>();
   /******** Pokemon Stack. *********/
   private Deque<Pokemon> stack = new ArrayDeque<>();


   /********* sub-panel. *********/
   private JPanel topSubPanel = new JPanel();
   /********* sub-panel. *********/
   private JPanel centerSubPanel = new JPanel();
   /********* sub-panel. *********/
   private JPanel bottomSubPanel = new JPanel();
 
   /** we can declare and initialize ActionListener obj. */
   private GUIListener listener = new GUIListener();
   
   /** Constructor. */
   public PokemonPanel() {
   
      GridLayout gl = new GridLayout(1, 2);
      this.setLayout(new BorderLayout()); //Border panel layout
      this.setPreferredSize(new Dimension(400, 700));
      
      topSubPanel.setBackground(Color.orange); //north area color
      topSubPanel.setPreferredSize(new Dimension(400, 300));
      
      centerSubPanel.setBackground(Color.lightGray); //center area color
      centerSubPanel.setPreferredSize(new Dimension(500, 30));
      
      bottomSubPanel.setBackground(Color.gray); //south area color
      bottomSubPanel.setPreferredSize(new Dimension(500, 100));
      bottomSubPanel.setLayout(gl);
 
      //top panel 
      topSubPanel.setBorder((BorderFactory.createTitledBorder("Catch a Pokemon!")));
      
      textArea2.setBackground(Color.white); //set up text area 
      textArea2.setBorder(BorderFactory.createLineBorder(Color.black));
      textArea2.setEditable(false);
      topSubPanel.add(tScroll2); //add scroll bar in text area 
      tScroll2.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));

      textArea.setBackground(Color.white); //set up text area 
      textArea.setBorder(BorderFactory.createLineBorder(Color.black));
      textArea.setEditable(false);
      topSubPanel.add(tScroll); //add scroll bar in text area 
      tScroll.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0)); 
               
      topSubPanel.add(bHunt); //add hunt button
      bHunt.addActionListener(listener);
      topSubPanel.add(bCatch); //add catch buttton
      bCatch.addActionListener(listener); 
      
      this.add("North", topSubPanel);
      
      //center panel
      centerSubPanel.setBorder((BorderFactory.createTitledBorder("Your Pokemon!")));      
      btextArea.setBackground(Color.white); //set up text area 
      btextArea.setBorder(BorderFactory.createLineBorder(Color.black));
      btextArea.setEditable(false);
      centerSubPanel.add(botScroll); //add scroll bar in text area 
      botScroll.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));

      add("Center", centerSubPanel);
      
      //bottom panel
      bottomSubPanel.setBorder((BorderFactory.createTitledBorder("Select one to see your Pokemon!")));
      bottomSubPanel.add(bPokedex); //add pokedex button
      bPokedex.addActionListener(listener);
      
      bottomSubPanel.add(bBackpack); //add backpack button
      bBackpack.addActionListener(listener);
      
      bottomSubPanel.add(chOrdering);
      bBackpack.addActionListener(listener);
      chOrdering.add("Number");
      bNumber.addActionListener(listener);
      chOrdering.add("Recent");
      bRecent.addActionListener(listener);
      
      add("South", bottomSubPanel);
   }
   
   /** Private ActionListener class. */
   private class GUIListener implements ActionListener {
      
      /** random number generated. */
      private int num = 0;
      /** random pokemon. */
      private Pokemon pTemp;
     
     /** 
      * Action Performed method.
      * @param event button clicked by user. 
      */
      public void actionPerformed(ActionEvent event) {
        
         String poke = "";
         Random ranGen = new Random();
          
         //if "Hunt" button is selected 
         if (event.getSource() == bHunt) {
            int index = ranGen.nextInt(9) + 1;
            switch (index) {                  
               case 1:
                  poke = "Bulbasaur ";
                  num = 1;
                  break;
               case 2:
                  poke = "Ivysaur ";
                  num = 2;
                  break;
               case 3:
                  poke = "Venusaur ";
                  num = 3;
                  break;
               case 4:
                  poke = "Charmander ";
                  num = 4;
                  break;
               case 5:
                  poke = "Charmeleon ";
                  num = 5;
                  break;            
               case 6:
                  poke = "Charizard ";
                  num = 6;
                  break;
               case 7:
                  poke = "Squirtle ";
                  num = 7;
                  break;
               case 8:
                  poke = "Wartortle ";
                  num = 8;
                  break;
               case 9:
                  poke = "Blastoise ";
                  num = 9;
                  break;
               default:
                  System.out.println("Invalid input");
                  break;
            }
            //displays a random Pokemon which appears
            textArea2.setText("A wild " + poke + "appeared!");
         }
         
         //if "Catch" button is selected 
         if (event.getSource() == bCatch) {
            Random randGen = new Random();
            int ranCatch = randGen.nextInt(2);
            String msgCatch = "";
            String pInfo = "";
         
            switch (num) {
               case 1:
                  poke = "Bulbasaur";
                  pTemp = new Bulbasaur();
                  pInfo = pTemp.toString();
                  break;
               case 2:
                  poke = "Ivysaur";
                  pTemp = new Ivysaur();
                  pInfo = pTemp.toString();
                  break;
               case 3:
                  poke = "Venusaur";
                  pTemp = new Venusaur();
                  pInfo = pTemp.toString();
                  break;
               case 4:
                  poke = "Charmander";
                  pTemp = new Charmander();
                  pInfo = pTemp.toString();
                  break;
               case 5:
                  poke = "Charmeleon";
                  pTemp = new Charmeleon();
                  pInfo = pTemp.toString();
                  break;
               case 6:
                  poke = "Charizard";
                  pTemp = new Charizard();
                  pInfo = pTemp.toString();
                  break;
               case 7:
                  poke = "Squirtle";
                  pTemp = new Squirtle();
                  pInfo = pTemp.toString();
                  break;
               case 8:
                  poke = "Wartortle";
                  pTemp = new Wartortle();
               case 9:
                  poke = "Blastoise";
                  pTemp = new Blastoise();
                  pInfo = pTemp.toString();
                  break;
               default:
                  System.out.println("Invalid input");
                  break;
            }
           
            //randomly decides whether or not Pokemon is caught 
            switch (ranCatch) {
               case 0:
                  msgCatch = poke + " Escaped!";
                  textArea.setText("Keep Hunting!");
                  textArea2.setText(msgCatch);
                  break;
               case 1:
                  msgCatch = "You Caught " + poke + "!";
                  textArea.setText(pInfo);
                 //displays Pokemon Caught 
                  textArea2.setText(msgCatch);
                 //adds Pokemon to each list
                  pokeTree.add(pTemp);
                  pq.add(pTemp);
                  stack.push(pTemp);
                  break;
               default:
                  System.out.println("Invalid input");
                  break;
            }
         }
         
         //if "Pokedex" button is selected 
         if (event.getSource() == bPokedex) {
            String printTree = pokeTree.printPokemonTree();
            btextArea.setText(printTree + "\n");
         }
         
         //if "Backpack" button is selected 
         if (event.getSource() == bBackpack) {
            String sSort = chOrdering.getSelectedItem();
            String sNumber = "";
            String sRecent = "";
               
            if (sSort == "Number") { //sorted by Pokedex number
                            
               while (pq.size() > 0) {
                  Pokemon curr = pq.poll();
                  sNumber = sNumber + curr.toString() + "\n\n";
                  btextArea.setText(sNumber);
               }
            }
            
            else if (sSort == "Recent") { //sorted by most recently caught 
     
               while (!stack.isEmpty()) {                    
                  Pokemon curr = stack.pop();
                  sRecent = sRecent + curr.toString() + "\n\n";                 
                  btextArea.setText(sRecent);
               }
            }
         }
   
      } //closes actionPerformed method  
    
   } //closes GUI Listener
   
} //closes Panel Class