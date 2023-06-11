package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons implements ActionListener {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(this);
		randNumber.addActionListener(this);
		tellAJoke.addActionListener(this);
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==addNumbers) {
		String a =	JOptionPane.showInputDialog("Please type one number for the addition equation.");
		String b =	JOptionPane.showInputDialog("Please type another number for the addition equation.");
		int one = Integer.parseInt(a);
		int two = Integer.parseInt(b);
		
		JOptionPane.showMessageDialog(null, "The added number is " +(one+two)+ ".");
		}
		if(arg0.getSource()==randNumber) {
			Random randy = new Random();
			JOptionPane.showMessageDialog(null, randy.nextInt(100));
		}
		if(arg0.getSource()==tellAJoke) {
			Random randy = new Random();
			int choice = randy.nextInt(4);
			switch (choice) {
			case 0:
				JOptionPane.showMessageDialog(null, "Why was Cinderella so bad at soccer? She kept running away from the ball!");
			break;
			case 1:
				JOptionPane.showMessageDialog(null, "I just lost an electron. You really have to keep an ion them!");
		break;
			case 2:
				JOptionPane.showMessageDialog(null, "Why don't dinosaurs talk? Because they're dead!");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "What do you call a belt made of watches? A waist of time!");
				break;
				default:
					System.out.println("Buddy, I all out of joke for you. Sorry.");
					break;
		}
	}
	
	}
}
