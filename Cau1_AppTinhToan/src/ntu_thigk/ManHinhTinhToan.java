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
	private JTextField textTuoi;



	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpSTh_1 = new JLabel("Nhập vào chiều cao(Số m . Số Cm)");
		lblNhpSTh_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh_1.setBounds(24, 73, 272, 38);
		contentPane.add(lblNhpSTh_1);
		
		JLabel lblNhpSTh = new JLabel("Nhập vào cân nặng");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(24, 134, 213, 38);
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
		txtB.setBounds(328, 138, 291, 31);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JButton btnChia = new JButton("Tính BMI");
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
		txtA.setBounds(328, 77, 291, 31);
		contentPane.add(txtA);
		
		JLabel lblNewLabel = new JLabel("Tuổi");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(63, 34, 73, 28);
		contentPane.add(lblNewLabel);
		
		textTuoi = new JTextField();
		textTuoi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textTuoi.setColumns(10);
		textTuoi.setBounds(328, 33, 291, 31);
		contentPane.add(textTuoi);
	} 
	
	void hamXuLyTinhBMI() {
		
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		String str_tuoi = textTuoi.getText();
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		Double soTuoi = Double.parseDouble(str_tuoi);
		
		if(soTuoi < 18) {
			textKetqua.setText("Không thể đưa ra kết quả BMI chính xác!");
			return;
		} 
		
		double tong = soB / (soA * soA);
			textKetqua.setText(String.valueOf(tong));
		
		
	}	
}
