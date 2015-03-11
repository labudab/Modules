package ru.labudaborislav.autorizmod;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField; 

import by.zti.SerializationManager;

// import by.zti.SerializationManager;

public class RegistrationWindow extends JFrame{
	private static ArrayList<RegData> regcollection = new ArrayList<RegData>();
	JTextField logn, passn, group;
	JLabel inlogn, inpassn, statreg, groupn, regstat;
	JButton back, regnown;
	reactclas reacttoreg = new reactclas();
	@SuppressWarnings("unchecked")
	
	public RegistrationWindow(){
		super("Регистрация нового пользователя");
		RegData regData = new RegData();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
		regstat = new JLabel("Регистрация нового пользователя");
		regstat.setSize(250,25);
		regstat.setLocation(100,50);
		logn = new JTextField(16);
		logn.setSize(160,25);
		logn.setLocation(200,120);
		inlogn = new JLabel("Введите логин:");
		inlogn.setSize(160,25);
		inlogn.setLocation(80,120);
		passn = new JTextField(16);
		passn.setSize(160,25);
		passn.setLocation(200,160);
		inpassn = new JLabel("Введите пароль:");
		inpassn.setSize(160,25);
		inpassn.setLocation(80,160);
		group = new JTextField(2);
		group.setSize(160,25);
		group.setLocation(200,200);
		groupn = new JLabel("Группа:");
		groupn.setSize(160,25);
		groupn.setLocation(80,200);
		back = new JButton("Назад");
		back.setSize(80,20);
		back.setLocation(50,250);
		regnown = new JButton("Зарегистрировать");
		regnown.setSize(220,20);
		regnown.setLocation(140,250);
		mainPanel.add(inlogn);
		mainPanel.add(logn);
		mainPanel.add(inpassn);
		mainPanel.add(passn);
		mainPanel.add(back);
		mainPanel.add(regnown);
		mainPanel.add(group);
		mainPanel.add(groupn);
		mainPanel.add(regstat);
		back.addActionListener(reacttoreg);
		regnown.addActionListener(reacttoreg);
		setContentPane(mainPanel);
//		regData.setLoginreg(JOptionPane.showInputDialog(null, "Введите логин: "));	
		System.out.println("Данные из опшенпейна:" +regData.getLoginreg());	
	}
//		public void SerialData() {
//		regcollection = (ArrayList<RegData>) SerializationManager.deSerializeData("users","dat","Data//");
//		System.out.println(regcollection.size());
//		RegData regMetod = new RegData();
//		regMetod.setLoginreg(logn.getText());
//		regMetod.setPassreg(passn.getText());
//		System.out.println(regMetod.getLoginreg() + "Это логин");
//		regMetod.setLoginreg(JOptionPane.showInputDialog(null, "Login"));
//		regMetod.setPassreg(JOptionPane.showInputDialog(null, "Password"));
//		regcollection.add(regMetod);
//		for(RegData p : regcollection){
//		System.out.println("Данные из DataToFile: "+p.getLoginreg()+" "+p.getPassreg()+" "+p.getGrpreg());
//		}
//		System.out.println(regcollection.size());
//		SerializationManager.serializeData(regcollection,"users","dat","Data//");
//	}
	
	
//	public class ToRegData{
//		public ToRegData(){
//			RegData regData = new RegData();
//			regData.setLoginreg(logn.getText());
//			regData.setPassreg(passn.getText());
//			regData.setGrpreg(group.getText());
//			System.out.println("Данные из слушателя:" +regData.getLoginreg());
//			System.out.println("Данные из слушателя:" +regData.getPassreg());
//			System.out.println("Данные из слушателя:" +regData.getGrpreg());
//			JOptionPane.showMessageDialog(null, "Данные получены");
//			DataToFile regOp = new DataToFile();
//		}
//	}
	
	public class reactclas implements ActionListener{
			String FromAct;
			public void actionPerformed(ActionEvent e){
			if(e.getSource()==back){
				JFrame HelloW = new HelloWindow();
				setVisible(false);
				HelloW.setVisible(true);
		
			}
		if(e.getSource()==regnown){
			RegData regData = new RegData();
			regData.setLoginreg(logn.getText());
			regData.setPassreg(passn.getText());
			regData.setGrpreg(group.getText());;
			DataToFile DatOP = new DataToFile();
//			regData.setLoginreg(null);
//			regData.setPassreg(null);
//			regData.setGrpreg(null);
//			RegistrationWindow DatOP = new RegistrationWindow();
//			DatOP.SerialData();
//			ToRegData ActToReg = new ToRegData();			
			}
	
}
	}
	
	
}
