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

public class Decoder {
	
	public static String convert_from_morse(String user_input)
	{
		String[] sub = user_input.split(" ");
		String new_string = "";
		
		for (int iterator = 0; iterator < sub.length; iterator++)
		{
			switch(sub[iterator])
			{
			case ".":
				new_string += "e";
				break;
			case "..":
				new_string += "i";
				break;
			case "...":
				new_string += "s";
				break;
			case "....":
				new_string += "h";
				break;
			case "...-":
				new_string += "v";
				break;
			case "..-":
				new_string += "u";
				break;
			case "..-.":
				new_string += "f";
				break;
			case ".-":
				new_string += "a";
				break;
			case ".-.":
				new_string += "r";
				break;
			case ".-..":
				new_string += "l";
				break;
			case ".--":
				new_string += "w";
				break;
			case ".---":
				new_string += "j";
				break;
			case ".--.":
				new_string += "p";
				break;
			case "-":
				new_string += "t";
				break;
			case "--":
				new_string += "m";
				break;
			case "---":
				new_string += "o";
				break;
			case "--.":
				new_string += "g";
				break;
			case "--.-":
				new_string += "q";
				break;
			case "--..":
				new_string += "z";
				break;
			case "-.":
				new_string += "n";
				break;
			case "-..":
				new_string += "d";
				break;
			case "-...":
				new_string += "b";
				break;
			case "-..-":
				new_string += "x";
				break;
			case "-.-":
				new_string += "k";
				break;
			case "-.--":
				new_string += "y";
				break;
			case "-.-.":
				new_string += "c";
				break;
			}
		}
		return new_string;
	}
	
	public static String decode(String user_input)
	{
		String[] words = user_input.split("\n");
		String return_string = "";
		
		for (int iterator = 0; iterator < words.length; iterator++)
		{
			words[iterator] = convert_from_morse(words[iterator]);
			return_string += words[iterator] + " ";
		}
		
		return return_string;
	}
	
	@SuppressWarnings("deprecation")
	public Decoder() {
		JFrame frame = new JFrame("Decoder");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		
		JLabel title = new JLabel("Put the phrase in that you want to be decoded:");
		JTextArea user_input = new JTextArea(5, 40);
		
		JButton button = new JButton("Compile");
		
		button.addActionListener(new ActionListener()
        {
			JTextArea response = new JTextArea("");
            public void actionPerformed(ActionEvent ae)
            {
            	String user_input_string = user_input.getText();
            	user_input_string = decode(user_input_string);
            	response.setText(user_input_string);
            	panel.add(response);
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
