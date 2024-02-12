package funktionsgranssnitt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java. awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Funktionsgranssnitt extends JFrame{

        JPanel p = new JPanel();
        JButton button1 = new JButton("Button 1");
        JButton button2 =  new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        JButton button4 = new JButton("Button 4");

        Funktionsgranssnitt (){

            this.add(p);
            p.add(button1);
            p.add(button2);
            p.add(button3);
            p.add(button4);


            // här använder vi oss av annonyma klasser
            // det som vi har stoppat i mellan paranteserna är en instans av ActionsListener.
            // ActionsListener är en interface, så vi måste ha en implemerande sats
            // direkt efter (New ActionsListener) kan vi skriva koden som skulle vara i den implemerande klassen
            // då vill den impleentera ACtionsPerformed, då kommer det att blir en äkta klass
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button1.setText("knapp1");
                }
            });

            // Lambda är en kort notation av en funktion
            // använder Lambda på button2. det är samma resulat/funktions som button1 , men e -> refererar till ActionListener.
            button2.addActionListener( e -> button2.setText("knapp 2"));// passar funktion som parameter

            ActionListener ae = e -> button3.setText("knapp 3");// en lambda - vi passar in det som en variebel
            button3.addActionListener(ae);
            button4.addActionListener(getAE());



            this.setSize(200,200);
            this.setLocation(1000, 500);
            this.setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        public ActionListener getAE(){
            return e -> button4.setText("knapp 4");
        }

    public static void main(String[] args) {
        Funktionsgranssnitt g = new Funktionsgranssnitt();
    }

    }
