package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    private JTextField txtNombre;
    private JComboBox<String> cbbCalificacion;
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        setLayout(new GridLayout(3, 2));

        // Campo para el nombre
        add(new JLabel("Nombre: "));
        txtNombre = new JTextField();
        add(txtNombre);

        // Selector para calificación
        add(new JLabel("Calificación (1-5): "));
        cbbCalificacion = new JComboBox<>(new String[] {"1", "2", "3", "4", "5"});
        add(cbbCalificacion);

        // Selector para visitado
        add(new JLabel("Visitado: "));
        cbbVisitado = new JComboBox<>(new String[] {"Sí", "No"});
        add(cbbVisitado);
    }

    public boolean getVisitado( )
    {
        return cbbVisitado.getSelectedItem().equals("Sí");
    }

    public int getCalificacion( )
    {
        String calif = (String) cbbCalificacion.getSelectedItem();
        return Integer.parseInt(calif);
    }

    public String getNombre( )
    {
        return txtNombre.getText();
    }
}

