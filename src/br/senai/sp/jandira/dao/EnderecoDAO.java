package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Estados;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EnderecoDAO {

    /*
    Essa classe será responsável pela persistência de dados
    dos planos de saude, por exemplo, adicionar um novo plano de saude
    excluir um plano de saude, etc.
     */
    private static ArrayList<Endereco> enderecos = new ArrayList<>();
    
    // Criar uma lista inicial de especialidades
    public static void criarListaDeEnderecos() {
        Endereco e1 = new Endereco("rua dos remédios", "77", "parque dos patatis", "Jandira", "casa", Estados.SAO_PAULO, "05214562");
        Endereco e2 = new Endereco("rua das hortas", "90", "vila ré", "Itaquera", "casa", Estados.SAO_PAULO, "1041561");
        Endereco e3 = new Endereco("avenida dos palhaços", "54", "parque dos mineiros", "Carapicuíba", "casa", Estados.SAO_PAULO, "052114152");
        Endereco e4 = new Endereco("avenida do pequi", "777", "jardim florestal", "Betim", "apartamento 34", Estados.GOIAS, "91405155");
        
        enderecos.add(e1);
        enderecos.add(e2);
        enderecos.add(e3);
        enderecos.add(e4);
    }
    
}
