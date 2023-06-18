package domain.application;

import domain.model.cadastro.Cadastro;
import domain.model.cadastro.CadastroBuilder;
import domain.model.contato.Celular;
import domain.model.contato.Email;
import domain.model.contato.Telefone;
import domain.model.pessoal.Sexo;
import domain.model.profissional.PretensaoSalarial;
import domain.service.ConversorService;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = CadastroBuilder
                .builder()
                .dadosPessoais("Julio Cesar", "111.111.111-21", LocalDate.now(), Sexo.MASCULINO)
                .dadosContato(new Email("teste@gmail.com"), new Telefone("11", "2234-0213"), new Celular("11", "97683-1111", Boolean.TRUE))
                .adicionarEndereco("rua teste", 999L, "Casa 3", "Centro", "São Paulo", "SP")
                .adicionarHabilidade("Esforçado")
                .adicionarHabilidade("Proativo")
                .adicionarHabilidade("Conhecimentos em Java")
                .adicionarHabilidade("Conhecimentos em Spring Boot")
                .dadosProfissional("Desenvolvedor", "MJV School", new BigDecimal("1487.32"), Boolean.FALSE, new PretensaoSalarial(1500.0, 3000.0))
                .build();

        ConversorService conversor = new ConversorService();
        conversor.toCSV(cadastro);
    }
}