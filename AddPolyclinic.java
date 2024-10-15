package com.grup9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PoliklinikEkle extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Connection con;
	 PreparedStatement preparedStatement;
	 ResultSet resultSet;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PoliklinikEkle frame = new PoliklinikEkle();
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
	public PoliklinikEkle() {
		setTitle("Poliklinik Ekle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 303, 432);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Poliklinik Ekleme  Formu");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 289, 47);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Poliklinik Adı:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 69, 98, 32);
		panel.add(lblNewLabel_1);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setBounds(110, 69, 189, 32);
		panel.add(textArea1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Doktor Adı:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 133, 98, 32);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Hasta Sayısı:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(10, 192, 98, 32);
		panel.add(lblNewLabel_1_2);
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setBounds(110, 133, 189, 32);
		panel.add(textArea2);
		
		JTextArea textArea3 = new JTextArea();
		textArea3.setBounds(110, 192, 189, 32);
		panel.add(textArea3);
		
		JButton btnNewButton = new JButton("Vazgeç");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				 dispose();
				 anasayfa pencereListe=new anasayfa();
				 pencereListe.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnNewButton.setBounds(10, 327, 114, 41);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Kaydet");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 int hasta; // textAreadan gelen bilgi int'e çevrilecek
				 String pol,dok;
				 hasta= Integer.parseInt(textArea3.getText());
				 pol=textArea1.getText();
				 dok=textArea2.getText();
				 try {
					 preparedStatement=con.prepareStatement
			("INSERT INTO poliklinikler (poliklinikAdi,doktorAdi,hastaSayisi) VALUES(?,?,?) ");
					 preparedStatement.setString(1, pol);
					 preparedStatement.setString(2, dok);
					 preparedStatement.setInt(3, hasta);
					 preparedStatement.executeUpdate();
					 setVisible(false);
					 dispose();
					 anasayfa pencereListe=new anasayfa();
					 pencereListe.setVisible(true);
					 
					 
				 }catch (SQLException ex) {
					// TODO: handle exception
					 throw new RuntimeException(ex);
				}
				
				
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(164, 327, 114, 41);
		panel.add(btnNewButton_1);
		con = myJDBC.vbBaglan();
	}
}
