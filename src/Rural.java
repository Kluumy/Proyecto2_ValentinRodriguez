import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import static java.lang.String.valueOf;

public abstract class Rural {
    private int cantidad, horaComida, tipoServicio;
    private String bebidaNombre, platoNombre;
    private double valorPlato, valorBebida, interesExtra, valorTotal;
    private String cateComida[] = new String[]{"Desayuno","Almuerzo","Break","Cena"};
    private String cantidadAlimento[] = new String[]{"1","2","3","4","5"};
    private String servico[] = new String[]{"Restaurante","Habitación"};
    //EleccionRural ele = new EleccionRural();
    // prueba
    protected int eleccion[] = new int[3];
    public String eleccionStr[] = new String[3];
    public boolean eleccionBo[] = new boolean[3];
    // end prueba
    //Cliente c1 = new Cliente();
    Rural dataBase[] = new Rural[8];
    //Reservacion r1 = new Reservacion();
    JFrame frame;
    JRadioButton desayuno;
    JRadioButton almuerzo;
    JRadioButton merienda;
    JRadioButton cena;
    JComboBox servicioEspecial;
    JButton masterButton;

    // PRUEBA
    JButton rural;
    JButton ruralEco;
    JFrame frame2;


    public void eleccionIntefaz(){

        rural = new JButton("Ingresar rural económico");
        Border border = BorderFactory.createLineBorder(new Color(0,0,0));
        rural.setBounds(40,20,200,40);
        rural.setBackground(new Color(109,151,115));
        rural.setBorder(border);
        //Border bordeRural = BorderFactory.createLineBorder();
        rural.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                rural.setBackground(new Color(230,229,163));
                rural.setBorder(BorderFactory.createLineBorder(new Color(154,129,0),3));
            }
        });
        rural.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                rural.setBackground(new Color(109,151,115));
                rural.setBorder(BorderFactory.createLineBorder(Color.GRAY,1));
            }
        });
        rural.addActionListener(e ->{
            eleccionBo[0]= true;
            eleccionStr[0] = "entrar";
            JOptionPane.showMessageDialog(null,eleccionStr[0]);
            //setEleccion1(1);
            //JOptionPane.showMessageDialog(null,getEleccion1());
            //eleccion1 = 1;
            //JOptionPane.showMessageDialog(null,eleccion1);
            //eleccionStr[0] = "Entrar";
            //JOptionPane.showMessageDialog(null,eleccionStr);
            frame2.dispose();
            Cliente c1 = new Cliente();
        });
        rural.setFocusable(false);


        ruralEco = new JButton("Ingresar rural estándar");
        ruralEco.setBounds(40,120,200,40);
        ruralEco.setBackground(new Color(109,151,115));
        ruralEco.setBorder(border);
        ruralEco.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ruralEco.setBackground(new Color(230,229,163));
                ruralEco.setBorder(BorderFactory.createLineBorder(new Color(154,129,0),3));
            }
        });
        ruralEco.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                ruralEco.setBackground(new Color(109,151,115));
                ruralEco.setBorder(BorderFactory.createLineBorder(Color.GRAY,1));
            }
        });
        ruralEco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.dispose();
                Cliente c1 = new Cliente();
                //eleccion[1] = 1;
                eleccionStr[1] = "Entrar";
                //RuralEconomico re = new RuralEconomico();
            }
        });
        ruralEco.setFocusable(false);

        JButton ruralOro = new JButton("Ingresar rural oro");
        ruralOro.setBounds(40,220,200,40);
        ruralOro.setBackground(new Color(109,151,115));
        ruralOro.setBorder(border);
        ruralOro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ruralOro.setBackground(new Color(230,229,163));
                ruralOro.setBorder(BorderFactory.createLineBorder(new Color(154,129,0),3));
            }
        });
        ruralOro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                ruralOro.setBackground(new Color(109,151,115));
                ruralOro.setBorder(BorderFactory.createLineBorder(Color.GRAY,1));
            }
        });
        ruralOro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.dispose();
                Cliente c1 = new Cliente();
                //eleccion[2] = 1;
                eleccionStr[2] = "Entrar";
                //RuralEconomico re = new RuralEconomico();
            }
        });
        ruralOro.setFocusable(false);

        frame2 = new JFrame();
        frame2.setTitle("REDATUR");
        frame2.getContentPane().setBackground((new Color(12,59,46)));
        ImageIcon logoReda = new ImageIcon("redaturApp.png");
        frame2.setIconImage(logoReda.getImage());
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
        frame2.setLayout(null);
        frame2.setSize(460,460);
        frame2.setResizable(false);
        frame2.add(rural);
        frame2.add(ruralEco);
        frame2.add(ruralOro);
        frame2.setVisible(true);
        frame2.setLocationRelativeTo(null);
    }
    // END PRUEBA


    public void ruralInterfaz(){
        //Servicio alimentación
        // Categoria . . . .
        ButtonGroup cateGroup= new ButtonGroup();
        desayuno = new JRadioButton("Desayuno");
        almuerzo = new JRadioButton("Almuerzo");
        merienda = new JRadioButton("Merienda");
        cena = new JRadioButton("Cena");
        cateGroup.add(desayuno);
        cateGroup.add(almuerzo);
        cateGroup.add(merienda);
        cateGroup.add(cena);
        desayuno.setBounds(40,250,100,50);
        almuerzo.setBounds(140,250,100,50);
        merienda.setBounds(240,250,100,50);
        cena.setBounds(340,250, 100, 50);

        // tipo de servicio *square*
        servicioEspecial = new JComboBox<>(servico);
        servicioEspecial.setBounds(300,150,100,50);
        // text: plato a consumimr
        JTextField platoConsumo = new JTextField("Plato que desea consumir");
        platoConsumo.setBounds(50,10,115,40);
        platoConsumo.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                platoConsumo.setText("");
            }
        });
        // text: bebida a consumir
        JTextField bebidaConsumo = new JTextField("Bebida que desea consumir");
        bebidaConsumo.setBounds(140,10,115,40);
        bebidaConsumo.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                bebidaConsumo.setText("");
            }
        });
        // cantidad *square*
        JComboBox cantidadPlatos = new JComboBox<>(cantidadAlimento);
        cantidadPlatos.setBounds(300,180,100,50);
        // text: precio bebida
        JTextField precioBebida = new JTextField("Bebida que desea consumir");
        precioBebida.setBounds(140,70,115,40);
        precioBebida.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                precioBebida.setText("");
            }
        });
        // text: precio plato
        JTextField precioPlato = new JTextField("Bebida que desea consumir");
        precioPlato.setBounds(260,70,115,40);
        precioPlato.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                precioPlato.setText("");
            }
        });
        // calcular los valores valorComida y valorBebida
        valorBebida *= cantidad;
        valorPlato *= cantidad;
        // crear un total
        valorTotal = valorBebida + valorPlato;
        // mostrar los intereses por aparte
        /*Imprimir el interes extra*/

        // intereses
        if (tipoServicio == 0){
            interesExtra = valorTotal * 0.10;
            valorTotal += interesExtra;
        } else{
            interesExtra = valorTotal * 0.15;
            valorTotal += interesExtra;
        }
        // boton continuar
        JButton masterButton = new JButton("Continuar");
        masterButton.setBounds(167,340,100,60);
        masterButton.setFocusable(false);
        masterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Entraste boton master");
                JOptionPane.showMessageDialog(null,valueOf(eleccionStr[0]));
                //ele.ele
                //ele.eleccionesList.get(0);
                if (rural.isSelected()) {
                    JOptionPane.showMessageDialog(null,"Entraste en rural eco");
                    RuralEconomico re = new RuralEconomico();
                    re.interfazEach();
                }
                frame.dispose();
            }
        });



        frame = new JFrame();
        frame.setTitle("REDATUR");
        frame.getContentPane().setBackground((new Color(12,59,46)));
        ImageIcon logoReda = new ImageIcon("redaturApp.png");
        frame.setIconImage(logoReda.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(460,460);
        frame.setResizable(false);
        frame.add(precioPlato);
        frame.add(precioBebida);
        frame.add(desayuno);
        frame.add(almuerzo);
        frame.add(cantidadPlatos);
        frame.add(merienda);
        frame.add(bebidaConsumo);
        frame.add(masterButton);
        frame.add(platoConsumo);
        frame.add(cena);
        frame.add(servicioEspecial);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    public abstract void datosExtras();
    public abstract String datosExtrasRes();
    public abstract void interfazEach();



}
