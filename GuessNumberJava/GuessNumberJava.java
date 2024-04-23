package GuessNumberJava;

import javax.swing.JOptionPane;
public class GuessNumberJava {
    public static void GuessNumberJava(String[] args) {
        boolean start = true; //boolean for while loop
        double num = Math.round(Math.random()*100); //creating a random number between 100 and 0
        while (start){ //while loop
            double guess = Double.parseDouble(JOptionPane.showInputDialog("What's your guess?")); //getting input
            if (guess == num){ //if your guess is correct
                JOptionPane.showMessageDialog(null, "You got it right! The number was "+num); //display answer
                start = false; //end loop
            } 
            else if (guess > num){ //if your guess was too high, tell the user and loop
                JOptionPane.showMessageDialog(null, "Guess lower!");
            }
            else if (guess < num){ //if your guess was too low, tell the user and loop
                JOptionPane.showMessageDialog(null, "Guess higher!");
            }
            }
        }
    }