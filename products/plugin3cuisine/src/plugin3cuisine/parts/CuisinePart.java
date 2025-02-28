package plugin3cuisine.parts;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import plugin1cuisine.Plugin1Dialog;
import plugin2cuisine.Plugin2Dialog;

public class CuisinePart {

    @PostConstruct
    public void createPartControl(Composite parent) {
        parent.setLayout(new GridLayout(1, false));

        // Bouton 1 : Afficher Plugin 1
        Button btn1 = new Button(parent, SWT.PUSH);
        btn1.setText("Afficher Plugin 1");
        btn1.addListener(SWT.Selection, e -> openPlugin1Dialog(parent.getShell()));

        // Bouton 2 : Afficher Plugin 2
        Button btn2 = new Button(parent, SWT.PUSH);
        btn2.setText("Afficher Plugin 2");
        btn2.addListener(SWT.Selection, e -> openPlugin2Dialog(parent.getShell()));
    }

    private void openPlugin1Dialog(Shell shell) {
        Plugin1Dialog dialog = new Plugin1Dialog(shell);
        dialog.open();
    }

    private void openPlugin2Dialog(Shell shell) {
        Plugin2Dialog dialog = new Plugin2Dialog(shell);
        dialog.open();
    }
}
