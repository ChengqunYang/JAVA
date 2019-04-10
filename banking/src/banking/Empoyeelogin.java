package banking;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Panel;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Empoyeelogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empoyeelogin frame = new Empoyeelogin();
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
	public Empoyeelogin() {
		setTitle("\u5458\u5DE5\u767B\u5F55\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);// 界面中心显示

		JButton button = new JButton("\u767B\u5F55");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*if (textField.getText().equals("") | passwordField.equals("")) {
					JOptionPane.showMessageDialog(null, "不能为空！");
				} else {
					int id = Integer.valueOf(textField.getText()).intValue();
					@SuppressWarnings("deprecation")
					int password = Integer.valueOf(passwordField.getText()).intValue();
					Sqloperate sqlo = new Sqloperate();
					try {
						if (sqlo.EmployeeloginY(id, password) == password) {
							JOptionPane.showMessageDialog(null, "登录成功！");
							dispose();
							Employee.main(null);
						} else {
							JOptionPane.showMessageDialog(null, "用户名或密码错误！");
						}
					} catch (HeadlessException | ClassNotFoundException | SQLException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}*/
				Employee.main(null);
			}
		});
		button.setBounds(35, 149, 138, 34);
		contentPane.add(button);

		textField = new JTextField();
		textField.setBounds(139, 38, 216, 34);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(139, 102, 216, 34);
		contentPane.add(passwordField);

		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(35, 46, 72, 18);
		contentPane.add(label);

		JLabel lblNewLabel = new JLabel("\u5BC6\u7801");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(35, 110, 72, 18);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("\u53D6\u6D88");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login.main(null);
			}
		});
		btnNewButton.setBounds(153, 206, 138, 34);
		contentPane.add(btnNewButton);

		JButton button_1 = new JButton("\u6CE8\u518C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				RegisterE.main(null);
			}
		});
		button_1.setBounds(260, 149, 138, 34);
		contentPane.add(button_1);
	}
}
