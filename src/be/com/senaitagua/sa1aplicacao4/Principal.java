package be.com.senaitagua.sa1aplicacao4;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1app4.Pessoa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JOptionPane.showMessageDialog(null, "Empresa Voe, Grupo Empresarial");
		
		Pessoa cbo = new Pessoa();
		
		JOptionPane.showMessageDialog(null, "Bonificações clientes especiais" + "\n" + cbo.divisao(5000)/10);
		
		

	}

}
