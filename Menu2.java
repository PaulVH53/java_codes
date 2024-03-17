    /*Java Program to Create a Menu and Display the Menu Item Selected*/

    import javax.swing.*;

    import java.awt.*;

    import java.awt.event.*;

    class Menu2 implements ActionListener

    {

        static JLabel text;

        //Driver function

        public static void main(String args[])

        {

    	//Create a frame

    	JFrame frame = new JFrame("Menu2");

    	frame.setSize(500,500);

    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	frame.setLayout(new FlowLayout());
		
		frame.getContentPane().setBackground(Color.yellow);

    	//Create an object

    	Menu2 obj = new Menu2();

    	//Create a Menu

    	JMenu menu = new JMenu("Select Here");

    	//Create Menu Items

    	JMenuItem item[] = new JMenuItem[5];

    	for(int i=0;i<5;i++)

    	{

    	    item[i]=new JMenuItem("Item "+(i+1));

    	    item[i].addActionListener(obj);

    	    menu.add(item[i]);

    	}

    	//Create a menu bar

    	JMenuBar mb=new JMenuBar();

    	mb.add(menu);

    	frame.setJMenuBar(mb);

    	//Create the label

    	text = new JLabel();

    	frame.add(text);

    	//Display the frame

    	frame.setVisible(true);

        }

        //Function to display the menu item selected

        public void actionPerformed(ActionEvent e)

        {

    	text.setText("Menu Item Selected : "+e.getActionCommand());

        }

    }