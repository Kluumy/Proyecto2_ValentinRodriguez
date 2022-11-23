import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RuralEconomico extends Rural implements ActionListener {
    private String nombreChofer;
    private int placa, categoriaUnidad, tipoMicro, ejes, asientos, vueltas, vueltas2 = 0;
    int vueltas3 = 0;
    private double valorUnidad;
    private String[] categoriaUni = new String[]{"Buseta","Microbús","Station"};
    private String[] tiposMicro = new String[]{"Furgoneta","Familiar"};

    JFrame frame;

    RuralEconomico() {
        //Cliente c1 = new Cliente();
        //ruralInterfaz();
        //interfazEach();
    }


    JComboBox tipoUnidad;
    JTextField placaTierra;
    JTextField choferNombre;

    @Override
    public void datosExtras() {
        // tipo unidad brum burm . . .
        tipoUnidad = new JComboBox<>(categoriaUni);
        tipoUnidad.setBounds(300,150,100,50);
        tipoUnidad.addActionListener(this);
        //categoriaUnidad = Integer.parseInt(categoriaUni[tipoUnidad.getSelectedIndex()]);
            // si la categoria es microbus preguntar si el tipo es furgoneta o familiar *CHECK*

                // si es una furgoneta preguntar el numero de ejes, si es familiar preguntar el numero de asientos *CHECK*
        // placa text
        placaTierra = new JTextField("Placa");
        placaTierra.setBounds(140,10,115,40);
        placaTierra.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                placaTierra.setText("");
            }
        });
        choferNombre = new JTextField("Nombre chofer");
        choferNombre.setBounds(350,10,115,40);
        choferNombre.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                choferNombre.setText("");
            }
        });
        // nombre chofer text
        // precio de cada uno de los cosos
        frame.add(placaTierra);
        frame.add(choferNombre);
        frame.add(tipoUnidad);
        //frame.add();
        //frame.setVisible(true);
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
        //frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(460,460);
        datosExtras();
        frame.setResizable(true);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    JRadioButton furgo;
    JRadioButton familiar;
    //JTextField nEjes;
    JTextField nExtra;
    JComboBox box;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == tipoUnidad) {
            if ((tipoUnidad.getSelectedIndex() != 1) && (box != null)) {
                frame.remove(box);
                frame.remove(nExtra);
                frame.setVisible(true);
            }
            if (tipoUnidad.getSelectedIndex() == 0) {
                valorUnidad = 12000;
            }
            if (tipoUnidad.getSelectedIndex() == 1) {

                box = new JComboBox<>(tiposMicro);
                box.setBounds(20, 140, 100, 50);
                frame.add(box);



            }
            if (tipoUnidad.getSelectedIndex() == 2) {
                valorUnidad = 30000;
            }
            vueltas++;
        }
        if (box != null){
            box.addActionListener(this);
            if (e.getSource() == box){
                if (box.getSelectedIndex() == 0){
                    if (vueltas2 == 0 && vueltas3 == 0) {
                        nExtra = new JTextField("Numero de ejes");
                    }
                    nExtra.setText("Numero de ejes");
                    nExtra.setBounds(50, 400, 115, 40);
                    nExtra.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            nExtra.setText("");
                        }
                    });
                    if (vueltas2 == 0) {
                        frame.add(nExtra);
                    }
                /*ejes = Integer.parseInt(nEjes.getText());
                valorUnidad = ejes * 6000;*/
                    vueltas2++;
                }
                if (box.getSelectedIndex() == 1){
                    if (vueltas2 == 0 && vueltas3 == 0) {
                        nExtra = new JTextField("Numero de asientos");
                    }
                    nExtra.setText("Numero de asientos");
                    //nAsientos.setBounds(50, 200, 115, 40);
                    nExtra.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            nExtra.setText("");
                        }
                    });
                    if (vueltas3 == 0) {
                        frame.add(nExtra);
                    }
                }
            }
        }// end box


    }
}
