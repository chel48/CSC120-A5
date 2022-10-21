/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* defines the message to be printed */
    private String message;

    /* Constructs the banner using the inputted message*/
    public Banner(String m) {
        this.message = m;
    }

    /**
     * Displays the banner with the message inside
     */
    public void display() {
        String dash = "-";
        System.out.println("---" + dash.repeat(this.message.length()) + "---");
        System.out.println("---" + dash.repeat(this.message.length()) + "---");
        System.out.print("|:|");
        System.out.print(this.message);
        System.out.println("|:|");
        System.out.println("---" + dash.repeat(this.message.length()) + "---");
        System.out.println("---" + dash.repeat(this.message.length()) + "---");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello World");
        myBanner.display();
    }
}

