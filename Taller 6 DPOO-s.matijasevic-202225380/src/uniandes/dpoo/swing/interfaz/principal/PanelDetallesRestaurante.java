package uniandes.dpoo.swing.interfaz.principal;


import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import uniandes.dpoo.swing.mundo.Restaurante;

@SuppressWarnings("serial")
public class PanelDetallesRestaurante extends JPanel
{
    private JLabel labNombre;
    private JLabel labCalificacion;
    private JCheckBox chkVisitado;

    public PanelDetallesRestaurante( )
    {
        setLayout(new GridLayout(3, 2));

        // Nombre del restaurante
        add(new JLabel("Nombre: "));
        labNombre = new JLabel();
        add(labNombre);

        // Calificación del restaurante
        add(new JLabel("Calificación: "));
        labCalificacion = new JLabel();
        add(labCalificacion);

        // Visitado o no
        add(new JLabel("Visitado: "));
        chkVisitado = new JCheckBox();
        chkVisitado.setEnabled(false); // Sólo mostrar, no editar
        add(chkVisitado);
    }

    private void actualizarRestaurante( String nombre, int calificacion, boolean visitado )
    {
        labNombre.setText(nombre);
        labCalificacion.setIcon(buscarIconoCalificacion(calificacion));
        chkVisitado.setSelected(visitado);
    }

    public void actualizarRestaurante( Restaurante r )
    {
        this.actualizarRestaurante(r.getNombre(), r.getCalificacion(), r.isVisitado());
    }

    private ImageIcon buscarIconoCalificacion( int calificacion )
    {
        String imagen = "./imagenes/stars" + calificacion + ".png";
        return new ImageIcon(imagen);
    }
}
