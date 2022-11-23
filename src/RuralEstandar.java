import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RuralEstandar extends Rural{

    private String[] vuelo = new String[]{"Charter","Privado","Comercial"};
    private String[] boleto = new String[]{"Ejecutivo","Comercial"};
    private double costoBoleto, impuestoBoleto;
    private int tipoVuelo, tipoBoleto;
    RuralEstandar(){
        interfazEach();
    }
    private JFrame frame;
    private JComboBox vueloTipo;
    private JComboBox boletoTipo;
    private JTextField boletoCosto;
    @Override
    public void datosExtras() {
        // Tipo vuelo *square*
        vueloTipo = new JComboBox<>(vuelo);
        vueloTipo.setBounds(300,150,100,50);
        // Tipo boleto *square*
        boletoTipo = new JComboBox<>(boleto);
        boletoTipo.setBounds(150,150,100,50);
        // Costo boleto text
        boletoCosto = new JTextField("Costo boleto");
        boletoCosto.setBounds(50,10,115,40);
        boletoCosto.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                boletoCosto.setText("");
            }
        });
        // impuesto boleto
        // crear un total

        frame.add(vueloTipo);
        frame.add(boletoTipo);
        frame.add(boletoCosto);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    @Override
    public String datosExtrasRes() {
        return null;
    }

    @Override
    public void interfazEach() {
        frame = new JFrame();
        frame.setTitle("REDATUR");
        frame.getContentPane().setBackground((new Color(12,59,46)));
        ImageIcon logoReda = new ImageIcon("redaturApp.png");
        frame.setIconImage(logoReda.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(460,460);
        datosExtras();
        frame.setResizable(true);
        frame.setVisible(true);
    }
}
