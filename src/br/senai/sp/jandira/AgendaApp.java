package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {
		
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		especialidade.setDescricao("O médico especialista nessa área é o cardiologista. Que cuida do coração.");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		especialidade2.setDescricao("O médico especialista nessa área é o otorrinolaringologista. Que cuida do ouvido, garganta, etc.");
		
		JOptionPane.showMessageDialog(null, especialidade2.getNome());
		JOptionPane.showMessageDialog(null, especialidade2.getDescricao());
		System.out.println(especialidade.getNome());
		System.out.println(especialidade.getDescricao());
		
		PlanoDeSaude plano = new PlanoDeSaude();
		plano.setOperadora("NotreDame");
		plano.setCategoria("Prata");
		plano.setNumero("571189104011");
		plano.setValidade(null);
		
		System.out.println(plano.getOperadora());
		System.out.println(plano.getCategoria());
		System.out.println(plano.getNumero());
		System.out.println(plano.getValidade());
	}

}
