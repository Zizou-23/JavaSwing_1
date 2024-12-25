package démo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demoframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	JLabel lblinfo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demoframe frame = new Demoframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Demoframe() {
		setForeground(new Color(255, 255, 255));
		setTitle("Démo javaSwing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(48, 23, 877, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(102, 114, 67, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(102, 187, 45, 27);
		contentPane.add(lblNewLabel_1);
		
		txtName = new JTextField();
		txtName.setBounds(205, 104, 249, 37);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setBounds(205, 187, 118, 27);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=txtName.getText();
				int age= Integer.parseInt(txtAge.getText());
				
				if(age<=18) {
					
					lblinfo.setText("Champion si tu touche à "+ name +" Misrété vas te dégouté");
				}else {
					lblinfo.setText(" Vas-y Champion tu peux pratiqué le rituel du AFOUMAME avec "+name +"sans soucis sauf si elle vas dire que tu l'as violé");
				}
			}
		});
		btnValider.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnValider.setBounds(156, 290, 113, 37);
		contentPane.add(btnValider);
		
		JButton btnEffacer = new JButton("Effacer");
		btnEffacer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtName.setText("");
				txtAge.setText("");
				lblinfo.setText("");
				
			}
		});
		btnEffacer.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnEffacer.setBounds(417, 290, 153, 48);
		contentPane.add(btnEffacer);
		
		lblinfo = new JLabel("");
		lblinfo.setBounds(78, 384, 759, 161);
		contentPane.add(lblinfo);
		
		JLabel lblNewLabel_2 = new JLabel("Formulaire du AFOUMAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(173, 39, 338, 37);
		contentPane.add(lblNewLabel_2);
	}
}
