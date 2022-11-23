import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterfazPrincipal implements ActionListener{
    InterfazPrincipal(){
        frame();
    }
    JFrame frame;
    JButton ingresar;
    JButton mostrar;
    JButton buscar;
    JButton eliminar;
    JLabel label;
    //Border border;

    protected void frame(){
        label = new JLabel();
         frame = new JFrame();
         Border border = BorderFactory.createLineBorder(new Color(0,0,0));
         //label
        //label.setBackground(new Color(109,151,115));
        ImageIcon logoReda = new ImageIcon("redaturApp.png");
        ImageIcon logoFrame = new ImageIcon("redaturINFrame.png");
        label.setIcon(logoFrame);
        label.setBounds(26, 0, 500,170);
        //label.setVerticalAlignment(JLabel.CENTER);
        //label.setHorizontalAlignment(JLabel.CENTER);
        //label.setText("Hola");
        //label.setOpaque(true);

         ingresar = new JButton();
         mostrar = new JButton();
         buscar = new JButton();
         eliminar = new JButton();
        //JButton salir = new JButton();

        ingresar.setBounds(230, 160, 170, 60);
        ingresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ingresar.setBackground(new Color(230,229,163));
                ingresar.setBorder(BorderFactory.createLineBorder(new Color(154,129,0),3));
            }
        });
        ingresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                ingresar.setBackground(new Color(109,151,115));
                ingresar.setBorder(BorderFactory.createLineBorder(Color.GRAY,1));
            }
        });
        mostrar.setBounds(230, 260, 170, 60);
        mostrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mostrar.setBackground(new Color(230,229,163));
                mostrar.setBorder(BorderFactory.createLineBorder(new Color(154,129,0),3));
            }
        });
        mostrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                mostrar.setBackground(new Color(109,151,115));
                mostrar.setBorder(BorderFactory.createLineBorder(Color.GRAY,1));
            }
        });
        buscar.setBounds(230, 360, 170, 60);
        buscar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                buscar.setBackground(new Color(230,229,163));
                buscar.setBorder(BorderFactory.createLineBorder(new Color(154,129,0),3));
            }
        });
        buscar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                buscar.setBackground(new Color(109,151,115));
                buscar.setBorder(BorderFactory.createLineBorder(Color.GRAY,1));
            }
        });
        eliminar.setBounds(230, 460, 170, 60);
        eliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                eliminar.setBackground(new Color(230,229,163));
                eliminar.setBorder(BorderFactory.createLineBorder(new Color(154,129,0),3));
            }
        });
        eliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                eliminar.setBackground(new Color(109,151,115));
                eliminar.setBorder(BorderFactory.createLineBorder(Color.GRAY,1));
            }
        });
        //salir.setBounds(230, 480, 170, 60);


        ingresar.setFocusable(false);
        ingresar.addActionListener(this);
        mostrar.setFocusable(false);
        buscar.setFocusable(false);
        eliminar.setFocusable(false);
        eliminar.addActionListener(this);
        //salir.setFocusable(false);

        ingresar.setText("Ingresar datos");
        ingresar.setBackground(new Color(109,151,115));
        ingresar.setBorder(border);
        mostrar.setText("Mostrar datos");
        mostrar.setBackground(new Color(109,151,115));
        mostrar.setBorder(border);
        eliminar.setText("Eliminar cliente");
        eliminar.setBackground(new Color(109,151,115));
        eliminar.setBorder(border);
        buscar.setText("Buscar cliente");
        buscar.setBackground(new Color(109,151,115));
        buscar.setBorder(border);
        //salir.setText("Salir del programa");

        frame.setIconImage(logoReda.getImage());
        frame.add(ingresar);
        frame.add(label);
        frame.add(mostrar);
        frame.add(eliminar);
        frame.add(buscar);

        frame.setTitle("REDATUR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground((new Color(12,59,46)));
        frame.setLayout(null);
        frame.setSize(640,640);
        frame.setResizable(false);

        //frame.add(salir);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ingresar){
            frame.dispose();
            RuralEconomico e1 = new RuralEconomico();
            e1.eleccionIntefaz();
        }
        if (e.getSource() == eliminar){
            frame.dispose();
            EliminarCliente eC = new EliminarCliente();
        }
    }
}
