package baitaptuan4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class BookSuppliers extends JFrame {

	private JPanel contentPane;
	private JTextField txtSupplierID;
	private JTextField txtSupplierName;
	private JTextField txtAddress;
	private JTextField txtContactNo;
	private JTextField txtEmailID;
	private JTable table;

	ModelBook modelBook = new ModelBook();
	List<Book> books = modelBook.getAllBookSuppliers();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookSuppliers frame = new BookSuppliers();
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
	public BookSuppliers() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 51));
		panel_1.setBounds(0, 0, 698, 51);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblBookSuppliers = new JLabel("Book Suppliers");
		lblBookSuppliers.setForeground(Color.WHITE);
		lblBookSuppliers.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBookSuppliers.setBounds(250, 13, 186, 25);
		panel_1.add(lblBookSuppliers);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 52, 698, 305);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 13, 546, 279);
		panel_2.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblSupplierID = new JLabel("Supplier ID");
		lblSupplierID.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSupplierID.setBounds(12, 16, 94, 16);
		panel_4.add(lblSupplierID);

		JLabel lblSupplierName = new JLabel("Supplier Name");
		lblSupplierName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSupplierName.setBounds(12, 51, 94, 16);
		panel_4.add(lblSupplierName);

		JLabel lblSupplierType = new JLabel("Supplier Type");
		lblSupplierType.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSupplierType.setBounds(12, 80, 94, 16);
		panel_4.add(lblSupplierType);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddress.setBounds(12, 109, 94, 16);
		panel_4.add(lblAddress);

		JLabel lblContactNo = new JLabel("Contact No");
		lblContactNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContactNo.setBounds(12, 143, 94, 16);
		panel_4.add(lblContactNo);

		JLabel lblEmailID = new JLabel("Email ID");
		lblEmailID.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmailID.setBounds(12, 178, 77, 16);
		panel_4.add(lblEmailID);

		txtSupplierID = new JTextField();
		txtSupplierID.setBounds(118, 13, 368, 22);
		panel_4.add(txtSupplierID);
		txtSupplierID.setColumns(10);

		txtSupplierName = new JTextField();
		txtSupplierName.setBounds(118, 48, 368, 22);
		panel_4.add(txtSupplierName);
		txtSupplierName.setColumns(10);

		JCheckBox ckBooks = new JCheckBox("Books");
		ckBooks.setFont(new Font("Tahoma", Font.BOLD, 13));
		ckBooks.setBounds(114, 76, 67, 25);
		panel_4.add(ckBooks);

		JCheckBox ckNewsPapers = new JCheckBox("News Papers");
		ckNewsPapers.setFont(new Font("Tahoma", Font.BOLD, 13));
		ckNewsPapers.setBounds(185, 76, 113, 25);
		panel_4.add(ckNewsPapers);

		JCheckBox ckJournalsAndMagazines = new JCheckBox("Journals and Magazines");
		ckJournalsAndMagazines.setFont(new Font("Tahoma", Font.BOLD, 13));
		ckJournalsAndMagazines.setBounds(302, 76, 184, 25);
		panel_4.add(ckJournalsAndMagazines);

		txtAddress = new JTextField();
		txtAddress.setBounds(118, 109, 368, 22);
		panel_4.add(txtAddress);
		txtAddress.setColumns(10);

		txtContactNo = new JTextField();
		txtContactNo.setBounds(118, 140, 368, 22);
		panel_4.add(txtContactNo);
		txtContactNo.setColumns(10);

		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(118, 208, 368, 58);
		panel_4.add(txtArea);

		JLabel lblRemarks = new JLabel("Remarks");
		lblRemarks.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRemarks.setBounds(12, 207, 56, 16);
		panel_4.add(lblRemarks);

		txtEmailID = new JTextField();
		txtEmailID.setBounds(118, 175, 368, 22);
		panel_4.add(txtEmailID);
		txtEmailID.setColumns(10);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(570, 13, 116, 279);
		panel_2.add(panel_5);
		panel_5.setLayout(null);

		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSupplierID.setText("");
				txtSupplierName.setText("");
				ckBooks.setSelected(false);
				ckJournalsAndMagazines.setSelected(false);
				ckNewsPapers.setSelected(false);
				txtAddress.setText("");
				txtContactNo.setText("");
				txtEmailID.setText("");
				txtArea.setText("");
			}
		});
		btnNew.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNew.setBounds(12, 27, 97, 25);
		panel_5.add(btnNew);

		JButton btnSave = new JButton("Save");
		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://duyhieu:123456789aa@cluster0-g51qr.gcp.mongodb.net/test?retryWrites=true&w=majority");

		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("demobooksupplier");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MongoCollection<Document> collection = database.getCollection("Book");
				Document document = new Document();
				Document supplierType = new Document();

				document.append("supplierId", txtSupplierID.getText());
				document.append("supplierName", txtSupplierName.getText());

				if (ckBooks.isSelected()) {
					supplierType.append("books", ckBooks.getText());
				}
				if (ckNewsPapers.isSelected()) {

					supplierType.append("newsPapers", ckNewsPapers.getText());
				}
				if (ckJournalsAndMagazines.isSelected()) {
					supplierType.append("journalsAndMagazines", ckJournalsAndMagazines.getText());
				}
				document.append("supplierType", supplierType);

				document.append("address", txtAddress.getText());
				document.append("contactNo", txtContactNo.getText());
				document.append("emailId", txtEmailID.getText());
				document.append("remarks", txtArea.getText());
				
				collection.insertOne(document);
			}
			
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSave.setBounds(12, 92, 97, 25);
		panel_5.add(btnSave);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MongoCollection<Document> collection = database.getCollection("Book");
				Document document = null;
				document = collection.findOneAndDelete(document);

			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDelete.setBounds(12, 157, 97, 25);
		panel_5.add(btnDelete);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUpdate.setBounds(12, 220, 97, 25);
		panel_5.add(btnUpdate);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 356, 698, 144);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 698, 144);
		panel_3.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String selectedData = null;

				int[] selectedRow = table.getSelectedRows();
				int[] selectedColumns = table.getSelectedColumns();

				for (int i = 0; i < selectedRow.length; i++) {
					for (int j = 0; j < selectedColumns.length; j++) {
						selectedData = (String) table.getValueAt(selectedRow[i], selectedColumns[j]);
					}
				}
				System.out.println("Selected: " + selectedData);

			}
		});
		table.setBackground(new Color(255, 153, 255));
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "", "Supplier ID", "Supplier Name",
				"Books", "News Papers", "Journals and Magazines", "Address", "Contact No", "Email ID", "Remarks" }) {
			Class[] columnTypes = new Class[] { Object.class, String.class, String.class, String.class, String.class,
					String.class, String.class, Integer.class, String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false, false, false,
					true };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		table.getColumnModel().getColumn(1).setPreferredWidth(81);
		table.getColumnModel().getColumn(2).setPreferredWidth(118);
		table.getColumnModel().getColumn(4).setPreferredWidth(92);
		table.getColumnModel().getColumn(5).setPreferredWidth(153);
		table.getColumnModel().getColumn(6).setPreferredWidth(84);
		table.getColumnModel().getColumn(7).setPreferredWidth(95);
		table.getColumnModel().getColumn(8).setPreferredWidth(101);
		
		scrollPane.setColumnHeaderView(table);
		scrollPane.setViewportView(table);
		
		loadTable();

		
	}

	public void loadTable() {
		DefaultTableModel defaultTableModel = (DefaultTableModel) table.getModel();
		
		Object rowData[] = new Object[10];
		for (Book b : books) {
			rowData[1] = b.getSupplierId();
			rowData[2] = b.getSupplierName();
			rowData[3] = b.getSupplierType().getBooks();
			rowData[4] = b.getSupplierType().getNewsPapers();
			rowData[5] = b.getSupplierType().getJournalsAndMagazines();
			rowData[6] = b.getAddress();
			rowData[7] = b.getContactNo();
			rowData[8] = b.getEmailId();
			rowData[9] = b.getRemarks();
			defaultTableModel.addRow(rowData);

		}
	}
}
