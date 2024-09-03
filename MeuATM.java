import javax.swing.*;
import java.util.*;

public abstract class MeuATM {

	protected double balance = 0;

	public void credit() {
		
		int optionDeposit = JOptionPane.showConfirmDialog(null, "Você quer depositar?", "Depósito", JOptionPane.YES_NO_OPTION);
		if(optionDeposit == JOptionPane.YES_OPTION) {
			double depositValue =  Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer depositar?"));	
			if(depositValue > 0) {
				balance += depositValue;
			} else {
				JOptionPane.showMessageDialog(null, "Insira uma valor válido");
			}
			currentValue();	
		}
		
	}
	
	public void withdraw() {
			
		int optionWithdraw = JOptionPane.showConfirmDialog(null, "Você quer sacar?", "Saque", JOptionPane.YES_NO_OPTION);
		if(optionWithdraw == JOptionPane.YES_OPTION) {
			double withdrawValue = Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer sacar?"));
			if(balance < withdrawValue) {
				JOptionPane.showMessageDialog(null, "Você não pode sacar mais do que tem!");
			}else {
				balance -= withdrawValue;
			}
			 currentValue();	
		} 
	}
	
	
	//ARRUMAR PARA MOSTRAR O NOME DA PESSOA QUE ESTÁ USANDO!!!
	public void currentValue() {
		JOptionPane.showMessageDialog(null, "Seu saldo atual é R$" + this.balance);
	}
	
	public void transference(Humans p1,Humans p2) {
		int optionTransference = JOptionPane.showConfirmDialog(null, "Você quer transferir?", "Transferência", JOptionPane.YES_NO_OPTION);
		if(optionTransference == JOptionPane.YES_OPTION) {
			double transValue = Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer transferir?"));
			if(transValue > 0 && transValue <= p1.balance) {
				
				p1.balance -= transValue;
				p2.balance += transValue;
			}
			currentValue();
		}
	}
	
	
	public void allMethods(Humans tp1, Humans tp2) {
		
		currentValue();
		credit();
		withdraw();	
		transference(tp1, tp2);
		
	}
	
}
