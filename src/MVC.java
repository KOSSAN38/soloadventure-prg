import java.awt.*;

public class MVC {

    GUI gui;

    public MVC(GUI gui) {

        this.gui = gui;

    }

    public void newFile() {

        gui.textArea.setText("");
        gui.window.setTitle("New");

    }
}
