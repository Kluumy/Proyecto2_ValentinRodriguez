import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cliente {
    private String nombreCLiente, nacionalidad, gmail;
    private int dni, telefono;
    JButton button;
    Cliente[] objectos = new Cliente[2];
    Cliente(){
        clienteInter();
    }
    JFrame frame;
    protected void clienteInter(){
        JLabel label = new JLabel();


        ImageIcon logoRedaIn = new ImageIcon("redaturApp.png");
        label.setIcon(logoRedaIn);
        label.setForeground(Color.WHITE);
        //label.setHorizontalTextPosition(JLabel.CENTER);
        //label.setVerticalTextPosition(JLabel.TOP);
        label.setBounds(400,0,500,120);

        JTextField text = new JTextField();
        //text.setPreferredSize(new Dimension(250,40));
        text.setBounds(195, 75, 120, 40);
        text.setText("Nombre cliente");
        //text.setLocation(50,120);
        JTextField text2 = new JTextField();
        //text2.setPreferredSize(new Dimension(250,40));
        text2.setBounds(195, 150, 120, 40);
        text2.setText("Nacionalidad");
        //text2.setLocation(50,240);
        JTextField text3 = new JTextField();
        text3.setBounds(195, 225, 120, 40);
        text3.setText("Identificación");
        //text3.setLocation(50,120);
        JTextField text4 = new JTextField();
        text4.setBounds(195, 300, 120, 40);
        text4.setText("gmail");
        //text4.setLocation(50,120);
        JTextField text5 = new JTextField();
        text5.setBounds(195, 375, 120, 40);
        text5.setText("teléfono");
        //text5.setLocation(50,120);
        //text.setBounds(50,100,120,60);

        button = new JButton("Enviar");
        button.setBounds(180, 480, 140, 60);
        button.addActionListener(e ->
                {
                    nombreCLiente = text.getText();
                    dni = Integer.parseInt(text3.getText());
                    nacionalidad = text2.getText();
                    gmail = text4.getText();
                    telefono = Integer.parseInt(text5.getText());
                    frame.dispose();
                    Reservacion rese = new Reservacion();

                    //JOptionPane.showMessageDialog(null,nombreCLiente+dni+nacionalidad+gmail+telefono);
                    //   LLevar a rural
                });
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);


        frame = new JFrame();

        frame.setTitle("REDATUR");
        frame.getContentPane().setBackground((new Color(12,59,46)));
        ImageIcon logoReda = new ImageIcon("redaturApp.png");
        frame.setIconImage(logoReda.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(520,620);
        frame.setResizable(false);
        frame.add(text);
        frame.add(button);
        frame.add(label);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);
        frame.add(text5);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        //frame.pack();
    }

    protected String datosClienteRes(){
        String res = "Nombre cliente: "+nombreCLiente+"\nIdentificación cliente: "+dni+"\nNacionalidad cliente: "+nacionalidad+"\nCorreo: "
                +gmail+"\nTelefono: "+telefono;
        return res;
    }

}
