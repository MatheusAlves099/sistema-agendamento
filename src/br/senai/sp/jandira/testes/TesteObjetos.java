package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

    public static void main(String[] args) {

        Especialidade e1 = new Especialidade("Cardiologia");
        //e1.setNome("Cardiologia");
        e1.setDescricao("Não deixa ter um ataque.");

        Especialidade e2 = new Especialidade();
        e2.setNome("Gastro");
        e2.setDescricao("Não deixa ficar com dor de barriga.");

        Especialidade e3 = new Especialidade();
        e3.setNome("Qualquer coisa!");

        Especialidade e4 = new Especialidade("Otorrino", "Cuida do ouvido!");
        
        Especialidade e5 = new Especialidade();
        e5.setNome("Clinico Geral");
        
        // exibir a quantidade de especialidades criadas até agora
        System.out.println("TOTAL DE ESPECIALIDADES ----> " + e1.getContador());
        System.out.println(e1.getCodigo() + " - " + e1.getNome());
        System.out.println(e2.getCodigo() + " - " + e2.getNome());
        System.out.println(e3.getCodigo() + " - " + e3.getNome());
        System.out.println(e4.getCodigo() + " - " + e4.getNome());
        System.out.println(e5.getCodigo() + " - " + e5.getNome());
        
        ArrayList<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        System.out.println(especialidades.size());

        // imprimir no console o nome das especialidades
        // que estão armazenadas no ArrayList
        int i = 0;
        while (i < especialidades.size()) {
            System.out.println(especialidades.get(i).getNome());
            i++;
        }

        // utilização do for para iteração (repetir) no ArrayList
//		for(contador;condição;acumulador) {
//		}
        System.out.println("--------- FOR ----------");
        for (int x = 0; x < especialidades.size(); x++) {
            System.out.println(especialidades.get(x).getNome());
        }

        // FOR EACH -> para cada
        System.out.println("--------- FOR EACH ----------");
        for (Especialidade e : especialidades) {
            System.out.println(e.getNome());
        }

        // criar 3 planos de saúde, armazenar em um arrayList
        // e exibir o nome da operadora de cada um deles
        PlanoDeSaude p1 = new PlanoDeSaude("Intermédica");
        PlanoDeSaude p2 = new PlanoDeSaude("Unimed");
        PlanoDeSaude p3 = new PlanoDeSaude("Bradesco");

        ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
        planosDeSaude.add(p1);
        planosDeSaude.add(p2);
        planosDeSaude.add(p3);

        System.out.println("--------- FOR EACH ----------");
        for (PlanoDeSaude p : planosDeSaude) {
            System.out.println(p.getOperadora());
            System.out.println(p.getQuantidade());
        }

        System.out.println("-----" + PlanoDeSaude.getQuantidade());

        AgendaApp.main(args);

        System.out.println("-----" + PlanoDeSaude.getQuantidade());
    }
}