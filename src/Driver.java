import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter: \n 1 to run the encoder \n 2 to run the decoder \n 3 to run both ");
		int response = scnr.nextInt();
		
		if (response == 1)
		{
			Encoder e = new Encoder();
		}
		else if (response == 2)
		{
			Decoder d = new Decoder();
		}
		else if (response == 3)
		{
			Encoder e = new Encoder();
			Decoder d = new Decoder();
		}
	}

}
