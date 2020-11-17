
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;

public class Encoder {
	
	public static String convert_to_morse(String user_input)
	{
		String new_string = "";
		
		for (int iterator = 0; iterator < user_input.length(); iterator++)
		{
			switch(user_input.charAt(iterator))
			{
			case 'A' | 'a':
				new_string += ".-" + " ";
				break;
			case 'B' | 'b':
				new_string += "-..." + " ";
				break;
			case 'C' | 'c':
				new_string += "-.-." + " ";
				break;
			case 'D' | 'd':
				new_string += "-.." + " ";
				break;
			case 'E' | 'e':
				new_string += "." + " ";
				break;
			case 'F' | 'f':
				new_string += "..-." + " ";
				break;
			case 'G' | 'g':
				new_string += "--." + " ";
				break;
			case 'H' | 'h':
				new_string += "...." + " ";
				break;
			case 'I' | 'i':
				new_string += ".." + " ";
				break;
			case 'J' | 'j':
				new_string += ".---" + " ";
				break;
			case 'K' | 'k':
				new_string += "-.-" + " ";
				break;
			case 'L' | 'l':
				new_string += ".-.." + " ";
				break;
			case 'M' | 'm':
				new_string += "--" + " ";
				break;
			case 'N' | 'n':
				new_string += "-." + " ";
				break;
			case 'O' | 'o':
				new_string += "---" + " ";
				break;
			case 'P' | 'p':
				new_string += ".--." + " ";
				break;
			case 'Q' | 'q':
				new_string += "--.-" + " ";
				break;
			case 'R' | 'r':
				new_string += ".-." + " ";
				break;
			case 'S' | 's':
				new_string += "..." + " ";
				break;
			case 'T' | 't':
				new_string += "-" + " ";
				break;
			case 'U' | 'u':
				new_string += "..-" + " ";
				break;
			case 'V' | 'v':
				new_string += "...-" + " ";
				break;
			case 'W' | 'w':
				new_string += ".--" + " ";
				break;
			case 'X' | 'x':
				new_string += "-..-" + " ";
				break;
			case 'Y' | 'y':
				new_string += "-.--" + " ";
				break;
			case 'Z' | 'z':
				new_string += "--.." + " ";
				break;
			}
		}
		
		return new_string + "\n";
	}
	public static String encode(String user_input)
	{
		String[] sub = user_input.split(" ");
		String return_string = "";
		
		for (int iterator = 0; iterator < sub.length; iterator++)
		{
			sub[iterator] = convert_to_morse(sub[iterator]);
			return_string += sub[iterator];
		}
		
		return return_string;
	}
	
	@SuppressWarnings("deprecation")
	public Encoder() {
		JFrame frame = new JFrame("Encoder");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JLabel title = new JLabel("Put the words in that you want to be encoded:");
		JTextArea user_input = new JTextArea(5, 40);
		
		JButton button = new JButton("Compile");
		
		button.addActionListener(new ActionListener()
        {
			JTextArea response = new JTextArea("");
        	JScrollPane jpane = new JScrollPane(response);
            public void actionPerformed(ActionEvent ae)
            {
            	String user_input_string = user_input.getText();
            	user_input_string = encode(user_input_string);
            	response.setText(user_input_string);
            	panel.add(jpane);
            	frame.add(panel);
            	frame.show();
            }
        });
		panel.add(title);
		panel.add(new JScrollPane(user_input, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS));
		panel.add(button);
		
		panel.setLayout(new GridLayout(4,1));
		
		frame.add(panel);
		
		frame.setSize(600,600);
		frame.show();
	}

}
