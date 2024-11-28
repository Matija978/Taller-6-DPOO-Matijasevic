package uniandes.dpoo.swing.interfaz.principal;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBotones extends JPanel implements ActionListener
{
    private static final String NUEVO = "nuevo";
    private static final String VER = "ver";

    private JButton butNuevo;
    private JButton butVerTodos;
    private VentanaPrincipal ventanaPrincipal;

    public PanelBotones( VentanaPrincipal ventanaPrincipal )
    {
        this.ventanaPrincipal = ventanaPrincipal;

        setLayout(new FlowLayout());

        // Botón para crear un nuevo restaurante
        butNuevo = new JButton("Nuevo Restaurante");
        butNuevo.setActionCommand(NUEVO);
        butNuevo.addActionListener(this);
        add(butNuevo);

        // Botón para ver todos los restaurantes
        butVerTodos = new JButton("Ver Todos");
        butVerTodos.setActionCommand(VER);
        butVerTodos.addActionListener(this);
        add(butVerTodos);
    }

    @Override
    public void actionPerformed( ActionEvent e )
    {
        String comando = e.getActionCommand();
        if (comando.equals(NUEVO))
        {
            ventanaPrincipal.mostrarVetanaNuevoRestaurante();
        }
        else if (comando.equals(VER))
        {
            ventanaPrincipal.mostrarVentanaMapa();
        }
    }
}
