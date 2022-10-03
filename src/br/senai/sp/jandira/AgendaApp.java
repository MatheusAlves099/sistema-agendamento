package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

    public static void main(String[] args) {

        // criar um objeto plano de saúde
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora("Intermédica");
        planoDeSaude.setCategoria("Ouro");
        planoDeSaude.setNumero("1240-1420-1414");
        planoDeSaude.setValidade(LocalDate.of(2026, 9, 10));

        PlanoDeSaude planoDeSaude2 = new PlanoDeSaude();
        planoDeSaude2.setOperadora("Unimed");
        planoDeSaude2.setCategoria("Ouro");
        planoDeSaude2.setNumero("1240-1420-1414");
        planoDeSaude2.setValidade(LocalDate.of(2026, 9, 10));

        // criar um objeto endereço
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua Chile");
        endereco.setNumero("299");
        endereco.setBairro("Jardim Santa Rita");
        endereco.setCidade("Itapevi");
        endereco.setCep("06660-300");
        endereco.setEstado(Estados.SAO_PAULO);
        endereco.setComplemento("Casa");

        // criar um objeto paciente
        Paciente paciente = new Paciente();
        paciente.setNome("Joaquin da Silva");
        paciente.setDataDeNascimento(LocalDate.of(1986, 5, 23));
        paciente.setTelefone("(11) 94232-9872");
        paciente.setRg("420.419-1");
        paciente.setCpf("240.145.014-88");
        paciente.setEndereco(endereco);
        paciente.setPlanoDeSaude(planoDeSaude);

        Paciente paciente2 = new Paciente();
        paciente2.setNome("Patrícia da Silva");
        paciente2.setDataDeNascimento(LocalDate.of(1983, 2, 20));
        paciente2.setTelefone("(11) 94232-9832");
        paciente2.setRg("420.421-1");
        paciente2.setCpf("210.145.014-88");
        paciente2.setEndereco(endereco);
        paciente2.setPlanoDeSaude(planoDeSaude2);

        // Exibir os dados do paciente
        // nome do paciente: ??
        // tel do paciente: ??
        // operadora do plano de saúde: ??
        // categoria do plano de saúde: ??
        // cidade do paciente: ??
        // estado do paciente: ??
        //	System.out.println("Nome do paciente: " + paciente.getNome());
        //	System.out.println("Telefone do paciente: " + paciente.getTelefone());
        //	System.out.println("Operadora do plano de saúde: " + paciente.getPlanoDeSaude().getOperadora());
        //	System.out.println("Categoria do plano de saúde: " + paciente.getPlanoDeSaude().getCategoria());
        //	System.out.println("Cidade do paciente: " + endereco.getCidade());
        //	System.out.println("Estado do paciente: " + endereco.getEstado());
        // criar especialidades
        Especialidade especialidade1 = new Especialidade();
        especialidade1.setNome("Cardiologia");
        especialidade1.setDescricao("Cuida do coração.");

        Especialidade especialidade2 = new Especialidade();
        especialidade2.setNome("Otorrinolaringologia");
        especialidade2.setDescricao("Cuida da garganta, ouvido, etc...");

        Especialidade especialidade3 = new Especialidade();
        especialidade3.setNome("Clinica Geral");
        especialidade3.setDescricao("Sabe de tudo um pouquinho.");

        Especialidade especialidade4 = new Especialidade();
        especialidade4.setNome("Fisioterapia");
        especialidade4.setDescricao("Cuida dos ossos e dos músculos.");

        // criar um objeto médico
        Medico medico1 = new Medico();
        medico1.setNome("Ana Maria");
        medico1.setEmail("ana@gmail.com");
        medico1.setTelefone("(11)95024-4256");
        medico1.setCrm("4214-2");
        Especialidade[] especialidades1 = {especialidade1, especialidade3};
        medico1.setEspecialidades(especialidades1);

        Medico medico2 = new Medico();
        medico2.setNome("Roberto Carlos");
        medico2.setEmail("rocar123@gmail.com");
        medico2.setTelefone("(11)92042-1414");
        medico2.setCrm("1144-2");
        Especialidade[] especialidades2 = {especialidade1, especialidade2, especialidade3, especialidade4};
        medico1.setEspecialidades(especialidades2);

        // exibir as especialidades de cada médico
        // nome do médico: ??
        // especialidade 1: ??
        // especialidade 2: ??
        // especialidade 3 ?? 
        //	System.out.println("Nome do médico: " + medico1.getNome());
        //	int contador = 0;
        //	while (contador < medico1.getEspecialidades().length) {
        //		System.out.println("Especialidade " + (contador+1) + " - " + medico1.getEspecialidades()[contador].getNome());
        //		contador++;
        //	}
        //	System.out.println("Nome do médico: " + medico2.getNome());
        //	contador = 0;
        //	while (contador < medico2.getEspecialidades().length) {
        //		System.out.println("Especialidade " + (contador+1) + " - " + medico2.getEspecialidades()[contador].getNome());
        //		contador++;
        //	}
        // fazer o agendamento do paciente Joaquin da Silva
        // com um cardiologista para o dia 27/09/2022
        // as 14h15
        Agenda agenda1 = new Agenda();
        agenda1.setPaciente(paciente);
        agenda1.setEspecialidade(especialidade1);
        agenda1.setMedico(medico1);
        agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 27));
        agenda1.setHoraDaConsulta(LocalTime.of(14, 15));

        Agenda agenda2 = new Agenda();
        agenda2.setPaciente(paciente2);
        agenda2.setEspecialidade(especialidade4);
        agenda2.setMedico(medico2);
        agenda2.setDataDaConsulta(LocalDate.of(2022, 10, 12));
        agenda2.setHoraDaConsulta(LocalTime.of(9, 30));

        // exibir os dados da agenda, com o nome do paciente,
        // nome do médico, nome da especialidade, data e hora
        // do agendamento e plano de saúde utilizado.
        System.out.println("---------------------------------------");
        System.out.println("Agenda do(a) paciente: " + agenda1.getPaciente().getNome());
        System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
        System.out.println("Médico: " + agenda1.getMedico().getNome());
        System.out.println("Data: " + agenda1.getDataDaConsulta());
        System.out.println("Hora: " + agenda1.getHoraDaConsulta());
        System.out.println("Plano: " + agenda1.getPaciente().getPlanoDeSaude().getOperadora());

        System.out.println("----------------------------------------");
        System.out.println("Agenda do(a) paciente: " + agenda2.getPaciente().getNome());
        System.out.println("Especialidade: " + agenda2.getEspecialidade().getNome());
        System.out.println("Médico: " + agenda2.getMedico().getNome());
        System.out.println("Data: " + agenda2.getDataDaConsulta());
        System.out.println("Hora: " + agenda2.getHoraDaConsulta());
        System.out.println("Plano: " + agenda2.getPaciente().getPlanoDeSaude().getOperadora());
    }

}
