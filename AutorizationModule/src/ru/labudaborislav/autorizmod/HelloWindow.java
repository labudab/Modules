package ru.labudaborislav.autorizmod;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HelloWindow extends JFrame{
	
	JTextField log, pass;
	JLabel inlog, inpass;
	JButton gostart, regnow;
	reactclas reacttoreg = new reactclas();
	
	public HelloWindow(){
		super("Авторизация");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
//		mainPanel.setLayout(new GridLayout (3, 2, 5, 20));
		//		setLayout(new FlowLayout());
		log = new JTextField(16);
		log.setSize(160,25);
		log.setLocation(200,120);
		inlog = new JLabel("Введите логин:");
		inlog.setSize(160,25);
		inlog.setLocation(80,120);
		pass = new JTextField(16);
		pass.setSize(160,25);
		pass.setLocation(200,160);
		inpass = new JLabel("Введите пароль:");
		inpass.setSize(160,25);
		inpass.setLocation(80,160);
		gostart = new JButton("Войти");
		gostart.setSize(80,20);
		gostart.setLocation(50,250);
		regnow = new JButton("Регистрация пользователя");
		regnow.setSize(220,20);
		regnow.setLocation(140,250);
		mainPanel.add(inlog);
		mainPanel.add(log);
		mainPanel.add(inpass);
		mainPanel.add(pass);
		mainPanel.add(gostart);
		mainPanel.add(regnow);
		regnow.addActionListener(reacttoreg);
		setContentPane(mainPanel);
		
	}
	
	public class reactclas implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JFrame RegW = new RegistrationWindow();
//			JFrame HelloW = new HelloWindow();
			if(e.getSource()==regnow){
				setVisible(false);
				RegW.setVisible(true);
				
			}
		}
		
	}
}
