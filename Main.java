import javax.swing.*;

public class Main {

  public static void main(String args[]) {

    JFrame frame = new Grid();
    frame.setTitle("Notepad");
    frame.setVisible(true);
    frame.setSize(1280, 720);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setResizable(true);
    frame.setLocationRelativeTo(null);
  }
}