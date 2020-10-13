package Map;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Set;

public class MapPanel extends JFrame implements ActionListener, KeyListener {
    final static Dimension frameSize = new Dimension(500, 500);
    static ArrayList<BasicObj> allObj;
//    static Set<BasicObj>objSet;


    public MapPanel() {
        if(allObj!=null)
        allObj.clear();
        allObj=new ArrayList<>();
        create();


    }

    public void create() {
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setSize(frameSize);
        this.setResizable(false);

        //
        this.addKeyListener(this);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);


                int result = JOptionPane.showConfirmDialog(
                        rootPane, "sure EXIT?", "EXIT",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE
                );
                if (result == JOptionPane.YES_NO_OPTION) {
                    System.exit(0);
                }
            }
        });

        JPanel panel =new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);




            }
        };
        panel.setSize(frameSize);
        this.add(panel);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {



    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        for(KeySetting.DirectionKey direction:KeySetting.DirectionKey.values()){
            if(e.getKeyCode()==direction.getValue()){

                direction.command();
                break;
            }


        }
        if(e.getKeyCode()==88){

            System.out.println("按下X");
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}
