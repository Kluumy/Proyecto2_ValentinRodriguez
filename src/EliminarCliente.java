import javax.swing.*;
import java.awt.*;

public class EliminarCliente {
    EliminarCliente(){
        eliInter();
    }
    public void eliInter(){
        JFrame frame = new JFrame();
        GridLayout gl = new GridLayout(3,2);
        //FlowLayout fl = new FlowLayout();
        //frame.setLayout(new BoxLayout(frame,BoxLayout.Y_AXIS));
        frame.setTitle("REDATUR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(gl);
        frame.setVisible(true);


        //frame.setSize(460,460);


        frame.setResizable(true);
        JButton button1 = new JButton("Botton creado");
        button1.setSize(40,40);
        //frame.add(button1);
        frame.add(new Button("Button A"));
        frame.add(new Button("Button B"));
        frame.add(new Button("Button C"));
        frame.add(new Button("Button D"));

        frame.setVisible(true);
    }
}
