package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappers {

	public static void main(String[] args) {
		
		int a = 5;
		
		Integer b = 5; // wrap -> embrulhar, empacotar, envolver
		
		Double x = 2.9;
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		
		Especialidade e1 = new Especialidade("Cardiologia");
		//e1.setNome("Cardiologia");
		e1.setDescricao("Não deixa ter um ataque.");
		
		Especialidade e2 = new Especialidade("Gastroenterologia");
		//e2.setNome();
		e2.setDescricao("Não deixa ficar com dor de barriga.");
		
		especialidades.add(e1);
		especialidades.add(e2);
		
		Especialidade e3 = new Especialidade("Fisioterapia");
		//e3.setNome();
		e3.setDescricao("Não deixa ficar com dor nas costas.");
		
		especialidades.add(e3);
		
		Especialidade e4 = new Especialidade("Clínico geral");
		//e4.setNome();
		e4.setDescricao("Sabe de tudo um pouco e um pouco de tudo!");
		
		//Especialidade[] especialidades = {e1, e2, e3, e4};
		
		Especialidade e5 = new Especialidade("Pediatria");
		//e5.setNome();
		e5.setDescricao("Sabe cuidar das criancinhas!");
		
		especialidades.add(e4);
		especialidades.add(e5);
		
		System.out.println(especialidades.size());
		
		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(50);
		notas.add(14);
		notas.add(90);
		notas.add(87);
		System.out.println(notas.size());
		
		notas.add(91);
		notas.add(82);
		System.out.println(notas.size());
		
		//Queremos ver o nome da especialidade que está
		// na posição 3 do ArrayList especialidades
		System.out.println(especialidades.get(3).getNome());
		
		//Trocar o nome da especialidade que está
		//na posição 1 do ArrayList especialidades 
		//para "teste", exibir logo em seguida
		especialidades.get(1).setNome("teste");
		System.out.println(especialidades.get(1).getNome());
		
		Especialidade nova = especialidades.get(2);
		System.out.println(nova.getNome());
		
		
	}

}
