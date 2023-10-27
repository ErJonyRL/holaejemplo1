package hola;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Hola {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hola window = new Hola();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hola() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 527, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 491, 289);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("pene");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(1);
			}
		});
		btnNewButton.setBounds(44, 131, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(4);
			}
		});
		btnNewButton_1.setBounds(44, 165, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(7);
			}
		});
		btnNewButton_2.setBounds(44, 199, 89, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("+");
			}
		});
		btnNewButton_3.setBounds(341, 131, 89, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("2");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(2);
			}
		});
		btnNewButton_4.setBounds(143, 131, 89, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(5);
			}
		});
		btnNewButton_5.setBounds(143, 165, 89, 23);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("8");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(8);
			}
		});
		btnNewButton_6.setBounds(143, 199, 89, 23);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("0");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(0);
			}
		});
		btnNewButton_7.setBounds(143, 233, 89, 23);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(3);
			}
		});
		btnNewButton_8.setBounds(242, 131, 89, 23);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("6");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(6);
			}
		});
		btnNewButton_9.setBounds(242, 165, 89, 23);
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("9");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(9);
			}
		});
		btnNewButton_10.setBounds(242, 199, 89, 23);
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("-");
			}
		});
		btnNewButton_11.setBounds(341, 165, 89, 23);
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_11_1 = new JButton("*");
		btnNewButton_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("*");
			}
		});
		btnNewButton_11_1.setBounds(341, 199, 89, 23);
		panel.add(btnNewButton_11_1);
		
		JButton btnNewButton_11_2 = new JButton("enter");
		btnNewButton_11_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("enter");
			}
		});
		btnNewButton_11_2.setBounds(242, 233, 89, 23);
		panel.add(btnNewButton_11_2);
		
		JButton btnNewButton_12 = new JButton("/");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("/");
			}
		});
		btnNewButton_12.setBounds(341, 233, 89, 23);
		panel.add(btnNewButton_12);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(44, 28, 390, 69);
		panel.add(textArea);
		
		JButton btnNewButton_13 = new JButton("C");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("C");
			}
		});
		btnNewButton_13.setBounds(44, 233, 89, 23);
		panel.add(btnNewButton_13);
	}
}
