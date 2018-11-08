import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    //Creates all of our buttons
    private JButton button1 = new JButton();
    private JButton button2 = new JButton();
    private JButton button3 = new JButton();
    private JButton button4 = new JButton();
    private JButton button5 = new JButton();
    private JButton button6 = new JButton();
    private JButton button7 = new JButton();
    private JButton button8 = new JButton();
    private JButton button9 = new JButton();
    private JButton button10 = new JButton();
    private JButton button11 = new JButton();
    private JButton button12 = new JButton();
    private JButton button13 = new JButton();
    private JButton button14 = new JButton();
    private JButton button15 = new JButton();
    private JButton button16 = new JButton();
    private JButton button17 = new JButton();
    private JButton button18 = new JButton();
    private JButton button19 = new JButton();
    private JButton button20 = new JButton();
    private JButton button21 = new JButton();
    private JButton button22 = new JButton();
    private JButton button23 = new JButton();
    private JButton button24 = new JButton();
    private JButton button25 = new JButton();

    //Sets button color operator
    private int buttonColor1 = 1;
    private int buttonColor2 = 1;
    private int buttonColor3 = 1;
    private int buttonColor4 = 1;
    private int buttonColor6 = 1;
    private int buttonColor7 = 1;
    private int buttonColor8 = 1;
    private int buttonColor9 = 1;
    private int buttonColor10 = 1;
    private int buttonColor11 = 1;
    private int buttonColor12 = 1;
    private int buttonColor13 = 1;
    private int buttonColor14 = 1;
    private int buttonColor15 = 1;
    private int buttonColor16 = 1;
    private int buttonColor17 = 1;
    private int buttonColor18 = 1;
    private int buttonColor19 = 1;
    private int buttonColor20 = 1;
    private int buttonColor22 = 1;
    private int buttonColor23 = 1;
    private int buttonColor24 = 1;
    private int buttonColor25 = 1;

    public static void main(String[] args) {
        //Fix for mac computers i found online
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Sets the JFrame to visible default is false
        new Main().setVisible(true);
    }

    public void output(String str, boolean TF) {
        if(TF) {
            System.out.println(str + " was turned on.");
        } else {
            System.out.println(str + " was turned off.");
        }
    }

    public void buttons() {
        //Adds buttons to JFrame
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button10);
        add(button11);
        add(button12);
        add(button13);
        add(button14);
        add(button15);
        add(button16);
        add(button17);
        add(button18);
        add(button19);
        add(button20);
        add(button21);
        add(button22);
        add(button23);
        add(button24);
        add(button25);

        //Sets opacity for all buttons
        button1.setOpaque(true);
        button2.setOpaque(true);
        button3.setOpaque(true);
        button4.setOpaque(true);
        button5.setOpaque(true);
        button6.setOpaque(true);
        button7.setOpaque(true);
        button8.setOpaque(true);
        button9.setOpaque(true);
        button10.setOpaque(true);
        button11.setOpaque(true);
        button12.setOpaque(true);
        button13.setOpaque(true);
        button14.setOpaque(true);
        button15.setOpaque(true);
        button16.setOpaque(true);
        button17.setOpaque(true);
        button18.setOpaque(true);
        button19.setOpaque(true);
        button20.setOpaque(true);
        button21.setOpaque(true);
        button22.setOpaque(true);
        button23.setOpaque(true);
        button24.setOpaque(true);
        button25.setOpaque(true);

        //Sets our red buttons
        button5.setBackground(Color.RED);
        button21.setBackground(Color.RED);

        //Sets our blue buttons
        button1.setBackground(Color.BLUE);
        button2.setBackground(Color.BLUE);
        button3.setBackground(Color.BLUE);
        button4.setBackground(Color.BLUE);
        button6.setBackground(Color.BLUE);
        button7.setBackground(Color.BLUE);
        button8.setBackground(Color.BLUE);
        button9.setBackground(Color.BLUE);
        button10.setBackground(Color.BLUE);
        button11.setBackground(Color.BLUE);
        button12.setBackground(Color.BLUE);
        button13.setBackground(Color.BLUE);
        button14.setBackground(Color.BLUE);
        button15.setBackground(Color.BLUE);
        button16.setBackground(Color.BLUE);
        button17.setBackground(Color.BLUE);
        button18.setBackground(Color.BLUE);
        button19.setBackground(Color.BLUE);
        button20.setBackground(Color.BLUE);
        button22.setBackground(Color.BLUE);
        button23.setBackground(Color.BLUE);
        button24.setBackground(Color.BLUE);
        button25.setBackground(Color.BLUE);

        //Sets action command
        button1.setActionCommand("setButton1");
        button2.setActionCommand("setButton2");
        button3.setActionCommand("setButton3");
        button4.setActionCommand("setButton4");
        button6.setActionCommand("setButton6");
        button7.setActionCommand("setButton7");
        button8.setActionCommand("setButton8");
        button9.setActionCommand("setButton9");
        button10.setActionCommand("setButton10");
        button11.setActionCommand("setButton11");
        button12.setActionCommand("setButton12");
        button13.setActionCommand("setButton13");
        button14.setActionCommand("setButton14");
        button15.setActionCommand("setButton15");
        button16.setActionCommand("setButton16");
        button17.setActionCommand("setButton17");
        button18.setActionCommand("setButton18");
        button19.setActionCommand("setButton19");
        button20.setActionCommand("setButton20");
        button22.setActionCommand("setButton22");
        button23.setActionCommand("setButton23");
        button24.setActionCommand("setButton24");
        button25.setActionCommand("setButton25");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        button14.addActionListener(this);
        button15.addActionListener(this);
        button16.addActionListener(this);
        button17.addActionListener(this);
        button18.addActionListener(this);
        button19.addActionListener(this);
        button20.addActionListener(this);
        button22.addActionListener(this);
        button23.addActionListener(this);
        button24.addActionListener(this);
        button25.addActionListener(this);

        button5.setEnabled(false);
        button21.setEnabled(false);
    }

    private Main() {
        super("Learning JFrame"); //Title of the JFrame
        setSize(600, 600); // width and height of the JFrame
        setResizable(false); //Does not allow user to change size of JFrame
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Sets the IDE to stop running the program if we close the JFrame
        setLayout(new GridLayout(5, 5, 7, 7)); // Sets a 5x5 grid with a 7 gap
        buttons();

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if(action.equals("setButton1")) {
            if(buttonColor1 == 1) {
                button1.setBackground(Color.YELLOW);
                buttonColor1 = 0;
                output("Button 1", true);
            } else if(buttonColor1 == 0) {
                button1.setBackground(Color.BLUE);
                buttonColor1 = 1;
                output("Button 1", false);
            }
        }

        if(action.equals("setButton2")) {
            if(buttonColor2 == 1) {
                button2.setBackground(Color.YELLOW);
                buttonColor2 = 0;
                output("Button 2", true);
            } else if(buttonColor2 == 0) {
                button2.setBackground(Color.BLUE);
                buttonColor2 = 1;
                output("Button 2", false);
            }
        }

        if(action.equals("setButton3")) {
            if(buttonColor3 == 1) {
                button3.setBackground(Color.YELLOW);
                buttonColor3 = 0;
                output("Button 3", true);
            } else if(buttonColor3 == 0) {
                button3.setBackground(Color.BLUE);
                buttonColor3 = 1;
                output("Button 3", false);
            }
        }

        if(action.equals("setButton4")) {
            if(buttonColor4 == 1) {
                button4.setBackground(Color.YELLOW);
                buttonColor4 = 0;
                output("Button 4", true);
            } else if(buttonColor4 == 0) {
                button4.setBackground(Color.BLUE);
                buttonColor4 = 1;
                output("Button 4", false);
            }
        }

        if(action.equals("setButton6")) {
            if(buttonColor6 == 1) {
                button6.setBackground(Color.YELLOW);
                buttonColor6 = 0;
                output("Button 6", true);
            } else if(buttonColor6 == 0) {
                button6.setBackground(Color.BLUE);
                buttonColor6 = 1;
                output("Button 6", false);
            }
        }

        if(action.equals("setButton7")) {
            if(buttonColor7 == 1) {
                button7.setBackground(Color.YELLOW);
                buttonColor7 = 0;
                output("Button 7", true);
            } else if(buttonColor7 == 0) {
                button7.setBackground(Color.BLUE);
                buttonColor7 = 1;
                output("Button 7", false);
            }
        }

        if(action.equals("setButton8")) {
            if(buttonColor8 == 1) {
                button8.setBackground(Color.YELLOW);
                buttonColor8 = 0;
                output("Button 8", true);
            } else if(buttonColor8 == 0) {
                button8.setBackground(Color.BLUE);
                buttonColor8 = 1;
                output("Button 8", false);
            }
        }

        if(action.equals("setButton9")) {
            if(buttonColor9 == 1) {
                button9.setBackground(Color.YELLOW);
                buttonColor9 = 0;
                output("Button 9", true);
            } else if(buttonColor9 == 0) {
                button9.setBackground(Color.BLUE);
                buttonColor9 = 1;
                output("Button 9", false);
            }
        }

        if(action.equals("setButton10")) {
            if(buttonColor10 == 1) {
                button10.setBackground(Color.YELLOW);
                buttonColor10 = 0;
                output("Button 10", true);
            } else if(buttonColor10 == 0) {
                button10.setBackground(Color.BLUE);
                buttonColor10 = 1;
                output("Button 10", false);
            }
        }

        if(action.equals("setButton11")) {
            if(buttonColor11 == 1) {
                button11.setBackground(Color.YELLOW);
                buttonColor11 = 0;
                output("Button 11", true);
            } else if(buttonColor11 == 0) {
                button11.setBackground(Color.BLUE);
                buttonColor11 = 1;
                output("Button 11", false);
            }
        }

        if(action.equals("setButton12")) {
            if(buttonColor12 == 1) {
                button12.setBackground(Color.YELLOW);
                buttonColor12 = 0;
                output("Button 12", true);
            } else if(buttonColor12 == 0) {
                button12.setBackground(Color.BLUE);
                buttonColor12 = 1;
                output("Button 12", false);
            }
        }

        if(action.equals("setButton13")) {
            if(buttonColor13 == 1) {
                button13.setBackground(Color.YELLOW);
                buttonColor13 = 0;
                output("Button 13", true);
            } else if(buttonColor13 == 0) {
                button13.setBackground(Color.BLUE);
                buttonColor13 = 1;
                output("Button 13", false);
            }
        }

        if(action.equals("setButton14")) {
            if(buttonColor14 == 1) {
                button14.setBackground(Color.YELLOW);
                buttonColor14 = 0;
                output("Button 14", true);
            } else if(buttonColor14 == 0) {
                button14.setBackground(Color.BLUE);
                buttonColor14 = 1;
                output("Button 14", false);
            }
        }

        if(action.equals("setButton15")) {
            if(buttonColor15 == 1) {
                button15.setBackground(Color.YELLOW);
                buttonColor15 = 0;
                output("Button 15", true);
            } else if(buttonColor15 == 0) {
                button15.setBackground(Color.BLUE);
                buttonColor15 = 1;
                output("Button 15", false);
            }
        }

        if(action.equals("setButton16")) {
            if(buttonColor16 == 1) {
                button16.setBackground(Color.YELLOW);
                buttonColor16 = 0;
                output("Button 16", true);
            } else if(buttonColor16 == 0) {
                button16.setBackground(Color.BLUE);
                buttonColor16 = 1;
                output("Button 16", false);
            }
        }

        if(action.equals("setButton17")) {
            if(buttonColor17 == 1) {
                button17.setBackground(Color.YELLOW);
                buttonColor17 = 0;
                output("Button 17", true);
            } else if(buttonColor17 == 0) {
                button17.setBackground(Color.BLUE);
                buttonColor17 = 1;
                output("Button 17", false);
            }
        }

        if(action.equals("setButton18")) {
            if(buttonColor18 == 1) {
                button18.setBackground(Color.YELLOW);
                buttonColor18 = 0;
                output("Button 18", true);
            } else if(buttonColor18 == 0) {
                button18.setBackground(Color.BLUE);
                buttonColor18 = 1;
                output("Button 18", false);
            }
        }

        if(action.equals("setButton19")) {
            if(buttonColor19 == 1) {
                button19.setBackground(Color.YELLOW);
                buttonColor19 = 0;
                output("Button 19", true);
            } else if(buttonColor19 == 0) {
                button19.setBackground(Color.BLUE);
                buttonColor19 = 1;
                output("Button 19", false);
            }
        }

        if(action.equals("setButton20")) {
            if(buttonColor20 == 1) {
                button20.setBackground(Color.YELLOW);
                buttonColor20 = 0;
                output("Button 20", true);
            } else if(buttonColor20 == 0) {
                button20.setBackground(Color.BLUE);
                buttonColor20 = 1;
                output("Button 20", false);
            }
        }

        if(action.equals("setButton22")) {
            if(buttonColor22 == 1) {
                button22.setBackground(Color.YELLOW);
                buttonColor22 = 0;
                output("Button 22", true);
            } else if(buttonColor22 == 0) {
                button22.setBackground(Color.BLUE);
                buttonColor22 = 1;
                output("Button 22", false);
            }
        }

        if(action.equals("setButton23")) {
            if(buttonColor23 == 1) {
                button23.setBackground(Color.YELLOW);
                buttonColor23 = 0;
                output("Button 23", true);
            } else if(buttonColor23 == 0) {
                button23.setBackground(Color.BLUE);
                buttonColor23 = 1;
                output("Button 23", false);
            }
        }

        if(action.equals("setButton24")) {
            if(buttonColor24 == 1) {
                button24.setBackground(Color.YELLOW);
                buttonColor24 = 0;
                output("Button 24", true);
            } else if(buttonColor24 == 0) {
                button24.setBackground(Color.BLUE);
                buttonColor24 = 1;
                output("Button 24", false);
            }
        }

        if(action.equals("setButton25")) {
            if(buttonColor25 == 1) {
                button25.setBackground(Color.YELLOW);
                buttonColor25 = 0;
                output("Button 25", true);
            } else if(buttonColor25 == 0) {
                button25.setBackground(Color.BLUE);
                buttonColor25 = 1;
                output("Button 25", false);
            }
        }
    }
}