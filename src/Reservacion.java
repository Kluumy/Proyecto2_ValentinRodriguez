import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Reservacion implements ActionListener {
    private int numeroHabitacion, categoriaHotel, dias, mes = 0, vueltas = 0, mes1 = 0, vueltas2 = 0;
    private String nombreHotel, fechaEntrada, fechaSalida;
    private double costoHabitacion;
    private String[] cate = new String[]{"4 estrellas","5 estrellas"+"6 estrellas"};
    private String[] meses = new String[]{"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    private String[] diaMes;
    //private String[] prueba;
    Reservacion(){
        datos();
    }
    JComboBox boxDays;
    JComboBox boxMonths;
    JComboBox boxDaysExit;
    JComboBox boxMonthExit;
    JFrame frame;

    JRadioButton cate1;
    JRadioButton cate2;
    JRadioButton cate3;
    JButton masterButton;

    public void datos(){

        // nombre hotel
        JTextField nameHotel = new JTextField("Nombre hotel");
        nameHotel.setBounds(46,60,100,45);
        nameHotel.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                nameHotel.setText("");
            }
        });

        // categoria hotel array
        ButtonGroup grupoCate = new ButtonGroup();
        cate1= new JRadioButton("4 Estrellas");
        cate2= new JRadioButton("5 Estrellas");
        cate3= new JRadioButton("6 Estrellas");
        grupoCate.add(cate1);
        grupoCate.add(cate2);
        grupoCate.add(cate3);
        cate1.setBounds(40,250,100,50);
        cate2.setBounds(140,250,100,50);
        cate3.setBounds(240,250,100,50);
        // numero habitacion
        JTextField numeroHa = new JTextField("Número habitación");
        numeroHa.setBounds(50,10,115,40);
        numeroHa.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                numeroHa.setText("");
            }
        });
        // costo habitacion
        JTextField costoHa = new JTextField("Costo habitación");
        costoHa.setBounds(260,10,115,40);
        costoHa.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                costoHa.setText("");
            }
        });
        // fecha ingreso //CHECK
        // fecha salida // CHECK
        boxMonths = new JComboBox<>(meses);
        boxMonths.setBounds(200,100,100,50);
        boxMonths.addActionListener(this);
        boxMonthExit = new JComboBox<>(meses);
        boxMonthExit.setBounds(300,150,100,50);
        boxMonthExit.addActionListener(e -> {
            if (vueltas2 > 0) {
                frame.remove(boxDaysExit);
            }
            int dias2 = dias;
            mes = boxMonthExit.getSelectedIndex() + 1;
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                dias = 31;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                dias = 30;
            } else {
                dias = 28;
            }
            if (vueltas2 > 0) {
                if (mes != mes1) {
                    boxDaysExit.removeAllItems();
                    //JOptionPane.showMessageDialog(null,"Dias removidos");
                }

            }

            mes1 = mes;

            int dia = 1;
            //String res = "";
            diaMes = new String[dias];
            //JOptionPane.showMessageDialog(null,diaMes.length);
            //int dias2;
            //

            for (int i = 0; i < diaMes.length; i++) {
                diaMes[i] = Integer.toString(dia);
                dia++;
                //res += diaMes[i]+"\n";
                if (vueltas2 > 0) {
                    boxDaysExit.insertItemAt(diaMes[i], i);
                }
            }
            //JOptionPane.showMessageDialog(null,res);
            boxDaysExit = new JComboBox<>(diaMes);
            //JOptionPane.showMessageDialog(null,boxDays);
            boxDaysExit.setBounds(250, 150, 50, 50);
            frame.add(boxDaysExit);
            frame.setVisible(true);
            vueltas2++;
                });
        //boxDays = new JComboBox<>();
        //control de todo boton
        masterButton = new JButton("Continuar");
        masterButton.setBounds(167,340,100,60);
        masterButton.setFocusable(false);
        masterButton.addActionListener(this);


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
        frame.add(numeroHa);
        frame.add(costoHa);
        frame.add(boxMonths);
        frame.add(cate1);
        frame.add(cate2);
        frame.add(cate3);
        frame.add(boxMonthExit);
        frame.add(nameHotel);
        frame.add(masterButton);
        //frame.add(boxDays);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (vueltas > 0){
            frame.remove(boxDays);
        }
        if (e.getSource() == boxMonths) {
            int dias2 = dias;
            mes = boxMonths.getSelectedIndex() + 1;
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                dias = 31;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                dias = 30;
            } else {
                dias = 28;
            }
            if (vueltas > 0) {
                if (mes != mes1) {
                    boxDays.removeAllItems();
                    //JOptionPane.showMessageDialog(null,"Dias removidos");
                }

            }

            mes1 = mes;

            int dia = 1;
            //String res = "";
            diaMes = new String[dias];
            //JOptionPane.showMessageDialog(null,diaMes.length);
            //int dias2;
            //

            for (int i = 0; i < diaMes.length; i++) {
                diaMes[i] = Integer.toString(dia);
                dia++;
                //res += diaMes[i]+"\n";
                if (vueltas > 0) {
                    boxDays.insertItemAt(diaMes[i], i);
                }
            }
            //JOptionPane.showMessageDialog(null,res);
            boxDays = new JComboBox<>(diaMes);
            //JOptionPane.showMessageDialog(null,boxDays);
            boxDays.setBounds(150, 100, 50, 50);
            frame.add(boxDays);
            frame.setVisible(true);
            vueltas++;


            //diasMes();
            //diaMes = null;
        }
        if (e.getSource() == masterButton){
            frame.dispose();
            RuralEconomico ele = new RuralEconomico();
            Boolean prueba = ele.eleccionBo[0];
            JOptionPane.showMessageDialog(null,prueba);
            RuralEconomico abd = new RuralEconomico();
            abd.ruralInterfaz();
        }
    }
        }

