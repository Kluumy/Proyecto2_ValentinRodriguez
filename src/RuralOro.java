import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RuralOro extends RuralEstandar{
    private String nombreAgencia, direccionAgencia;
    private int placa, diasRentar,tipoVehiculo, tipoCombustible;
    private double kilometraje, costoDia, costoTotal, impuestoCombustible;
    private String vehiculos[] = new String[]{"Sencillo","Doble","Pick up","Familiar"};
    private String combustible[] = new String[]{"Gasolina","Diésel","Híbrido"};
    JFrame frame;
    RuralOro(){
        //interfazEach();
        interfazOro();
    }
    JTextField agencyName;
    JTextField agencyLocation;
    JComboBox vehicleType;
    JTextField placaVehiculo;
    JTextField kilometrajeVehi;
    JTextField diasRenta;
    JTextField costoXDia;
    JComboBox combustibleTipo;
    public void rentACar(){
        // nombre agencia text
        agencyName = new JTextField("Nombre agencia");
        agencyName.setBounds(50,10,115,40);
        agencyName.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                agencyName.setText("");
            }
        });
        // direccion agencia text
        agencyLocation = new JTextField("Nombre agencia");
        agencyLocation.setBounds(180,10,115,40);
        agencyLocation.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                agencyLocation.setText("");
            }
        });
        // tipo vehiculo square
        vehicleType = new JComboBox<>(vehiculos);
        vehicleType.setBounds(300,150,100,50);
        //placa text
        placaVehiculo = new JTextField("Nombre agencia");
        placaVehiculo.setBounds(90,120,115,40);
        placaVehiculo.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                placaVehiculo.setText("");
            }
        });
        // kilometraje text
        kilometrajeVehi = new JTextField("Kilometraje");
        kilometrajeVehi.setBounds(1,120,115,40);
        kilometrajeVehi.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                kilometrajeVehi.setText("");
            }
        });
        // dias renta (text)
        diasRenta = new JTextField("Dias renta");
        diasRenta.setBounds(200,200,115,40);
        diasRenta.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                diasRenta.setText("");
            }
        });
        // costo por dia text
        costoXDia = new JTextField("Costo por dia");
        costoXDia.setBounds(180,200,115,40);
        costoXDia.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                costoXDia.setText("");
            }
        });
        // tipo combustiblie square
        combustibleTipo = new JComboBox<>(combustible);
        combustibleTipo.setBounds(300,290,100,50);

        //interfazEach();

        frame.add(agencyName);
        frame.add(agencyLocation);
        frame.add(vehicleType);
        frame.add(placaVehiculo);
        frame.add(kilometrajeVehi);
        frame.add(diasRenta);
        frame.add(costoXDia);
        frame.add(combustibleTipo);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    //@Override
    public void interfazOro() {
        frame = new JFrame();
        frame.setTitle("REDATUR");
        frame.getContentPane().setBackground((new Color(12,59,46)));
        ImageIcon logoReda = new ImageIcon("redaturApp.png");
        frame.setIconImage(logoReda.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(460,460);
        rentACar();
        frame.setResizable(true);
        frame.setVisible(true);
    }

}
