    /*Java Program to create a choice menu and display the item selected*/

    import javax.swing.*;

    import java.awt.*;

    import java.awt.event.*;

    class Choice_Menu implements ItemListener

    {

    	static Choice menu;

    	static JTextField text;

            //Driver function

    	public static void main(String args[])

    	{

    		//Create a frame

    		JFrame frame=new JFrame("Choice Menu");

    		frame.setSize(253,500);

    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    		frame.setLayout(null);

    		frame.getContentPane().setBackground(Color.yellow);

    		//Create a choice menu

    		menu=new Choice();

    		menu.setBounds(100,100,120,60);

    		frame.add(menu);

    		//Add items to the menu

    		menu.add("C");

    		menu.add("C++");

    		menu.add("Java");

    		menu.add("Python");

    		menu.add("R");

    		//Create a text field for output

    		text=new JTextField();

    		text.setBounds(0,400,500,100);

    		frame.add(text);

    		//Create an object

    		Choice_Menu obj=new Choice_Menu();

    		//Associate ItemListener with the choice menu

    		menu.addItemListener(obj);

    		//Display the frame

    		frame.setVisible(true);

    	}

            //function to display the item selected

    	public void itemStateChanged(ItemEvent e)

    	{

    		String item=menu.getSelectedItem();

    		text.setText("Language Selected : "+item);

    	}

    }