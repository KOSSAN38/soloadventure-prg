import javax.swing.*;
import java.awt.event.ActionListener;


/**
 * Här görs fönstret där allt visas.
 */
public class GUI {

    private JTextField author;
    private JPanel panel;
    JFrame window;
    JTextArea textArea;
    JButton button;
    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenuItem iNew;

    MVC file = new MVC(this);

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
        createWindow();
        createbutton();
        createmenuBar();
        createFileMenu();
        this.window.setVisible(true);
    }

    /**
     * Fösntret där allt visas.
     */
    public void createWindow() {
        this.window = new JFrame("SOLOADVÄNTYR");
        this.window.setSize(1000, 800);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.panel = new JPanel();
        this.window.add(panel);
    }

    public void createbutton() {
        this.button = new JButton("hejsan");
        this.button.setSize(100, 50);



    }

    public void createmenuBar() {
        this.menuBar = new JMenuBar();
        this.window.setJMenuBar(menuBar);

        this.menuFile = new JMenu("File");
        this.menuBar.add(menuFile);

    }

    public void createFileMenu() {

        this.iNew = new JMenuItem("Edit");
        this.menuFile.add(iNew);


    }
}

