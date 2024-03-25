package ntu_thigk;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textKetqua;
	private JTextField txtB;
	private JTextField txtA;



	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpSTh_1 = new JLabel("Nhập vào chiều cao");
		lblNhpSTh_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh_1.setBounds(47, 73, 213, 38);
		contentPane.add(lblNhpSTh_1);
		
		JLabel lblNhpSTh = new JLabel("Nhập vào cân nặng");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(47, 134, 213, 38);
		contentPane.add(lblNhpSTh);
		
		textKetqua = new JTextField();
		textKetqua.setEditable(false);
		textKetqua.setEnabled(false);
		textKetqua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textKetqua.setBounds(231, 301, 291, 31);
		contentPane.add(textKetqua);
		textKetqua.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setBounds(231, 134, 291, 31);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JButton btnChia = new JButton("Tính");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				hamXuLyTinhBMI();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(283, 215, 130, 38);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("KẾT QUẢ TÍNH TOÁN: ");
		lblKtQuTnh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(47, 297, 213, 38);
		contentPane.add(lblKtQuTnh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setColumns(10);
		txtA.setBounds(231, 77, 291, 31);
		contentPane.add(txtA);
	} 
	
	void hamXuLyTinhBMI() {
		
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		
		if(soB==0) {
			textKetqua.setText("B không thể bằng 0!");
			return;
		} 
		
		double tong = soB / (soA * soA);
			textKetqua.setText(String.valueOf(tong));
		
		
	}	
}
