import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        boolean start = true;

        while (start){
            String tOrF = JOptionPane.showInputDialog("Is the course code for our class ICS4U? [T] or [F]:\n");
            if (tOrF.equals("T")){
                start = false;
                JOptionPane.showMessageDialog(null, "Yes! The couse code is ICS4U!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Try again!");
            }


        }

    

    }
}