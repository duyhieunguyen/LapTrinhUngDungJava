package baitaptrenlop;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCommandException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DemoComboBox extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoComboBox frame = new DemoComboBox();
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
	public DemoComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 680, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel, "name_77197043294400");
		panel.setLayout(null);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setBounds(133, 53, 56, 16);
		panel.add(lblName);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddress.setBounds(133, 108, 56, 16);
		panel.add(lblAddress);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGender.setBounds(133, 162, 56, 16);
		panel.add(lblGender);

		JRadioButton rdbtnMale = new JRadioButton("Male");

		JRadioButton rdbtnFemale = new JRadioButton("Female");

		txtName = new JTextField();
		txtName.setBounds(230, 50, 246, 22);
		panel.add(txtName);
		txtName.setColumns(10);

		txtAddress = new JTextField();
		txtAddress.setBounds(234, 105, 242, 22);
		panel.add(txtAddress);
		txtAddress.setColumns(10);

		JLabel lblKnowledge = new JLabel("Knowledge");
		lblKnowledge.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblKnowledge.setBounds(133, 216, 75, 16);
		panel.add(lblKnowledge);

		JCheckBox chckbxJava = new JCheckBox("Java");
		chckbxJava.setBounds(235, 212, 113, 25);
		panel.add(chckbxJava);

		JCheckBox chckbxPython = new JCheckBox("Python");
		chckbxPython.setBounds(385, 212, 113, 25);
		panel.add(chckbxPython);

		JComboBox cbbComputerScience = new JComboBox();
		cbbComputerScience.setModel(new DefaultComboBoxModel(
				new String[] { "Computer Science", "Software Engineer", "Management", "Bussiness" }));
		cbbComputerScience.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://duyhieu:123456789aa@cluster0-g51qr.gcp.mongodb.net/test?retryWrites=true&w=majority");

		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("democombobox");
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Config config;
				try {

					List<Employee> listEmployee = new ArrayList<Employee>();
					MongoCollection<Document> collection = database.getCollection("Employee");

					Document document = new Document();
					document.append("name", txtName.getText());
					document.append("address", txtAddress.getText());
					document.append("gender", rdbtnMale.getText());
					document.append("gender", rdbtnFemale.getText());
					document.append("knowledge", chckbxJava.getText());
					document.append("knowledge", chckbxPython.getText());
					document.put("subject", cbbComputerScience.getSelectedItem());
					collection.insertOne(document);
//					collection.updateMany(new Document("name", lblName.getText()),new Document("address", lblAddress.getText()));
				} catch (MongoCommandException ex) {

				}

			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSave.setBounds(179, 346, 97, 25);
		panel.add(btnSave);

//		

		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSubject.setBounds(133, 278, 56, 16);
		panel.add(lblSubject);

		cbbComputerScience.setToolTipText("");
		cbbComputerScience.setBounds(235, 275, 241, 22);
		panel.add(cbbComputerScience);

//		ButtonGroup buttonGroup = new ButtonGroup();
//		buttonGroup.add(rdbtnMale);
//		buttonGroup.add(rdbtnFemale);

		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnMale.isSelected()) {
					rdbtnFemale.setSelected(false);
					rdbtnMale.setSelected(true);
				}

			}
		});

		rdbtnMale.setBounds(235, 158, 127, 25);
		panel.add(rdbtnMale);

		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnFemale.isSelected()) {
					rdbtnFemale.setSelected(true);
					rdbtnMale.setSelected(false);
				}
			}
		});

		rdbtnFemale.setBounds(385, 158, 127, 25);
		panel.add(rdbtnFemale);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtAddress.setText("");
				rdbtnFemale.setSelected(false);
				rdbtnMale.setSelected(false);

				chckbxJava.setSelected(false);
				chckbxPython.setSelected(false);

				cbbComputerScience.setSelectedItem("Computer Science");

			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBounds(401, 346, 97, 25);
		panel.add(btnReset);

		setLocationRelativeTo(null);

	}
}
