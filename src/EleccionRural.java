/*import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class EleccionRural {

    EleccionRural(){
        //eleccionIntefaz();
    }



    JButton ruralEco;
    protected int eleccion[] = new int[3];
    public String eleccionStr[] = new String[3];
    public boolean eleccionBo[] = new boolean[3];

    public int getEleccion1() {
        return eleccion1;
    }

    public void setEleccion1(int eleccion1) {
        this.eleccion1 = eleccion1;
    }

    public int getEleccion2() {
        return eleccion2;
    }

    public void setEleccion2(int eleccion2) {
        this.eleccion2 = eleccion2;
    }

    public int getEleccion3() {
        return eleccion3;
    }

    public void setEleccion3(int eleccion3) {
        this.eleccion3 = eleccion3;
    }

    private int eleccion1=0, eleccion2=0, eleccion3=0;
    public ArrayList<String> eleccionesList = new ArrayList<>();
    JFrame frame2;

    public void eleccionIntefaz(){

        JButton rural = new JButton("Ingresar rural económico");
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
            setEleccion1(1);
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
    public String getEleccionStr(int i) {
        int index = i;
        return eleccionStr[index];
    }
}
*/