package ui;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

import controller.QuanlydonNV;
import entities.NhanVien;

//import java.awt.event.KeyAdapter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GuiDangNhap extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTaiKhoan;
	private JTextField txtMatKhau;
	private JButton btnDangNhap, btnThoat; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiDangNhap frame = new GuiDangNhap();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiDangNhap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("Phần Mềm Quản Lý đơn Xin Nghỉ Phép");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setBackground(Color.WHITE);
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblLogin.setBounds(174, 10, 329, 45);
		contentPane.add(lblLogin);

		JLabel lblTaiKhoan = new JLabel("Tài Khoản : ");
		lblTaiKhoan.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblTaiKhoan.setBounds(58, 69, 63, 13);
		contentPane.add(lblTaiKhoan);

		txtTaiKhoan = new JTextField();
		txtTaiKhoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent taikhoan) {
				JOptionPane.showMessageDialog(txtTaiKhoan, "fm", "ft", JOptionPane.YES_NO_OPTION);
				;
			}
		});
		txtTaiKhoan.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtTaiKhoan.setBounds(128, 65, 161, 19);
		contentPane.add(txtTaiKhoan);
		txtTaiKhoan.setColumns(10);

		JLabel lblMatKhau = new JLabel("Mật Khẩu : ");
		lblMatKhau.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblMatKhau.setBounds(58, 115, 81, 13);
		contentPane.add(lblMatKhau);

		txtMatKhau = new JTextField();
		txtMatKhau.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtMatKhau.setBounds(128, 112, 161, 19);
		contentPane.add(txtMatKhau);
		txtMatKhau.setColumns(10);

		btnDangNhap = new JButton("Đăng Nhập");
		btnDangNhap.setBackground(Color.WHITE);
		btnDangNhap.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnDangNhap.setBounds(76, 196, 109, 21);
		contentPane.add(btnDangNhap);
		btnDangNhap.addActionListener(this);

		btnThoat = new JButton("Thoát");
		btnThoat.setBackground(Color.WHITE);
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnThoat.setBounds(276, 196, 110, 21);
		contentPane.add(btnThoat);
		btnThoat.addActionListener(this);

		// connectDB.Database.getInstance().connection();
	}

	@Override
	public void actionPerformed(ActionEvent t) {
		if (t.getSource().equals(btnThoat)) {
			System.exit(0);
		}
		if (t.getSource().equals(btnDangNhap)) {
			GuiDonXinNghi xn = new GuiDonXinNghi();
			xn.setVisible(true);
		}
	}
}
