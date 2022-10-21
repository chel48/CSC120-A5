/*
 * Shirt class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Shirt {

    /*
     * Displays shirt made out of ascii characters
     */
    public void display() {
        //System.out.println("Shirt?");
        System.out.println("    ...*''--....--''*...");
        System.out.println("  /                      \\");
        System.out.println(" |   |                |   |");
        System.out.println(" |___|                |___| ");
        System.out.println("     |                |");
        System.out.println("     |                |");
        System.out.println("     |                |  ");
        System.out.println("     |                |");
        System.out.println("     ''*-.,______,.-*''  "); 
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}
