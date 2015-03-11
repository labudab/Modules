package ru.labudaborislav.autorizmod;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import by.zti.SerializationManager;

public class DataToFile {
	private static ArrayList<RegData> regcollection = new ArrayList<RegData>();
	@SuppressWarnings("unchecked")
	public DataToFile() {
		RegistrationWindow FromReg = new RegistrationWindow();
		System.out.println(regcollection.size());		
		RegData regMetod = new RegData();
//		regMetod.setLoginreg(FromReg.logn.getText());
//		regMetod.setPassreg(FromReg.passn.getText());
//		System.out.println(regMetod.getLoginreg() + "Это логин");
//		regMetod.setLoginreg(JOptionPane.showInputDialog(null, "Login"));
//		regMetod.setPassreg(JOptionPane.showInputDialog(null, "Password"));
		regcollection.add(regMetod);
		for(RegData p : regcollection){
		System.out.println("Данные из DataToFile: " +p.getLoginreg()+ " " +p.getPassreg()+ " " +p.getGrpreg());
		}
		System.out.println(regcollection.size());
		SerializationManager.serializeData(regcollection,"users","dat","Data//");	
	}
	
}
