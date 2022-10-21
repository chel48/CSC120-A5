/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

class Scarecrow {

    /** pumpkin head drawn with ascii characters */
    private Pumpkin head;
    /** shirt drawn with ascii characters */
    private Shirt body;
    /** pants drawn with ascii characters */
    private Pants legs;
    /** boot drawn with ascii characters */
    private Boot leftFoot;
    /** other boot drawn with ascii characters */
    private Boot rightFoot;
    /** banner drawn with note in the middle */
    private Banner sign;

    /** Constructor for a scarecrow made out of ascii characters
     * @param Pumpkin pumpkin class
     * @param Shirt shirt class
     * @param Pants pants class
     * @param Boot boot class
     * @param Banner banner class
     */
    public Scarecrow(Pumpkin h, Shirt s, Pants p, Boot bl, Boot br, Banner b) {
        this.head = h;
        this.body = s;
        this.legs = p;
        this.leftFoot = bl;
        this.rightFoot = br;
        this.sign = b;
    }

    /** Displays each part of the scarecrow
    */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
        
    }

    /* Main method (for testing) */
    public static void main(String[] args) {

        String message = "Happy Fall!";
        if (args.length > 0) {
            message = args[0];
        }

         Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(),  
         new Boot("left"), new Boot("right"), new Banner(message));

        myScarecrow.display();
    }

}