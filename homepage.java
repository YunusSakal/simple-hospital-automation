package com.grup9;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class anasayfa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table1;
	 Connection con;
	 PreparedStatement preparedStatement;
	 ResultSet resultSet;
	 private JTextField textField1;
	 private JTextField textField2;
	 private JTextField textField3;
	 private JTextField textField4;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					anasayfa frame = new anasayfa();
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
	public anasayfa() {
		setTitle("Hastane Otomasyonu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jpanel1 = new JPanel();
		jpanel1.setBackground(SystemColor.activeCaption);
		jpanel1.setBounds(0, 0, 593, 486);
		contentPane.add(jpanel1);
		jpanel1.setLayout(null);
		
		JScrollPane scrollTable = new JScrollPane();
		scrollTable.setBounds(198, 51, 385, 276);
		jpanel1.add(scrollTable);
		
		table1 = new JTable();
		scrollTable.setRowHeaderView(table1);
		
		JLabel lblNewLabel = new JLabel("Hastanemizdeki poliklinikler ve hasta sayıları :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(247, 17, 346, 29);
		jpanel1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ANA SAYFA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 18, 217, 22);
		jpanel1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Toplam Poliklinik Sayısı :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 80, 150, 30);
		jpanel1.add(lblNewLabel_2);
		
		textField1 = new JTextField();
		textField1.setBounds(10, 108, 150, 22);
		jpanel1.add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Toplam Hasta Sayısı : ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 141, 150, 30);
		jpanel1.add(lblNewLabel_3);
		
		textField2 = new JTextField();
		textField2.setBounds(10, 168, 150, 22);
		jpanel1.add(textField2);
		textField2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Yoğun Poliklinik Sayısı : ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 201, 150, 30);
		jpanel1.add(lblNewLabel_4);
		
		textField3 = new JTextField();
		textField3.setBounds(10, 242, 150, 22);
		jpanel1.add(textField3);
		textField3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Yoğun Olmayan Poliklinik Sayısı : ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 275, 190, 30);
		jpanel1.add(lblNewLabel_5);
		
		textField4 = new JTextField();
		textField4.setBounds(10, 305, 150, 22);
		jpanel1.add(textField4);
		textField4.setColumns(10);
		 con=myJDBC.vbBaglan();
		 getirBilgiler();
		  int sayac=0; int topHasta=0;
		  int yogun=0;
		  int yogundegil=0;
		 Statement ifade;
		try {
			ifade = con.createStatement();
			ResultSet x1=ifade.executeQuery("SELECT poliklinikAdi FROM poliklinikler");
		 while (x1.next()) {sayac++;}
		 ResultSet x2=ifade.executeQuery("SELECT * FROM poliklinikler");
		 while (x2.next()) { topHasta+= x2.getInt("hastaSayisi");
}
		 ResultSet x3 =ifade.executeQuery("SELECT * FROM poliklinikler");
		 while(x3.next()) {
			 if (x3.getInt("hastaSayisi")>50) {
				 yogun++;
			 }
			 else {
				yogundegil++;
			}
		 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 textField1.setText(String.valueOf(sayac));
		 textField2.setText(String.valueOf(topHasta));
		 textField3.setText(String.valueOf(yogun));
		 textField4.setText(String.valueOf(yogundegil));
		 
		 JButton ekle = new JButton("Poliklinik Ekle");
		 ekle.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {   
		 		
		 		 setVisible(false);
		 		 dispose();
		 		 PoliklinikEkle pencereEkle=new PoliklinikEkle();
		 		 pencereEkle.setVisible(true);
		 		
		 	}
		 });
		 ekle.setFont(new Font("Tahoma", Font.BOLD, 15));
		 ekle.setBounds(71, 381, 156, 51);
		 jpanel1.add(ekle);
		 
		 JButton sil = new JButton("Poliklinik Sil");
		 sil.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		JOptionPane degerAl = new JOptionPane();
				String str = degerAl.showInputDialog(sil,"Silinecek Polikliniğin ID numarası : ","Poliklinik Sil",JOptionPane.INFORMATION_MESSAGE);
				
				 try{
				 preparedStatement=con.prepareStatement("DELETE FROM poliklinikler WHERE id= ?"        );
				 preparedStatement.setString(1,str);
				 preparedStatement.executeUpdate();
				 getirBilgiler();

				 } catch(SQLException ex) {
				 throw new RuntimeException(ex);
				 }
		 		int sutun= 1;
		 		 int satir = table1.getSelectedRow();
		 		 String ogrenci_id= table1.getModel().getValueAt(satir, sutun).toString();
		 		 try{
		 		 preparedStatement=con.prepareStatement("DELETE FROM poliklinikler WHERE id= ?");
		 		 preparedStatement.setString(1,ogrenci_id);
		 		 preparedStatement.executeUpdate();
		 		 getirBilgiler();
		 		 }
		 		 catch (SQLException ex) {
throw new RuntimeException(ex);				}
		 		
		 		
		 		
		 		
		 		
		 	}
		 });
		 sil.setFont(new Font("Tahoma", Font.BOLD, 15));
		 sil.setBounds(328, 381, 156, 51);
		 jpanel1.add(sil);

		 }
		
	
	void getirBilgiler() {
		try {
			preparedStatement=con.prepareStatement("SELECT id,doktorAdi,poliklinikAdi,hastaSayisi FROM poliklinikler");
			resultSet=preparedStatement.executeQuery();
			table1.setModel(DbUtils.resultSetToTableModel(resultSet));
		} catch (SQLException e) {
			 throw new RuntimeException(e);		}
	}
}
