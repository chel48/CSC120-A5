/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Boot {
  
  /** direction of the boot */
  private String direction;

  /* Constructor of the boot using inputted direction */
  public Boot(String direction) {
      this.direction = direction.toLowerCase();
  }

  /**
   * Displays the boot depending on inputted direction
   */
  public void display() {
      if (this.direction.equals("left")) {
        System.out.print("     (________|");
      } else if (this.direction.equals("right")) {
        System.out.println("|________)");
      } else {
        System.out.println("Which boot?");
      }
  }

  /* main method (for testing) */
  public static void main(String[] args) {
      Boot myLeftBoot = new Boot("left");
      Boot myRightBoot = new Boot("right");
      myLeftBoot.display();
      myRightBoot.display();
  }
}
