import java.util.Scanner;

/**.
* Class for Pokedex driver
* @author Kairi Tanaka
* @since 11/25/21
*/

public class Pokedex {
   
   /**.
   * Pokedex Ask Pokemons to add and remove from tree
   * @param commandlineArguments are not used
   */
   
   public static void main(String[] commandlineArguments) {
      
      //variable sets
      Pokemon pTemp;
      PokeTree<Pokemon> tree = new PokeTree<>();
      Scanner userIn = new Scanner(System.in);
      String inString = "";
      boolean end = false;
      
      //while user not input 0 keep asking
      while (!end) {
         System.out.println("Please enter number");
         System.out.println("1: Add Pokemon\n" + "2: Release a Pokemon\n"
            + "3: Print Pokedex\n" + "0: End Pokedex");
         inString = userIn.nextLine();
         inString = inString.trim();
         
         switch(inString) {
            case "0": 
               end = true;
               System.out.println("Goodbye");
               break;
            
            case "1":
               pTemp = Pokedex.addPokemon();
               tree.add(pTemp);
            
               break;
            
            case "2":
               pTemp = Pokedex.addPokemon();
               tree.remove(pTemp);
               break;
            
            case "3":
               System.out.println(tree.printPokeTree());
               break;
         
            default:
               System.out.println("Invalid input");
               break;
         }
      }
   }
   
   /**.
   * Add Pokemon user input and return Pokemon data
   *
   * @return Pokemon data user input
   */
   public static Pokemon addPokemon() {
      Scanner userInput = new Scanner(System.in);
      String userChoice = new String("");
      Pokemon p = null;
      Boolean endAdd = false;
      
      System.out.println("Choose a Pokemon to add:");
      System.out.println("1 for Bulbasaur\n" + "2 for Ivysaur\n" + "3 for Venusaur\n"
         + "4 for Charmander\n" + "5 for Charmeleon\n" + "6 for Charizard\n" + "7 for Squirtle\n"
         + "8 for Wartortle\n" + "9 for Blastoise\n" + "19 for Rattata\n" + "20 for Raticate\n"
         + "25 for Pikchu\n" + "26 for Raichu\n" + "37 for Vulpix\n" + "38 for Ninetails\n"
         + "133 for Eevee\n" + "134 for Vaporean\n"  + "135 for Jolteon\n" + "136 for Flareon\n" 
         + "147 for Dratini\n" + "148 for Dragonair\n" + "149 for Dragonite");
      
      while (!endAdd) {
      
         userChoice = userInput.nextLine();
         userChoice = userChoice.trim();
      
         switch(userChoice) {
            case "1":
               p = new Bulbasaur();
               endAdd = true;
               break;
         
            case "2":
               p = new Ivysaur();
               endAdd = true;
               break;
         
            case "3":
               p = new Venusaur();
               endAdd = true;
               break;
         
            case "4":
               p = new Charmander();
               endAdd = true;
               break;
         
            case "5":
               p = new Charmeleon();
               endAdd = true;
               break;
         
            case "6":
               p = new Charizard();
               endAdd = true;
               break;
         
            case "7":
               p = new Squirtle();
               endAdd = true;
               break;
         
            case "8":
               p = new Wartortle();
               endAdd = true;
               break;
         
            case "9":
               p = new Blastoise();
               endAdd = true;
               break;
            
            case "19":
               p = new Rattata();
               endAdd = true;
               break;
            
            case "20":
               p = new Raticate();
               endAdd = true;
               break;
            
            case "25":
               p = new Pikachu();
               endAdd = true;
               break;
            
            case "26":
               p = new Raichu();
               endAdd = true;
               break;
               
            case "37":
               p = new Vulpix();
               endAdd = true;
               break;
            
            case "38":
               p = new Ninetails();
               endAdd = true;
               break;
                     
            case "133":
               p = new Eevee();
               endAdd = true;
               break;
               
            case "134":
               p = new Vaporean();
               endAdd = true;
               break;
            
            case "135":
               p = new Jolteon();
               endAdd = true;
               break;
            
            case "136":
               p = new Flareon();
               endAdd = true;
               break;
            
            case "147":
               p = new Dratini();
               endAdd = true;
               break;
            
            case "148":
               p = new Dragonair();
               endAdd = true;
               break;
            
            case "149":
               p = new Dragonite();
               endAdd = true;
               break;
               
            default:
               System.out.println("Invalid input");
               break;
         }
      }
      return p;
   }
   
   /**.
   * Remove Pokemon user input and return Pokemon data
   *
   * @return Pokemon data input
   */
   public static Pokemon removePokemon() {
      Scanner userInput = new Scanner(System.in);
      String userChoice = new String("");
      Pokemon p = null;
      Boolean endAdd = false;
      
      System.out.println("Choose a Pokemon to release:");
      System.out.println("1 for Bulbasaur\n" + "2 for Ivysaur\n" + "3 for Venusaur\n"
         + "4 for Charmander\n" + "5 for Charmeleon\n" + "6 for Charizard\n" + "7 for Squirtle\n"
         + "8 for Wartortle\n" + "9 for Blastoise\n" + "19 for Rattata\n" + "20 for Raticate\n"
         + "25 for Pikchu\n" + "26 for Raichu\n" + "37 for Vulpix\n" + "38 for Ninetails\n"
         + "133 for Eevee\n" + "134 for Vaporean\n"  + "135 for Jolteon\n" + "136 for Flareon\n" 
         + "147 for Dratini\n" + "148 for Dragonair\n" + "149 for Dragonite");
      
      while (!endAdd) {
      
         userChoice = userInput.nextLine();
         userChoice = userChoice.trim();
      
         switch(userChoice) {
            case "1":
               p = new Bulbasaur();
               endAdd = true;
               break;
         
            case "2":
               p = new Ivysaur();
               endAdd = true;
               break;
         
            case "3":
               p = new Venusaur();
               endAdd = true;
               break;
         
            case "4":
               p = new Charmander();
               endAdd = true;
               break;
         
            case "5":
               p = new Charmeleon();
               endAdd = true;
               break;
         
            case "6":
               p = new Charizard();
               endAdd = true;
               break;
         
            case "7":
               p = new Squirtle();
               endAdd = true;
               break;
         
            case "8":
               p = new Wartortle();
               endAdd = true;
               break;
         
            case "9":
               p = new Blastoise();
               endAdd = true;
               break;
               
            case "19":
               p = new Rattata();
               endAdd = true;
               break;
            
            case "20":
               p = new Raticate();
               endAdd = true;
               break;
            
            case "25":
               p = new Pikachu();
               endAdd = true;
               break;
            
            case "26":
               p = new Raichu();
               endAdd = true;
               break;
            
            case "37":
               p = new Vulpix();
               endAdd = true;
               break;
            
            case "38":
               p = new Ninetails();
               endAdd = true;
               break;
               
            case "133":
               p = new Eevee();
               endAdd = true;
               break;
               
            case "134":
               p = new Vaporean();
               endAdd = true;
               break;
            
            case "135":
               p = new Jolteon();
               endAdd = true;
               break;
            
            case "136":
               p = new Flareon();
               endAdd = true;
               break;
            
            case "147":
               p = new Dratini();
               endAdd = true;
               break;
            
            case "148":
               p = new Dragonair();
               endAdd = true;
               break;
            
            case "149":
               p = new Dragonite();
               endAdd = true;
               break;
                  
            default:
               System.out.println("Invalid input");
               break;
         }
      }
      return p;
   }
}
