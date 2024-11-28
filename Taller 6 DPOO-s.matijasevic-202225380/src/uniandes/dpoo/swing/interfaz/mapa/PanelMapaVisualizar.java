package uniandes.dpoo.swing.interfaz.mapa;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import uniandes.dpoo.swing.mundo.Restaurante;

@SuppressWarnings("serial")
public class PanelMapaVisualizar extends JPanel
{
    private JLabel labMapa;
    private List<Restaurante> restaurantes;

    public PanelMapaVisualizar( )
    {
        setLayout(null);
        this.labMapa = new JLabel(new ImageIcon("./imagenes/mapa.png"));
        labMapa.setBorder(new LineBorder(Color.DARK_GRAY));
        add(labMapa);
    }

    @Override
    public void paint( Graphics g )
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        if (restaurantes != null)
        {
            for (Restaurante r : restaurantes)
            {
                g2d.setColor(r.isVisitado() ? Color.GREEN : Color.RED);
                g2d.fillOval(r.getX() - 5, r.getY() - 5, 10, 10);
                g2d.drawString(r.getNombre(), r.getX() + 10, r.getY());
            }
        }
    }

    public void actualizarMapa(List<Restaurante> nuevosRestaurantes)
    {
        this.restaurantes = nuevosRestaurantes;
        repaint();
    }
}
