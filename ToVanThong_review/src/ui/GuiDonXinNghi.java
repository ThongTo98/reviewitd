package ui;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import com.jgoodies.common.format.EmptyDateFormat;
import java.text.DateFormat;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;

public class GuiDonXinNghi extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtHoten;
	/**
	 * @wbp.nonvisual location=63,14
	 */
	private final JLabel lbltitle = new JLabel("Xin nghi phep");
	private JTextField txtNgaySinh;
	private JTextField textMaSo;
	private JTextField txtChucVu;
	/**
	 * @wbp.nonvisual location=363,114
	 */
//	private final EmptyDateFormat emptyDateFormat = new EmptyDateFormat((DateFormat) null);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiDonXinNghi frame = new GuiDonXinNghi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param <JCarlender>
	 */
	public <JCarlender> GuiDonXinNghi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("DON XIN NGHI PHEP ");
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewJgoodiesTitle.setBounds(243, 10, 173, 13);
		contentPane.add(lblNewJgoodiesTitle);
		
		JLabel lblLoimodau = new JLabel("Kinh gui ban lanh dao cong ty");
		lblLoimodau.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblLoimodau.setBounds(227, 33, 147, 13);
		contentPane.add(lblLoimodau);
		
		JLabel lblHoTen = new JLabel("Ten toi la :");
		lblHoTen.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblHoTen.setBounds(22, 55, 65, 13);
		contentPane.add(lblHoTen);
		
		txtHoten = new JTextField();
		txtHoten.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtHoten.setEnabled(false);
		txtHoten.setEditable(false);
		txtHoten.setBounds(97, 52, 96, 19);
		contentPane.add(txtHoten);
		txtHoten.setColumns(10);
		
		
		
		JLabel lblNgaySinh = new JLabel("Sinh ngay :");
		lblNgaySinh.setBackground(new Color(240, 240, 240));
		lblNgaySinh.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblNgaySinh.setBounds(22, 84, 65, 13);
		contentPane.add(lblNgaySinh);
		
		txtNgaySinh = new JTextField();
		txtNgaySinh.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtNgaySinh.setEditable(false);
		txtNgaySinh.setEnabled(false);
		txtNgaySinh.setBounds(97, 81, 96, 19);
		contentPane.add(txtNgaySinh);
		txtNgaySinh.setColumns(10);
		
		JLabel lblChuVu = new JLabel("Chuc Vu :");
		lblChuVu.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblChuVu.setBounds(22, 112, 45, 13);
		contentPane.add(lblChuVu);
		
		JLabel lblMaSo = new JLabel("Ma so :");
		lblMaSo.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblMaSo.setBounds(290, 55, 45, 13);
		contentPane.add(lblMaSo);
		
		JLabel lblLyDo = new JLabel("Ly do xin nghi :");
		lblLyDo.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblLyDo.setBounds(22, 146, 76, 13);
		contentPane.add(lblLyDo);
		
		JTextArea txtLyDo = new JTextArea();
		txtLyDo.setFont(new Font("Monospaced", Font.ITALIC, 13));
		txtLyDo.setBounds(97, 146, 466, 68);
		contentPane.add(txtLyDo);
		
		JLabel lblThoigianbatdau = new JLabel("Thoi gian nghi :");
		lblThoigianbatdau.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblThoigianbatdau.setBounds(290, 84, 84, 13);
		contentPane.add(lblThoigianbatdau);
	
	

		
		
		JLabel lblThoigianketthuc = new JLabel("Den ngay :");
		lblThoigianketthuc.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblThoigianketthuc.setBounds(290, 112, 76, 13);
		contentPane.add(lblThoigianketthuc);
		
		JLabel lblCamOn = new JLabel("Xin chan thanh cam on !");
		lblCamOn.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblCamOn.setBounds(337, 235, 139, 13);
		contentPane.add(lblCamOn);
		
		JButton btnNop = new JButton("Nop");
		btnNop.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNop.setBounds(74, 304, 139, 21);
		contentPane.add(btnNop);
		
		JButton btnHuy = new JButton("Huy");
		btnHuy.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnHuy.setBounds(227, 304, 131, 21);
		contentPane.add(btnHuy);
		
		textMaSo = new JTextField();
		textMaSo.setFont(new Font("Tahoma", Font.ITALIC, 10));
		textMaSo.setEnabled(false);
		textMaSo.setEditable(false);
		textMaSo.setBounds(337, 56, 96, 19);
		contentPane.add(textMaSo);
		textMaSo.setColumns(10);
		
		txtChucVu = new JTextField();
		txtChucVu.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtChucVu.setEnabled(false);
		txtChucVu.setEditable(false);
		txtChucVu.setBounds(97, 109, 96, 19);
		contentPane.add(txtChucVu);
		txtChucVu.setColumns(10);
		
		JDateChooser dateNgaybd = new JDateChooser();
		dateNgaybd.setBounds(368, 78, 73, 19);
		contentPane.add(dateNgaybd);
		
		JDateChooser dateNgaykt = new JDateChooser();
		dateNgaykt.setBounds(368, 107, 73, 19);
		contentPane.add(dateNgaykt);
		
		JButton btnDuyetDon = new JButton("Duyệt Danh Sách");
		btnDuyetDon.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnDuyetDon.setBounds(376, 304, 128, 21);
		contentPane.add(btnDuyetDon);
		
		
	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
