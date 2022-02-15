import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            if(lightX==initialTx){
                //North
                if(lightY < initialTy){
                    System.out.println("N");
                }
                //South
                 if(lightY > initialTy){
                    System.out.println("S");
                }
            }  else if(lightY==initialTy){
                //West
                if(lightX < initialTx){
                    System.out.println("W");
                }
                //East
                 if(lightX > initialTx){
                    System.out.println("E");
                }
            } else if (lightX < initialTx && lightY < initialTy
            && initialTx < 40 && initialTy < 18) {
                //North West
                System.out.println("NW");
            } else if (lightX < initialTx && lightY > initialTy
            && initialTx < 40 && initialTy < 18) {
                //South West
                System.out.println("SW");
            } else if (lightX > initialTx && lightY < initialTy
            && initialTx < 40 && initialTy < 18) {
                //North East
                System.out.println("NE");
            } else if (lightX > initialTx && lightY > initialTy
            && initialTx < 40 && initialTy < 18) {
                //South East
                System.out.println("SE");
            } else {
                break;
            }


            // A single line providing the move to be made: N NE E SE S SW W or NW
            // System.out.println("SE");
        }
    }
}