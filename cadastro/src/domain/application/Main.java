package domain.application;

import domain.model.cadastro.Cadastro;
import domain.model.cadastro.CadastroBuilder;
import domain.model.contato.Celular;
import domain.model.contato.Email;
import domain.model.contato.Telefone;
import domain.model.pessoal.Sexo;
import domain.model.profissional.PretensaoSalarial;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = CadastroBuilder
                .builder()
                .dadosPessoais("Julio Cesar", "111.111.111-21", LocalDate.now(), Sexo.MASCULINO)
                .dadosContato(new Email("teste@gmail.com"), new Telefone("11", "2234-0213"), new Celular("11", "97683-1111", Boolean.TRUE))
                .adicionarHabilidade("Esforçado")
                .adicionarHabilidade("Esforçado")
                .adicionarHabilidade("Proativo")
                .adicionarHabilidade("Conhecimetnos em Java")
                .dadosProfissional("Desempregado", "MJV School", BigDecimal.ZERO, Boolean.FALSE, new PretensaoSalarial(1500.0, 3000.0))
                .build();

        System.out.println("Nome: " + cadastro.getDadosPessoal().getNome());
        System.out.println("CPF: " + cadastro.getDadosPessoal().getCpf());
        System.out.println("Data nascimento: " + cadastro.getDadosPessoal().getDataNascimento());
        System.out.println("Sexo: " + cadastro.getDadosPessoal().getSexo());
        System.out.println("Email: " + cadastro.getDadosContato().getEmail());
        System.out.println("Telefone: " + cadastro.getDadosContato().getTelefone());
        System.out.println("Celular: " + cadastro.getDadosContato().getCelular().getNumero());
        System.out.println("Possui WhatsApp: " + cadastro.getDadosContato().getCelular().possuiWhatsApp());
        System.out.println("Profissao: " + cadastro.getDadosProfissional().getProfissao());
        System.out.println("Empresa: " + cadastro.getDadosProfissional().getEmpresa());
        System.out.println("Salario atual: " + cadastro.getDadosProfissional().getSalario());
        System.out.println("Está empregado: " + cadastro.getDadosProfissional().estaEmpregado());
        System.out.println("Valor mínimo: " + cadastro.getDadosProfissional().getPretensaoSalarial().getValorMinimo());
        System.out.println("Valor máximo: " + cadastro.getDadosProfissional().getPretensaoSalarial().getValorMaximo());
    }
}