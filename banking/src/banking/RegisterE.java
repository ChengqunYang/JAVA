package banking;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class RegisterE extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterE frame = new RegisterE();
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
	public RegisterE() {
		setTitle("\u5458\u5DE5\u6CE8\u518C");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);//界面中心显示
		
		textField = new JTextField();
		textField.setBounds(130, 40, 153, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 96, 153, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(44, 43, 72, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(44, 99, 72, 18);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 149, 153, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u9A8C\u8BC1\u7801\uFF1A");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(44, 152, 72, 18);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")|textField_1.getText().equals("")|textField_2.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "不能为空！");
				}
				else{
					int id =  Integer.valueOf(textField.getText()).intValue();
					int password = Integer.valueOf(textField_1.getText()).intValue();
					String no = textField_2.getText();
					try{
					if(textField.getText().length()>=6){
						if(textField_1.getText().length()>=6){
							if(no.equals("zhuce")){
								 new Sqloperate().insertemployee(id, password);
								 JOptionPane.showMessageDialog(null, "注册成功！");
								 dispose();
								 Empoyeelogin.main(null);
							}
							else{
								JOptionPane.showMessageDialog(null, "验证码错误");
							}
						}
						else{
							JOptionPane.showMessageDialog(null, "密码长度应不小于六位");
						}
					}
					else{
						JOptionPane.showMessageDialog(null, "用户名应不少于六位");
					}
					}catch(ClassNotFoundException|IOException|SQLException e1){
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setBounds(124, 204, 113, 27);
		contentPane.add(btnNewButton);
	}

}
