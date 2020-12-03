package Practice10;
import javax.swing.*;

public class FileMenuItem extends JMenuItem {
    public FileMenuItem(MainFrame.supportedDocs doc, boolean isNew) {
        super(String.valueOf(doc));
        addActionListener(new OpenListener(doc, isNew));
    }
}
